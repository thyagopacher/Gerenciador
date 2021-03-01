/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Itensvenda;

/**
 *
 * @author ThyagoHenrique
 */
public class ItensVendaPers {

    String  msg = "";
    Conexao cx;
    
    public ItensVendaPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Itensvenda itens) {
        try{
            cx.conectar();
            cx.s.save(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Itensvenda itens) {
        try{
            cx.conectar();
            cx.s.update(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Itensvenda itens) {
        try{
            cx.conectar();
            cx.s.delete(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Itensvenda procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Itensvenda where " + campo + " = '" + valor + "'";
        return (Itensvenda)cx.s.createQuery(query).list().iterator().next();
    }

    @SuppressWarnings("unchecked")
    public List<Itensvenda> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Itensvenda where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Itensvenda where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
