/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package visao.recursos.utilitarios;

/**
 *
 * @author Thyago H. Pacher
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tempo {
    
    static final String PADRAOHORA = "HH:mm:ss";
    static final String PADRAODATA = "dd/MM/yyyy";
    Date   data;
    
    public Tempo(){
        data = new Date();
    }
    
    public String le_hora(){
        return new SimpleDateFormat(PADRAOHORA).format(data);
    }

    public String le_data(){
        return new SimpleDateFormat(PADRAODATA).format(data);
    }
}