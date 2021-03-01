/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Itenscompra;

/**
 *
 * @author ThyagoHenrique
 */
public class ItensCompraPers {

    String  msg = "";
    Conexao cx;
    
    public ItensCompraPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Itenscompra itens) {
        try{
            cx.conectar();
            cx.s.save(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Itenscompra itens) {
        try{
            cx.conectar();
            cx.s.update(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Itenscompra itens) {
        try{
            cx.conectar();
            cx.s.delete(itens);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Itenscompra procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Itenscompra where " + campo + " = '" + valor + "'";
        return (Itenscompra)cx.s.createQuery(query).list().iterator().next();
    }

    @SuppressWarnings("unchecked")
    public List<Itenscompra> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Itenscompra where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Itenscompra where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
   
     
}
