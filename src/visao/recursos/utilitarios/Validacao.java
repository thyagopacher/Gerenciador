/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Thyago
 */
public class Validacao {

    
    private static final Locale       BRASIL = new Locale ("pt", "BR");     
    private static final NumberFormat nf     = NumberFormat.getCurrencyInstance(BRASIL);  

    public static String formatMoeda(Double d){  
        return nf.format (d);         
    }
    
    public static Double formatToDouble(String s){         
        double retorno;
        try {  
            if(s.isEmpty()){
                s = "0,00";
            }             
            if(s.contains("R$ ")){
                retorno = (nf.parse (s)).doubleValue();
            }else{
                retorno = (nf.parse ("R$ " + s)).doubleValue();
            }
        } catch (ParseException ex) {
            retorno = 0;
        }
        return retorno;
    }    
    
    public Date convertePDate(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
        Date             dte = null;
        try {
            dte = sdf.parse(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Erro ocasionado por:\n" + ex);
        }
        return dte;
    }
    
    public String mascaraData(String formato, Date data){
        return new SimpleDateFormat(formato).format(data);
    }    
    
    public String ColocaVirgula(Double metro){
        return String.valueOf(metro).replace(".", ",") + "0";
    }  
 
    public Double TiraVirgula(String metro){
        if(metro.isEmpty()){
            return 0.0;
        }else{
            return Double.valueOf(metro.replace(",", "."));
        }
    }      

    public void mascaraInteiro(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (! ((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)|| (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) || (Character.isDigit(c)))) {
            evt.consume() ;
        }
    }
    
    public double arredondar(double valor, int casas, int ceilOrFloor) {  
        double arredondado = valor;  
        arredondado *= (Math.pow(10, casas));  
        if (ceilOrFloor == 0) {  
            arredondado = Math.ceil(arredondado);             
        } else {  
            arredondado = Math.floor(arredondado);  
        }  
        arredondado /= (Math.pow(10, casas));  
        return arredondado;  
    }     

    @SuppressWarnings("unchecked")
  public void enterPula(JFrame jf) {
// Colocando enter para pular de campo  
          HashSet conj = new HashSet(jf.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));   
          conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));  
          jf.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj); 
  }    
    
    public String verificaInternet(){
        String msg = "";
        try{  
            java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) new java.net.URL("http://www.google.com.br").openConnection();  
            httpConn.connect();  
            int x = httpConn.getResponseCode();  
            if(x != 200){  
                   msg = "Não conectado a internet";  
            }  
        }  
        catch(java.net.MalformedURLException urlmal){  
            msg = "Não conectado a internet por causa de:" + urlmal;
        }  
        catch(java.io.IOException ioexcp){  
            msg = "Não conectado a internet por causa de:" + ioexcp;
        }    
        return msg;
    }
    
}
