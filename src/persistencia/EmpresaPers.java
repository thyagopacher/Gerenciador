/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Empresa;

/**
 *
 * @author ThyagoHenrique
 */
public class EmpresaPers {

    String  msg = "";
    Conexao cx;
    
    public EmpresaPers(Conexao cx) {
        this.cx = cx;
    }

    public String inserirObjeto(Empresa empresa) {
        try{
            cx.conectar();
            cx.s.save(empresa);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String atualizarObjeto(Empresa empresa) {
        try{
            cx.conectar();
            cx.s.update(empresa);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public String excluirObjeto(Empresa empresa) {
        try{
            cx.conectar();
            cx.s.delete(empresa);
            cx.desconectar();
        }catch(HibernateException ex){
            msg = "Erro causado por:\n" + ex;
        }
        return msg;
    }

    public Empresa procurarObjeto(String campo, String valor) {
        cx.conectar();
        String      query = "from Empresa where " + campo + " = '" + valor + "'";
        return(Empresa)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Empresa> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Empresa where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Empresa where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }
 
    
     
}
