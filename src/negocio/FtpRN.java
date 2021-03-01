/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.FtpPers;
import vo.Ftp;

/**
 *
 * @author ThyagoHenrique
 */
public class FtpRN {
    
    FtpPers pp;
    
    public FtpRN(Conexao cx){
        pp = new FtpPers(cx);
    }
    
    public String valida(Ftp ftp){
        String msg = "";
        if(ftp.getHost() == null || ftp.getHost().isEmpty()){
            msg += "Host em branco\n";
        }
        if(ftp.getSenha() == null || ftp.getSenha().isEmpty()){
            msg += "Senha em branco\n";
        }
        if(ftp.getUsuario() == null || ftp.getUsuario().isEmpty()){
            msg += "Usuário em branco\n";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Ftp ftp){
        String msg = this.valida(ftp);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(ftp);
        }
    }
    
    public String atualizarObjeto(Ftp ftp){
        String msg = this.valida(ftp);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(ftp);
        }
    }   
    
    public String excluirObjeto(Ftp ftp){
        return pp.excluirObjeto(ftp);
    } 
 
    public Ftp procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Ftp> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
