/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Thyago Pacher
 */
public class Imagem {

    
    public Image redimensionarImagem(File arquivo, int altura, int largura){

        try{
            //caso o arquivo venha vazio    
            if (!arquivo.exists()) {        
                JOptionPane.showMessageDialog(null, "Arquivo não existe");
            }    

            //caso o arquivo não possa ser lido
            if (!arquivo.canRead()) {
                JOptionPane.showMessageDialog(null, "Arquivo não pode ser lido");
            }     
            //realizando a redução da imagem
            return ImageIO.read(arquivo).getScaledInstance(largura, altura,BufferedImage.SCALE_SMOOTH);      

        }catch(HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, ex, "ERRO ao redimensionar imagem:", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public byte[] imageToByte(Image image) {       

        BufferedImage bi = new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);   
        Graphics bg = bi.getGraphics();   
        bg.drawImage(image, 0, 0, null);   
        bg.dispose();   

        ByteArrayOutputStream buff = new ByteArrayOutputStream();  
        try {     
            ImageIO.write(bi, "JPG", buff);     
        } catch (IOException ex) {     
            JOptionPane.showMessageDialog(null, ex, "ERRO:", JOptionPane.ERROR_MESSAGE);    
        }     
        return buff.toByteArray();      
    }

}