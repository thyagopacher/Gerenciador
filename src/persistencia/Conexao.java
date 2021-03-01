/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Thyago
 */
public class Conexao {
    public SessionFactory f; 
    public Session        s;
    public Transaction    t;

    public void conectarBanco(){
        f = new Configuration().configure("persistencia/hibernate.cfg.xml").buildSessionFactory();
        s = f.openSession();
    }
    
    public void conectar(){
        t = s.beginTransaction();
    }
    
    public void desconectar(){
        t.commit();
        s.flush();  
    }
    
    public void desconectarTudo(){
        s.close();
    }    
    
}
