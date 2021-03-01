/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Ftp;

/**
 *
 * @author ThyagoHenrique
 */
public class FtpPers {

    String  msg = "";
    Conexao cx;
    
    public FtpPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Ftp ftp) {
        try{
            cx.conectar();
            cx.s.save(ftp);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Ftp ftp) {
        try{
            cx.conectar();
            cx.s.update(ftp);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Ftp ftp) {
        try{
            cx.conectar();
            cx.s.delete(ftp);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Ftp procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Ftp where " + campo + " = '" + valor + "'";
        return (Ftp)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Ftp> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Ftp where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Ftp where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
