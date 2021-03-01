/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import static java.awt.EventQueue.invokeLater;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import static java.util.logging.Logger.getLogger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import negocio.ImagemRN;
import persistencia.Conexao;
import visao.recursos.utilitarios.Imagem;
import visao.recursos.utilitarios.Upload;

/**
 *
 * @author ThyagoHenrique
 */
public class JFImagem extends javax.swing.JFrame {

    Imagem      imgr    = new Imagem();
    vo.Imagem   imagem  = new vo.Imagem();
    String      msg     = "";
    Upload      upload;  
    ImagemRN    irn;
    Conexao     cx;
    /**
     * Creates new form JFCarregaTexto
     */
    public JFImagem() {
        initComponents();
        this.setSize(500, 500);
    }

    public JFImagem(Conexao cx) {
        initComponents();
        this.setSize(500, 500);
        this.cx = cx;
        irn     = new ImagemRN(cx);    
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lFoto = new javax.swing.JLabel();
        jpBarraProgresso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carrega imagem do computador");

        bAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/recursos/imagens/abrir.jpg"))); // NOI18N
        bAbrir.setText("Abrir");
        bAbrir.setToolTipText("Abrir o arquivo da imagem");
        bAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirActionPerformed(evt);
            }
        });

        jLabel1.setText("Para leitura de imagens");

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lFoto.setText("Imagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAbrir)
                        .addGap(32, 32, 32)
                        .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpBarraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpBarraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbrirActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Importar imagem"); 
            fc.showOpenDialog(this);

            File      file = fc.getSelectedFile();
            ImageIcon img  = new ImageIcon("" + file + "");
            Image     i    = imgr.redimensionarImagem(file, lFoto.getWidth(), lFoto.getHeight());
            img.setImage(i);

            lFoto.setText("");
            lFoto.setIcon(img);
            
            //pessoa.setFoto(im.imageToByte(i));
        } catch (HeadlessException ex) {
            showMessageDialog(null,"Erro com a gravação da imagem:\n" + ex, "ERRO ao carregar arquivo:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAbrirActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        jpBarraProgresso.setValue(WIDTH);//atualizar barra de progresso
        msg = irn.inserirObjeto(imagem);
        if(msg == null || msg.isEmpty()){
            msg = "Ação realizada com sucesso";
        }
        if(msg != null && !msg.isEmpty()){
            showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_bSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(JFImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFImagem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbrir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jpBarraProgresso;
    private javax.swing.JLabel lFoto;
    // End of variables declaration//GEN-END:variables
}