/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Produto;

/**
 *
 * @author ThyagoHenrique
 */
public class ProdutoPers {

    String  msg = "";
    Conexao cx;
    
    public ProdutoPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Produto produto) {
        try{
            cx.conectar();
            cx.s.save(produto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Produto produto) {
        try{
            cx.conectar();
            cx.s.update(produto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Produto produto) {
        try{
            cx.conectar();
            cx.s.delete(produto);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Produto procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Produto where " + campo + " = '" + valor + "'";
        return (Produto)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Produto> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Produto where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Produto where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
