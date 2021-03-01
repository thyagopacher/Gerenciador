/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import persistencia.Conexao;
import persistencia.ImagemPers;
import vo.Imagem;

/**
 *
 * @author ThyagoHenrique
 */
public class ImagemRN {
    
    ImagemPers pp;
    
    public ImagemRN(Conexao cx){
        pp = new ImagemPers(cx);
    }
    
    public String valida(Imagem imagem){
        String msg = "";
        if(imagem.getNome() == null || imagem.getNome().isEmpty()){
            msg += "Nome em branco";
        }
        if(!msg.isEmpty()){
           msg = "Por favor preencher os seguintes campos:\n" + msg; 
        }
        return msg;
    }
    
    public String inserirObjeto(Imagem imagem){
        String msg = this.valida(imagem);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.inserirObjeto(imagem);
        }
    }
    
    public String atualizarObjeto(Imagem imagem){
        String msg = this.valida(imagem);
        if(msg != null && !msg.isEmpty()){
            return msg;
        }else{
            return pp.atualizarObjeto(imagem);
        }
    }   
    
    public String excluirObjeto(Imagem imagem){
        return pp.excluirObjeto(imagem);
    } 
 
    public Imagem procurarObjeto(String campo, String valor){
        return pp.procurarObjeto(campo, valor);
    }
    
    public List<Imagem> procuraLista(String campo, String valor, String condicao){
        return pp.procuraLista(campo, valor, condicao);
    }
}
