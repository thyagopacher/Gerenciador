/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.FormaPagamentoPers;
import vo.Formapagamento;

/**
 *
 * @author ThyagoHenrique
 */
public class FormaPagamentoRN {
    
    FormaPagamentoPers pp;
    
    public FormaPagamentoRN(Conexao cx){
        pp = new FormaPagamentoPers(cx);
    }
    
    public String valida(Formapagamento forma){
        String msg = "";
        if(forma.getNome() == null || forma.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Formapagamento forma){
        String msg = this.valida(forma);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(forma);
        }
    }
    
    public String atualizarObjeto(Formapagamento forma){
        String msg = this.valida(forma);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(forma);
        }
    }   
    
    public String excluirObjeto(Formapagamento forma){
        return pp.excluirObjeto(forma);
    } 
 
    public Formapagamento procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Formapagamento> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
