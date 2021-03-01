/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Formapagamento;

/**
 *
 * @author ThyagoHenrique
 */
public class FormaPagamentoPers {

    String  msg = "";
    Conexao cx;
    
    public FormaPagamentoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Formapagamento forma) {
        try{
            cx.conectar();
            cx.s.save(forma);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Formapagamento forma) {
        try{
            cx.conectar();
            cx.s.update(forma);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Formapagamento forma) {
        try{
            cx.conectar();
            cx.s.delete(forma);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Formapagamento procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Formapagamento where " + campo + " = '" + valor + "'";
        return (Formapagamento)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Formapagamento> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Formapagamento where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Formapagamento where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
