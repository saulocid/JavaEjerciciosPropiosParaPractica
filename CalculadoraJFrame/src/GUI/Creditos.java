package GUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Creditos extends javax.swing.JFrame {

  public Creditos() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Panel_1 = new javax.swing.JPanel();
    creditos = new javax.swing.JLabel();
    SauloCid = new javax.swing.JLabel();
    SebaGutierrez = new javax.swing.JLabel();
    copy = new javax.swing.JLabel();
    SauloLinkedIn = new javax.swing.JButton();
    SauloInstagram = new javax.swing.JButton();
    SauloGitHub = new javax.swing.JButton();
    SebaLinkedIn = new javax.swing.JButton();
    SebaGitHub = new javax.swing.JButton();
    SebaFacebok = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setAlwaysOnTop(true);
    setBounds(new java.awt.Rectangle(0, 0, 0, 0));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setPreferredSize(new java.awt.Dimension(300, 275));
    setResizable(false);

    Panel_1.setBackground(new java.awt.Color(90, 90, 120));
    Panel_1.setPreferredSize(new java.awt.Dimension(275, 250));

    creditos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    creditos.setForeground(new java.awt.Color(0, 0, 204));
    creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    creditos.setText("CRÉDITOS");

    SauloCid.setForeground(new java.awt.Color(0, 0, 0));
    SauloCid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    SauloCid.setText("Saulo David Cid");

    SebaGutierrez.setForeground(new java.awt.Color(0, 0, 0));
    SebaGutierrez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    SebaGutierrez.setText("Sebastián Gutiérrez Alves");

    copy.setForeground(new java.awt.Color(102, 0, 0));
    copy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    copy.setText("Copy © 2023 Todos los derechos reservados");

    SauloLinkedIn.setBackground(new java.awt.Color(255, 255, 255));
    SauloLinkedIn.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\linkedin24x24png.png")); // NOI18N
    SauloLinkedIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SauloLinkedIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SauloLinkedIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SauloLinkedIn.setMinimumSize(new java.awt.Dimension(28, 28));
    SauloLinkedIn.setPreferredSize(new java.awt.Dimension(35, 35));
    SauloLinkedIn.setRolloverEnabled(true);
    SauloLinkedIn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SauloLinkedInMouseClicked(evt);
      }
    });

    SauloInstagram.setBackground(new java.awt.Color(255, 255, 255));
    SauloInstagram.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\isntagram24x24png.png")); // NOI18N
    SauloInstagram.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SauloInstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SauloInstagram.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SauloInstagram.setPreferredSize(new java.awt.Dimension(35, 35));
    SauloInstagram.setRolloverEnabled(true);
    SauloInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SauloInstagramMouseClicked(evt);
      }
    });

    SauloGitHub.setBackground(new java.awt.Color(255, 255, 255));
    SauloGitHub.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\github.png")); // NOI18N
    SauloGitHub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SauloGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SauloGitHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SauloGitHub.setPreferredSize(new java.awt.Dimension(35, 35));
    SauloGitHub.setRolloverEnabled(true);
    SauloGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SauloGitHubMouseClicked(evt);
      }
    });

    SebaLinkedIn.setBackground(new java.awt.Color(255, 255, 255));
    SebaLinkedIn.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\linkedin24x24png.png")); // NOI18N
    SebaLinkedIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SebaLinkedIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SebaLinkedIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SebaLinkedIn.setPreferredSize(new java.awt.Dimension(35, 35));
    SebaLinkedIn.setRolloverEnabled(true);
    SebaLinkedIn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SebaLinkedInMouseClicked(evt);
      }
    });

    SebaGitHub.setBackground(new java.awt.Color(255, 255, 255));
    SebaGitHub.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\github.png")); // NOI18N
    SebaGitHub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SebaGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SebaGitHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SebaGitHub.setPreferredSize(new java.awt.Dimension(35, 35));
    SebaGitHub.setRolloverEnabled(true);
    SebaGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SebaGitHubMouseClicked(evt);
      }
    });

    SebaFacebok.setBackground(new java.awt.Color(255, 255, 255));
    SebaFacebok.setIcon(new javax.swing.ImageIcon("D:\\Mis Documentos\\Imágenes\\Logos de Empresas\\facebook24x24png.png")); // NOI18N
    SebaFacebok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SebaFacebok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SebaFacebok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SebaFacebok.setPreferredSize(new java.awt.Dimension(35, 35));
    SebaFacebok.setRolloverEnabled(true);
    SebaFacebok.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        SebaFacebokMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout Panel_1Layout = new javax.swing.GroupLayout(Panel_1);
    Panel_1.setLayout(Panel_1Layout);
    Panel_1Layout.setHorizontalGroup(
      Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(Panel_1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SauloCid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SebaGutierrez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_1Layout.createSequentialGroup()
        .addContainerGap(86, Short.MAX_VALUE)
        .addGroup(Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addGroup(Panel_1Layout.createSequentialGroup()
            .addComponent(SebaLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(SebaGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(SebaFacebok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(Panel_1Layout.createSequentialGroup()
            .addComponent(SauloLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(SauloGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(SauloInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(87, 87, 87))
    );
    Panel_1Layout.setVerticalGroup(
      Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(Panel_1Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(SauloCid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(SauloLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SauloGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SauloInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(SebaGutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(Panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(SebaLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SebaGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SebaFacebok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(12, 12, 12)
        .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void SauloLinkedInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SauloLinkedInMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/saulociddev/"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
    //
  }//GEN-LAST:event_SauloLinkedInMouseClicked

  private void SauloInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SauloInstagramMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://www.instagram.com/saulophangery/"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_SauloInstagramMouseClicked

  private void SauloGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SauloGitHubMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://github.com/saulocid"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_SauloGitHubMouseClicked

  private void SebaLinkedInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SebaLinkedInMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://img.freepik.com/vector-gratis/proximamente-estilo-grunge-abstracto-salpicaduras-negras_1017-26690.jpg?w=740&t=st=1687483829~exp=1687484429~hmac=982451da6f957b60d68f33b27e2a0214511d991c0020a4ef4438c225f4319446"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_SebaLinkedInMouseClicked

  private void SebaGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SebaGitHubMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://github.com/loboseb"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_SebaGitHubMouseClicked

  private void SebaFacebokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SebaFacebokMouseClicked
    try {
      Desktop.getDesktop().browse(new URI("https://www.facebook.com/lobosebWTF"));
    } catch (URISyntaxException | IOException ex) {
      Logger.getLogger(Creditos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_SebaFacebokMouseClicked

  public static void main(String args[]) {
    
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    

    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Creditos().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel Panel_1;
  private javax.swing.JLabel SauloCid;
  private javax.swing.JButton SauloGitHub;
  private javax.swing.JButton SauloInstagram;
  private javax.swing.JButton SauloLinkedIn;
  private javax.swing.JButton SebaFacebok;
  private javax.swing.JButton SebaGitHub;
  private javax.swing.JLabel SebaGutierrez;
  private javax.swing.JButton SebaLinkedIn;
  private javax.swing.JLabel copy;
  private javax.swing.JLabel creditos;
  // End of variables declaration//GEN-END:variables
}
