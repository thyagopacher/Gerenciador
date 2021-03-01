/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Thyago
 */
public class Relatorio {

    private static String url_servidor = "http://www.nksemijoias.com.br/SistemaJoias3/";
    
    public static void openReport(Connection conexao, String titulo, Map parametros, InputStream inputStream){
        try {         
            @SuppressWarnings("unchecked")
            JasperPrint  print  = JasperFillManager.fillReport(inputStream, parametros, conexao);
            viewReportFrame(titulo, print);
        }catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar relatório:\n" + ex);
        }
    }
    
    public static void openReport(Connection conexao, String titulo, Map parametros, JasperReport report){
        try {         
            @SuppressWarnings("unchecked")
            JasperPrint  print  = JasperFillManager.fillReport(report, parametros, conexao);
            viewReportFrame( titulo, print );
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar relatório:\n" + ex);
        }
    }   
    
    public static void openReport(Connection conexao, String titulo, Map parametros, URL report){
        try {         
            @SuppressWarnings("unchecked")
            JasperPrint  print  = JasperFillManager.fillReport(report.getPath(), parametros, conexao);
            viewReportFrame( titulo, print );
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar relatório:\n" + ex);
        }
    }   
    
    public static void openReport(Connection conexao, String titulo, Map parametros, File file){
        try {         
            @SuppressWarnings("unchecked")
            JasperPrint  print  = JasperFillManager.fillReport(file.getPath(), parametros, conexao);
            viewReportFrame( titulo, print );
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar relatório:\n" + ex);
        }
    }       
 
 
    public static void openReport2(JRResultSetDataSource jr, Map parametros, InputStream inputStream){
        try {         
            @SuppressWarnings("unchecked")
            JasperPrint  print  = JasperFillManager.fillReport(inputStream, parametros, jr);
            JasperViewer.viewReport(print, false); 
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar relatório:\n" + ex);
        }
    }          
    
    private static void viewReportFrame( String titulo, JasperPrint print ) {
        JRViewer viewer = new JRViewer( print );
        JFrame frameRelatorio = new JFrame( titulo );
        frameRelatorio.add( viewer, BorderLayout.CENTER );
        frameRelatorio.setSize( 500, 500 );
        frameRelatorio.setExtendedState( JFrame.MAXIMIZED_BOTH );
        frameRelatorio.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        frameRelatorio.setVisible( true );
}
    
    public static InputStream lerArquivoNet(String relatorio){
        InputStream is = null;
        try { 
            String urlString             = getUrl_servidor() + relatorio;  
            URL    url                   = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Request-Method", "GET"); 
            connection.setDoInput(true); 
            connection.setDoOutput(false);
            connection.connect();  
            is = connection.getInputStream();
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "URL mal formatada:\n" + ex);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro de IO ao acessar arquivo:\n" + ex);
        }
        return is;
    }

  public static String getUrl_servidor() {
    return url_servidor;
  }

  public static void setUrl_servidor(String aUrl_servidor) {
    url_servidor = aUrl_servidor;
  }

    private Relatorio() {
    }
}
