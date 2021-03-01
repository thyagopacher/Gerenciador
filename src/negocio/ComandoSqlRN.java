/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import persistencia.Conexao;
import persistencia.CargoPers;
import persistencia.ComandoSqlPers;

/**
 *
 * @author ThyagoHenrique
 */
public class ComandoSqlRN {
    
    ComandoSqlPers pp;
    
    public ComandoSqlRN(Conexao cx){
        pp = new ComandoSqlPers(cx);
    }
     
    public String valida(String comando){
        String msg = "";
        if(comando == null || comando.isEmpty()){
            msg = "Comando em branco";
        }
        return msg;
    }
    
    public String executarComando(String comando){
        String res = this.valida(comando);
        if(res != null && !res.isEmpty()){
            return res;
        }else{
            return pp.executarComando(comando);
        }
    }
    
}
