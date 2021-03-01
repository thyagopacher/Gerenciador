/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Pais;

/**
 *
 * @author ThyagoHenrique
 */
public class PaisPers {

    String  msg = "";
    Conexao cx;
    
    public PaisPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Pais pais) {
        try{
            cx.conectar();
            cx.s.save(pais);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Pais pais) {
        try{
            cx.conectar();
            cx.s.update(pais);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Pais pais) {
        try{
            cx.conectar();
            cx.s.delete(pais);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Pais procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Pais where " + campo + " = '" + valor + "'";
        return (Pais)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Pais> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Pais where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Pais where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
