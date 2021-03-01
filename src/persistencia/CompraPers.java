/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Compra;
/**
 *
 * @author ThyagoHenrique
 */
public class CompraPers {

    String  msg = "";
    Conexao cx;
    
    public CompraPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Compra compra) {
        try{
            cx.conectar();
            cx.s.save(compra);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Compra compra) {
        try{
            cx.conectar();
            cx.s.update(compra);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Compra compra) {
        try{
            cx.conectar();
            cx.s.delete(compra);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Compra procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Compra where " + campo + " = '" + valor + "'";
        return(Compra)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Compra> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Compra where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Compra where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
