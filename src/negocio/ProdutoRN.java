/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ProdutoPers;
import vo.Produto;

/**
 *
 * @author ThyagoHenrique
 */
public class ProdutoRN {
    
    ProdutoPers pp;
    
    public ProdutoRN(Conexao cx){
        pp = new ProdutoPers(cx);
    }
    
    public String valida(Produto p){
        String msg = "";
        if(p.getNome() == null || p.getNome().isEmpty()){
            msg += "Nome produto\n";
        }
        if(!msg.isEmpty()){
            msg = "Por favor preencher:" + msg;
        }
        return msg;
    }
    
    public String inserirObjeto(Produto produto){
        String msg = this.valida(produto);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(produto);
        }
    }
    
    public String atualizarObjeto(Produto produto){
        String msg = this.valida(produto);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(produto);
        }
    }   
    
    public String excluirObjeto(Produto produto){
        return pp.excluirObjeto(produto);
    } 
 
    public Produto procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Produto> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
