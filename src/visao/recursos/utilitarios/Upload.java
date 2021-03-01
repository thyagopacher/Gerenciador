/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import java.io.FileInputStream;  
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPClient;  
import org.apache.commons.net.ftp.FTPReply;
  
  
public class Upload {  
     
    String host  = ""; 
    String login = "";
    String senha = "";
    
    public Upload(String host, String login, String senha){
         this.host  = host;
         this.login = login;
         this.senha = senha;
    }

    public boolean enviarArquivo(String nome, String diretorio, String nomefinal){  
        boolean res = false; 
        try (InputStream arqEnviar = new FileInputStream(nome)) {  
               FTPClient ftp = new FTPClient();  
               ftp.connect(host);  
               if( FTPReply.isPositiveCompletion( ftp.getReplyCode() ) ) { 
                    ftp.login(login, senha);  
                    ftp.enterLocalPassiveMode();
                    ftp.makeDirectory(diretorio);  
                    ftp.changeWorkingDirectory(diretorio);  
                    if(nome.endsWith(".txt") || nome.endsWith(".doc") || nome.endsWith(".docx")) { 
                         ftp.setFileType( FTPClient.ASCII_FILE_TYPE ); 
                    }else if(nome.endsWith(".jpg") || nome.endsWith(".png") || nome.endsWith(".gif") ||  nome.endsWith(".jpeg")){ 
                         ftp.setFileType( FTPClient.BINARY_FILE_TYPE ); 
                    }else{ 
                         ftp.setFileType( FTPClient.ASCII_FILE_TYPE ); 
                    } 
                    res = ftp.storeFile (nomefinal, arqEnviar);                         
               } else { 
                    ftp.disconnect(); 
                    JOptionPane.showMessageDialog(null, "Conexão recusada"); 
               }                    
        }catch (IOException ex) {  
               res = false;  
               JOptionPane.showMessageDialog(null, "Erro causado por:\n" + ex);
        } 
        return res;
    }  

    public void excluirArquivo(String nome) {
        try {  
                FTPClient ftp = new FTPClient();  
                ftp.connect(host);  
                if( FTPReply.isPositiveCompletion( ftp.getReplyCode() ) ) { 
                    ftp.login(login, senha);  
                    ftp.enterLocalPassiveMode();
                    ftp.deleteFile(nome); 
                } else { 
                    ftp.disconnect(); 
                    JOptionPane.showMessageDialog(null, "Conexão recusada"); 
                }                    
        }catch (IOException e) {  
            JOptionPane.showMessageDialog(null,"Erro ao fazer upload, causado por:\n" + e);  
        }           
    }
}  