/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ImpostoPers;
import vo.Imposto;

/**
 *
 * @author ThyagoHenrique
 */
public class ImpostoRN {
    
    ImpostoPers pp;
    
    public ImpostoRN(Conexao cx){
        pp = new ImpostoPers(cx);
    }
    
    public String valida(Imposto imposto){
        String msg = "";
        if(imposto.getNome() == null || imposto.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Imposto imposto){
        String msg = this.valida(imposto);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(imposto);
        }
    }
    
    public String atualizarObjeto(Imposto imposto){
        String msg = this.valida(imposto);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(imposto);
        }
    }   
    
    public String excluirObjeto(Imposto imposto){
        return pp.excluirObjeto(imposto);
    } 
 
    public Imposto procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Imposto> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
