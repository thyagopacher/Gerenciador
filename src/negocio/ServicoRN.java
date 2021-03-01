/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ServicoPers;
import vo.Servico;

/**
 *
 * @author ThyagoHenrique
 */
public class ServicoRN {
    
    ServicoPers pp;
    
    public ServicoRN(Conexao cx){
        pp = new ServicoPers(cx);
    }
    
    public String valida(Servico servico){
        String msg = "";
        if(servico.getNome() == null || servico.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
            msg = "Por favor preencha os seguintes campos:\n" + msg;
        }
        return msg;
    }
    
    public String inserirObjeto(Servico servico){
        String msg = this.valida(servico);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(servico);
        }
    }
    
    public String atualizarObjeto(Servico servico){
        String msg = this.valida(servico);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(servico);
        }
    }   
    
    public String excluirObjeto(Servico servico){
        return pp.excluirObjeto(servico);
    } 
 
    public Servico procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Servico> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
