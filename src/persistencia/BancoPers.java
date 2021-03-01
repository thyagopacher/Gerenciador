/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Banco;

/**
 *
 * @author ThyagoHenrique
 */
public class BancoPers {

    String  msg = "";
    Conexao cx;
    
    public BancoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Banco banco) {
        try{
            cx.conectar();
            cx.s.save(banco);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Banco banco) {
        try{
            cx.conectar();
            cx.s.update(banco);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Banco banco) {
        try{
            cx.conectar();
            cx.s.delete(banco);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Banco procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Banco where " + campo + " = '" + valor + "'";
        return (Banco)cx.s.createQuery(query).list().iterator().next();
    }

    @SuppressWarnings("unchecked")
    public List<Banco> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Banco where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Banco where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
