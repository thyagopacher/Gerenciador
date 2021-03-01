/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.BancoPers;
import vo.Banco;

/**
 *
 * @author ThyagoHenrique
 */
public class BancoRN {
    
    BancoPers pp;
    
    public BancoRN(Conexao cx){
        pp = new BancoPers(cx);
    }
    
    public String valida(Banco banco){
        String msg = "";
        if(banco.getNome() == null || banco.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Banco banco){
        String msg = this.valida(banco);  
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(banco);
        }
    }
    
    public String atualizarObjeto(Banco banco){
        String msg = this.valida(banco);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(banco);
        }
    }   
    
    public String excluirObjeto(Banco banco){
        return pp.excluirObjeto(banco);
    } 
 
    public Banco procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Banco> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }

}
