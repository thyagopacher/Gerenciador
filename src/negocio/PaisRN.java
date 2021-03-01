/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.PaisPers;
import vo.Pais;

/**
 *
 * @author ThyagoHenrique
 */
public class PaisRN {
    
    PaisPers pp;
    
    public PaisRN(Conexao cx){
        pp = new PaisPers(cx);
    }
    
    public String valida(Pais pais){
        String msg = "";
        if(pais.getNome() == null || pais.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Pais pais){
        String msg = this.valida(pais);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(pais);
        }
    }
    
    public String atualizarObjeto(Pais pais){
        String msg = this.valida(pais);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(pais);
        }
    }   
    
    public String excluirObjeto(Pais pais){
        if(valida(pais).isEmpty()){
            return pp.excluirObjeto(pais);
        }else{
            return "Erro ao excluir";
        }
    } 
 
    public Pais procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Pais> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
