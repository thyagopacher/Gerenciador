/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Venda;

/**
 *
 * @author ThyagoHenrique
 */
public class VendaPers {

    String  msg = "";
    Conexao cx;
    
    public VendaPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Venda venda) {
        try{
            cx.conectar();
            cx.s.save(venda);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Venda venda) {
        try{
            cx.conectar();
            cx.s.update(venda);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Venda venda) {
        try{
            cx.conectar();
            cx.s.delete(venda);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Venda procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Venda where " + campo + " = '" + valor + "'";
        return (Venda)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Venda> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Venda where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Venda where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
