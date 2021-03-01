/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Imagem;

/**
 *
 * @author ThyagoHenrique
 */
public class ImagemPers {

    String  msg = "";
    Conexao cx;
    
    public ImagemPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Imagem imagem) {
        try{
            cx.conectar();
            cx.s.save(imagem);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Imagem imagem) {
        try{
            cx.conectar();
            cx.s.update(imagem);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Imagem imagem) {
        try{
            cx.conectar();
            cx.s.delete(imagem);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Imagem procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Imagem where " + campo + " = '" + valor + "'";
        return (Imagem)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Imagem> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Imagem where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Imagem where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
