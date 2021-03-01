/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.CargoPers;
import vo.Cargo;

/**
 *
 * @author ThyagoHenrique
 */
public class CargoRN {
    
    CargoPers pp;
    
    public CargoRN(Conexao cx){
        pp = new CargoPers(cx);
    }
    
    public String valida(Cargo cargo){
        String msg = "";
        if(cargo.getNome() == null || cargo.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Cargo cargo){
        String msg = this.valida(cargo);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(cargo);
        }
    }
    
    public String atualizarObjeto(Cargo cargo){
        String msg = this.valida(cargo);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(cargo);
        }
    }   
    
    public String excluirObjeto(Cargo cargo){
        return pp.excluirObjeto(cargo);
    } 
 
    public Cargo procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Cargo> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
