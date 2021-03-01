/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import org.hibernate.HibernateException;
/**
 *
 * @author ThyagoHenrique
 */
public class ComandoSqlPers {

    Conexao cx;
    String  msg = "";
    
    public ComandoSqlPers(Conexao cx) {
        this.cx = cx;
    }

    public String executarComando(String comando) {
        try{
            cx.conectar();
            cx.s.createSQLQuery(comando).executeUpdate();
        }catch(HibernateException ex){
            msg = "Erro ao executar comando causado por:\n" + ex;
        }
        return null;
    }

    
}
