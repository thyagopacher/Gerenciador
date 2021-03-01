/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ItensVendaPers;
import vo.Itensvenda;

/**
 *
 * @author ThyagoHenrique
 */
public class ItensVendaRN {
    
    ItensVendaPers pp;
    
    public ItensVendaRN(Conexao cx){
        pp = new ItensVendaPers(cx);
    }
    
    public String valida(Itensvenda itens){
        String msg = "";
        if(itens.getProduto() == null || itens.getProduto().getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Itensvenda itens){
        String msg = this.valida(itens);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(itens);
        }
    }
    
    public String atualizarObjeto(Itensvenda itens){
        String msg = this.valida(itens);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(itens);
        }
    }   
    
    public String excluirObjeto(Itensvenda itens){
        return pp.excluirObjeto(itens);
    } 
 
    public Itensvenda procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Itensvenda> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
