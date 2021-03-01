/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Servico;

/**
 *
 * @author ThyagoHenrique
 */
public class ServicoPers {

    String  msg = "";
    Conexao cx;
    
    public ServicoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Servico servico) {
        try{
            cx.conectar();
            cx.s.save(servico);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Servico servico) {
        try{
            cx.conectar();
            cx.s.update(servico);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Servico servico) {
        try{
            cx.conectar();
            cx.s.delete(servico);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Servico procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Servico where " + campo + " = '" + valor + "'";
        return (Servico)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Servico> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Servico where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Servico where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
