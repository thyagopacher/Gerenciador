/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ItensCompraPers;
import vo.Itenscompra;

/**
 *
 * @author ThyagoHenrique
 */
public class ItensCompraRN {
    
    ItensCompraPers pp;
    
    public ItensCompraRN(Conexao cx){
        pp = new ItensCompraPers(cx);
    }
    
    public String valida(Itenscompra itens){
        String msg = "";
        if(itens.getProduto() == null || itens.getProduto().getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Itenscompra itens){
        String msg = this.valida(itens);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(itens);
        }
    }
    
    public String atualizarObjeto(Itenscompra itens){
        String msg = this.valida(itens);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(itens);
        }
    }   
    
    public String excluirObjeto(Itenscompra itens){
        return pp.excluirObjeto(itens);
    } 
 
    public Itenscompra procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Itenscompra> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
