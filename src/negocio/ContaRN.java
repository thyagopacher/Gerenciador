/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ContaPers;
import vo.Conta;

/**
 *
 * @author ThyagoHenrique
 */
public class ContaRN {
    
    ContaPers pp;
    
    public ContaRN(Conexao cx){
        pp = new ContaPers(cx);
    }
    
    public String valida(Conta conta){
        String msg = "";

        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Conta conta){
        String msg = this.valida(conta);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(conta);
        }
    }
    
    public String atualizarObjeto(Conta conta){
        String msg = this.valida(conta);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(conta);
        }
    }   
    
    public String excluirObjeto(Conta conta){
        return pp.excluirObjeto(conta);
    } 
 
    public Conta procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Conta> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
