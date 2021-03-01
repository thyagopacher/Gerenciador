/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;
import java.util.List;
import persistencia.CompraPers;
import persistencia.Conexao;
import vo.Compra;

/**
 *
 * @author ThyagoHenrique
 */
public class CompraRN {
    
    CompraPers pp;
    
    public CompraRN(Conexao cx){
        pp = new CompraPers(cx);
    }
    
    public String valida(Compra compra){
        String msg = "";
        if(compra.getDtcompra() == null){
            compra.setDtcompra(new Date());
        }
        if(compra.getPessoa() == null || compra.getPessoa().getNome() == null){
            msg += "Pessoa em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Compra compra){
        String msg = this.valida(compra);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(compra);
        }
    }
    
    public String atualizarObjeto(Compra compra){
        String msg = this.valida(compra);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(compra);
        }
    }   
    
    public String excluirObjeto(Compra compra){
        return pp.excluirObjeto(compra);
    } 
 
    public Compra procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Compra> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
