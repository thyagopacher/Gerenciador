/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.PessoaPers;
import vo.Pessoa;

/**
 *
 * @author ThyagoHenrique
 */
public class PessoaRN {
    
    PessoaPers pp;
    
    public PessoaRN(Conexao cx){
        pp = new PessoaPers(cx);
    }
    
public boolean valida_cpf(String strCpf)    {          
     int     d1, d2, digito1, digito2, resto, digitoCPF;          
     d1 = d2 = 0;                 
     for (int nCount = 1; nCount < strCpf.length() -1; nCount++){            
         digitoCPF = Integer.parseInt(strCpf.substring(nCount -1,nCount));             
         d1 += ( 11 - nCount ) * digitoCPF;             
         d2 += ( 12 - nCount ) * digitoCPF;          
     }          
     resto = (d1 % 11);          
     if (resto < 2) {
        digito1 = 0;
     }else {
        digito1 = 11 - resto;
     }          
     d2 += 2 * digito1;          
     resto = (d2 % 11);          
     if (resto < 2) {
        digito2 = 0;
     }else{
        digito2 = 11 - resto;
     }          
     return strCpf.substring(strCpf.length() - 2, strCpf.length()).equals(String.valueOf(digito1) + String.valueOf(digito2));       
 }
    
    public String valida(Pessoa pessoa){
        String msg = "";
        if(pessoa.getNome() == null || pessoa.getNome().isEmpty()){
            msg += "Nome em branco";
        }       
        if(pessoa.getCpf() == null || pessoa.getCpf().isEmpty()){
            msg += "CPF em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Pessoa pessoa){
        String msg = this.valida(pessoa);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            pp.inserirObjeto(pessoa);
        }
        return null;
    }
    
    public String atualizarObjeto(Pessoa pessoa){
        String msg = this.valida(pessoa);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            pp.atualizarObjeto(pessoa);
        }
        return null;
    }   
    
    public String excluirObjeto(Pessoa pessoa){
        pp.excluirObjeto(pessoa);
        return null;
    } 
 
    public Pessoa procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Pessoa> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }

    public List<Pessoa> procuraTudo(){
        return pp.procuraTudo();
    }
    
    public Pessoa validaLogin(String login, String senha) {
        return pp.validaLogin(login, senha);
    }
}
