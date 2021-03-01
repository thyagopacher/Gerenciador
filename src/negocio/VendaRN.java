/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.VendaPers;
import vo.Venda;

/**
 *
 * @author ThyagoHenrique
 */
public class VendaRN {
    
    VendaPers pp;
    
    public VendaRN(Conexao cx){
        pp = new VendaPers(cx);
    }
    
    public String valida(Venda venda){
        String msg = "";
        if(venda.getPessoa() == null || venda.getPessoa().getNome() == null){
            msg += "Cliente em branco";
        }
        if(venda.getDtvenda() == null){
            msg += "\nDt. de venda em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Venda venda){
        String msg = this.valida(venda);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(venda);
        }
    }
    
    public String atualizarObjeto(Venda venda){
        String msg = this.valida(venda);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(venda);
        }
    }   
    
    public String excluirObjeto(Venda venda){
        return pp.excluirObjeto(venda);
    } 
 
    public Venda procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Venda> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
