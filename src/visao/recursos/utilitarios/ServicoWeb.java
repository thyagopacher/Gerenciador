/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import javax.swing.JOptionPane;
import vo.Endereco;

/**
 *
 * @author ThyagoHenrique
 */
public class ServicoWeb {
    
    public Endereco procurarCEP(String cep){	
        try {
              Properties parameters = new Properties();
              parameters.setProperty("cep", cep);
              parameters.setProperty("formato", "xml");
              Iterator<Object> i       = parameters.keySet().iterator();
              int              counter = 0;
              StringBuilder    url1    = new StringBuilder(100);   
              while (i.hasNext()) {
                      String name  = (String) i.next();
                      String value = parameters.getProperty(name);
                      String url   = (++counter == 1 ? "?" : "&") + name + "=" + value;
                      url1.append(url);
              }
              HttpURLConnection connection = (HttpURLConnection) new URL("http://cep.republicavirtual.com.br/web_cep.php" + url1.toString()).openConnection();
              connection.setRequestProperty("Request-Method", "GET");
              connection.setDoInput(true);
              connection.setDoOutput(false);
              connection.connect();
              StringBuilder  newData   = new StringBuilder(100);
              BufferedReader br        = new BufferedReader(new InputStreamReader(connection.getInputStream()));
              String         s         = "";
              while (null != ((s = br.readLine()))){
                   newData.append(s);
              }
              XStream xstream = new XStream(new DomDriver());
              Annotations.configureAliases(xstream, Endereco.class);
              xstream.alias("webservicecep", Endereco.class);
              return (Endereco) xstream.fromXML(newData.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar CEP causado por:\n" + ex, "Erro:", JOptionPane.ERROR_MESSAGE);
        }  
        return null;
    }
}
