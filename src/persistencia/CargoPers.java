/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Cargo;

/**
 *
 * @author ThyagoHenrique
 */
public class CargoPers {

    String  msg = "";
    Conexao cx;
    
    public CargoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Cargo cargo) {
        try{
            cx.conectar();
            cx.s.save(cargo);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Cargo cargo) {
        try{
            cx.conectar();
            cx.s.update(cargo);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Cargo cargo) {
        try{
            cx.conectar();
            cx.s.delete(cargo);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Cargo procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Cargo where " + campo + " = '" + valor + "'";
        return (Cargo)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Cargo> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Cargo where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Cargo where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
