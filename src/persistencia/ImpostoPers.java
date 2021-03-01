/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Imposto;

/**
 *
 * @author ThyagoHenrique
 */
public class ImpostoPers {

    String  msg = "";
    Conexao cx;
    
    public ImpostoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Imposto imposto) {
        try{
            cx.conectar();
            cx.s.save(imposto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Imposto imposto) {
        try{
            cx.conectar();
            cx.s.update(imposto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Imposto imposto) {
        try{
            cx.conectar();
            cx.s.delete(imposto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Imposto procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Imposto where " + campo + " = '" + valor + "'";
        return (Imposto)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Imposto> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Imposto where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Imposto where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
