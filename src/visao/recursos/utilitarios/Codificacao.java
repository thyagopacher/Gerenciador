/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

/**
 *
 * @author ThyagoHenrique
 */
public class Codificacao {
    
    public String encode(String texto){
        if(texto != null && !texto.isEmpty()){
            texto = texto.replace("Ã¡","á").replace("","").replace("?","").replace("Ã©","é").replace("Ã­","í").replace("Ã³","ó").replace("Ãº","ú").replace("Ã§","ç").replace("Ã£","ã").replace("Âº","º").replace("Ãµ","õ"); 
        }
        return texto;
    }
}
