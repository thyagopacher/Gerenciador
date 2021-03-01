/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Conta;

/**
 *
 * @author ThyagoHenrique
 */
public class ContaPers {

    String  msg = "";
    Conexao cx;
    
    public ContaPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Conta conta) {
        try{
            cx.conectar();
            cx.s.save(conta);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Conta conta) {
        try{
            cx.conectar();
            cx.s.update(conta);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Conta conta) {
        try{
            cx.conectar();
            cx.s.delete(conta);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Conta procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Conta where " + campo + " = '" + valor + "'";
        return (Conta)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Conta> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Conta where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Conta where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
