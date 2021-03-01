/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import vo.Pessoa;

/**
 *
 * @author ThyagoHenrique
 */
public class PessoaPers {

    String  msg = "";
    Conexao cx;
    
    public PessoaPers(Conexao cx) {
        this.cx = cx;
    }

    public void inserirObjeto(Pessoa pessoa) {
        cx.conectar();
        cx.s.save(pessoa);
        cx.desconectar();
    }

    public void atualizarObjeto(Pessoa pessoa) {
        cx.conectar();
        cx.s.update(pessoa);
        cx.desconectar();
    }

    public void excluirObjeto(Pessoa pessoa) {
        cx.conectar();
        cx.s.delete(pessoa);
        cx.desconectar();
    }

    public Pessoa procurarObjeto(String campo, String valor) {
        cx.conectar();
        String query = "from Pessoa where " + campo + " = '" + valor + "'";
        return (Pessoa)cx.s.createQuery(query).list().iterator().next();
    }

    public List<Pessoa> procuraLista(String campo, String valor, String condicao) {
        cx.conectar();
        String query = "";
        if(condicao.equals("parcial")){
            query = "from Pessoa where " + campo + " like '%" + valor + "%' order by " + campo + " ASC";
        }else{
            if(condicao.equals("exata")){
                query = "from Pessoa where " + campo + " = '" + valor + "' order by " + campo + " ASC";
            }
        }
        return cx.s.createQuery(query).list();
    }

    @SuppressWarnings("unchecked")
    public List<Pessoa> procuraTudo() {
        cx.conectar();
        return cx.s.getNamedQuery("procuraTodasPessoas").list();
    }    
    
    @SuppressWarnings("unchecked")
    public Pessoa validaLogin(String login, String senha) {
        cx.conectar();
        String query = "from Pessoa where login = '" + login + "' and senha = '" + senha + "'";
        return (Pessoa)cx.s.createQuery(query).list().iterator().next();
    }
 
    
     
}
