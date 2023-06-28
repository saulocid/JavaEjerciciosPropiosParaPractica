/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

public class Ventana1 extends javax.swing.JFrame {

  public String B1;
  public String Text;
  public boolean igual = false;
  Servicios servicios = new Servicios("", 0, 0, "", "", "", "", "");

  public Ventana1() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      Panel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      OFFbtn = new javax.swing.JButton();
      Cbtn = new javax.swing.JButton();
      PorcentajeBtn = new javax.swing.JButton();
      DividirBtn = new javax.swing.JButton();
      SieteBtn = new javax.swing.JButton();
      OchoBtn = new javax.swing.JButton();
      NueveBtn = new javax.swing.JButton();
      ProductoBtn = new javax.swing.JButton();
      CuatroBtn = new javax.swing.JButton();
      CincoBtn = new javax.swing.JButton();
      SeisBtn = new javax.swing.JButton();
      RestaBtn = new javax.swing.JButton();
      UnoBtn = new javax.swing.JButton();
      DosBtn = new javax.swing.JButton();
      TresBtn = new javax.swing.JButton();
      SumaBtn = new javax.swing.JButton();
      CeroBtn = new javax.swing.JButton();
      PuntoBtn = new javax.swing.JButton();
      IgualBtn = new javax.swing.JButton();
      Panel2 = new javax.swing.JPanel();
      Pantalla = new javax.swing.JLabel();
      Panel3 = new javax.swing.JPanel();
      Pantalla1 = new javax.swing.JLabel();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(0, 0, 0));
      setBounds(new java.awt.Rectangle(0, 0, 372, 503));
      setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      setResizable(false);

      Panel1.setBackground(new java.awt.Color(90, 90, 120));

      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Java Frame Calculator - Femputadora 2023");

      OFFbtn.setBackground(new java.awt.Color(153, 0, 0));
      OFFbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      OFFbtn.setForeground(new java.awt.Color(0, 0, 0));
      OFFbtn.setText("OFF");
      OFFbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      OFFbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      OFFbtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            OFFbtnActionPerformed(evt);
         }
      });

      Cbtn.setBackground(new java.awt.Color(0, 0, 0));
      Cbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      Cbtn.setForeground(new java.awt.Color(0, 204, 204));
      Cbtn.setText("C");
      Cbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      Cbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      Cbtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            CbtnMouseClicked(evt);
         }
      });

      PorcentajeBtn.setBackground(new java.awt.Color(0, 0, 0));
      PorcentajeBtn.setForeground(new java.awt.Color(255, 255, 255));
      PorcentajeBtn.setText("%");
      PorcentajeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      PorcentajeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      PorcentajeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            PorcentajeBtnMouseClicked(evt);
         }
      });

      DividirBtn.setBackground(new java.awt.Color(0, 0, 0));
      DividirBtn.setForeground(new java.awt.Color(255, 255, 255));
      DividirBtn.setText("/");
      DividirBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      DividirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      DividirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            DividirBtnMouseClicked(evt);
         }
      });

      SieteBtn.setBackground(new java.awt.Color(255, 255, 255));
      SieteBtn.setForeground(new java.awt.Color(0, 0, 0));
      SieteBtn.setText("7");
      SieteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      SieteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      SieteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SieteBtnMouseClicked(evt);
         }
      });

      OchoBtn.setBackground(new java.awt.Color(255, 255, 255));
      OchoBtn.setForeground(new java.awt.Color(0, 0, 0));
      OchoBtn.setText("8");
      OchoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      OchoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      OchoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            OchoBtnMouseClicked(evt);
         }
      });

      NueveBtn.setBackground(new java.awt.Color(255, 255, 255));
      NueveBtn.setForeground(new java.awt.Color(0, 0, 0));
      NueveBtn.setText("9");
      NueveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      NueveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      NueveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            NueveBtnMouseClicked(evt);
         }
      });

      ProductoBtn.setBackground(new java.awt.Color(0, 0, 0));
      ProductoBtn.setForeground(new java.awt.Color(255, 255, 255));
      ProductoBtn.setText("*");
      ProductoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      ProductoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      ProductoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            ProductoBtnMouseClicked(evt);
         }
      });

      CuatroBtn.setBackground(new java.awt.Color(255, 255, 255));
      CuatroBtn.setForeground(new java.awt.Color(0, 0, 0));
      CuatroBtn.setText("4");
      CuatroBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      CuatroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      CuatroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            CuatroBtnMouseClicked(evt);
         }
      });

      CincoBtn.setBackground(new java.awt.Color(255, 255, 255));
      CincoBtn.setForeground(new java.awt.Color(0, 0, 0));
      CincoBtn.setText("5");
      CincoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      CincoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      CincoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            CincoBtnMouseClicked(evt);
         }
      });

      SeisBtn.setBackground(new java.awt.Color(255, 255, 255));
      SeisBtn.setForeground(new java.awt.Color(0, 0, 0));
      SeisBtn.setText("6");
      SeisBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      SeisBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      SeisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SeisBtnMouseClicked(evt);
         }
      });

      RestaBtn.setBackground(new java.awt.Color(0, 0, 0));
      RestaBtn.setForeground(new java.awt.Color(255, 255, 255));
      RestaBtn.setText("-");
      RestaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      RestaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      RestaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RestaBtnMouseClicked(evt);
         }
      });

      UnoBtn.setBackground(new java.awt.Color(255, 255, 255));
      UnoBtn.setForeground(new java.awt.Color(0, 0, 0));
      UnoBtn.setText("1");
      UnoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      UnoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      UnoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            UnoBtnMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            UnoBtnMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            UnoBtnMouseExited(evt);
         }
      });

      DosBtn.setBackground(new java.awt.Color(255, 255, 255));
      DosBtn.setForeground(new java.awt.Color(0, 0, 0));
      DosBtn.setText("2");
      DosBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      DosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      DosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            DosBtnMouseClicked(evt);
         }
      });

      TresBtn.setBackground(new java.awt.Color(255, 255, 255));
      TresBtn.setForeground(new java.awt.Color(0, 0, 0));
      TresBtn.setText("3");
      TresBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      TresBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      TresBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            TresBtnMouseClicked(evt);
         }
      });

      SumaBtn.setBackground(new java.awt.Color(255, 102, 51));
      SumaBtn.setForeground(new java.awt.Color(0, 0, 0));
      SumaBtn.setText("+");
      SumaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      SumaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      SumaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SumaBtnMouseClicked(evt);
         }
      });

      CeroBtn.setBackground(new java.awt.Color(255, 255, 255));
      CeroBtn.setForeground(new java.awt.Color(0, 0, 0));
      CeroBtn.setText("0");
      CeroBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      CeroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      CeroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            CeroBtnMouseClicked(evt);
         }
      });

      PuntoBtn.setBackground(new java.awt.Color(255, 255, 255));
      PuntoBtn.setForeground(new java.awt.Color(0, 0, 0));
      PuntoBtn.setText(".");
      PuntoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      PuntoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      PuntoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            PuntoBtnMouseClicked(evt);
         }
      });

      IgualBtn.setBackground(new java.awt.Color(255, 255, 255));
      IgualBtn.setForeground(new java.awt.Color(0, 0, 0));
      IgualBtn.setText("=");
      IgualBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      IgualBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      IgualBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            IgualBtnMouseClicked(evt);
         }
      });

      Panel2.setBackground(new java.awt.Color(0, 0, 0));

      Pantalla.setBackground(new java.awt.Color(255, 255, 255));
      Pantalla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      Pantalla.setForeground(new java.awt.Color(0, 204, 204));
      Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

      javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
      Panel2.setLayout(Panel2Layout);
      Panel2Layout.setHorizontalGroup(
         Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Pantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      Panel2Layout.setVerticalGroup(
         Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Pantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
      );

      Panel3.setBackground(new java.awt.Color(0, 0, 0));

      Pantalla1.setBackground(new java.awt.Color(255, 255, 255));
      Pantalla1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      Pantalla1.setForeground(new java.awt.Color(0, 204, 204));
      Pantalla1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

      javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
      Panel3.setLayout(Panel3Layout);
      Panel3Layout.setHorizontalGroup(
         Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(Panel3Layout.createSequentialGroup()
            .addComponent(Pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      Panel3Layout.setVerticalGroup(
         Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(Pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
      Panel1.setLayout(Panel1Layout);
      Panel1Layout.setHorizontalGroup(
         Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(Panel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(Panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                  .addComponent(CuatroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(CincoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(SeisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(RestaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                  .addComponent(SieteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(OchoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(NueveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(ProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                  .addComponent(OFFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(Cbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(PorcentajeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(DividirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(Panel1Layout.createSequentialGroup()
                  .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(UnoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(CeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PuntoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IgualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(18, 18, 18)
                  .addComponent(SumaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(20, Short.MAX_VALUE))
      );
      Panel1Layout.setVerticalGroup(
         Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(Panel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(PorcentajeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(Cbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(DividirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(OFFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(NueveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(OchoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(SieteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(ProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(CincoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(CuatroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(SeisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(RestaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(Panel1Layout.createSequentialGroup()
                  .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(DosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(UnoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(TresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(PuntoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(CeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(IgualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addComponent(SumaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(47, 47, 47))
      );

      jMenu1.setText("Créditos");
      jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
         public void menuCanceled(javax.swing.event.MenuEvent evt) {
         }
         public void menuDeselected(javax.swing.event.MenuEvent evt) {
         }
         public void menuSelected(javax.swing.event.MenuEvent evt) {
            jMenu1MenuSelected(evt);
         }
      });
      jMenuBar1.add(jMenu1);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

  private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
    Creditos c1 = new Creditos();
    c1.setVisible(true);
  }//GEN-LAST:event_jMenu1MenuSelected

  private void IgualBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IgualBtnMouseClicked

    if (igual == false) {
      if (servicios.getAcumMostrar().length() <= 28) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " = ");
      }
      servicios.setOperacion(" = ");
      servicios.asignacion(servicios.getMostrar(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getOperacion(), servicios.getAux());
      servicios.setNumeritos(servicios.Resultado(servicios.getAux(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getPorcentaje(), servicios.getOperacion(), servicios.getAux2()));
      Pantalla1.setText(String.valueOf(servicios.getNumeritos()));
      Pantalla.setText(servicios.getAcumMostrar());
      servicios.Reset();
    }

  }//GEN-LAST:event_IgualBtnMouseClicked

  private void PuntoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PuntoBtnMouseClicked

    if (servicios.validarBoton(servicios.getMostrar()) == true && servicios.getAcumMostrar().length() <= 28) {
      servicios.setMostrar(servicios.getMostrar() + ".");
      servicios.setAcumMostrar(servicios.getAcumMostrar() + ".");
    }

    Pantalla.setText(servicios.getAcumMostrar());
    Pantalla1.setText(servicios.getMostrar());
  }//GEN-LAST:event_PuntoBtnMouseClicked

  private void CeroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeroBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "0");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "0");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
    }
    igual = false;
  }//GEN-LAST:event_CeroBtnMouseClicked

  private void SumaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaBtnMouseClicked

    if (servicios.getOperacion().equals("")) {
      servicios.setOperacion(" + ");
      if (servicios.getAcumMostrar().length() <= 30) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " + ");
      }
      servicios.asignacion(servicios.getMostrar(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getOperacion(), servicios.getAux());
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    }
  }//GEN-LAST:event_SumaBtnMouseClicked

  private void TresBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "3");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "3");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_TresBtnMouseClicked

  private void DosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DosBtnMouseClicked

    servicios.setMostrar(servicios.getMostrar() + "2");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "2");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_DosBtnMouseClicked

  private void UnoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnoBtnMouseClicked

    servicios.setMostrar(servicios.getMostrar() + "1");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "1");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_UnoBtnMouseClicked

  private void RestaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaBtnMouseClicked
    if (servicios.getOperacion().equals("")) {
      servicios.setOperacion(" - ");
      if (servicios.getAcumMostrar().length() <= 30) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " - ");
      }
      servicios.asignacion(servicios.getMostrar(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getOperacion(), servicios.getAux());
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    }
  }//GEN-LAST:event_RestaBtnMouseClicked

  private void SeisBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeisBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "6");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "6");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_SeisBtnMouseClicked

  private void CincoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "5");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "5");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_CincoBtnMouseClicked

  private void CuatroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "4");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "4");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_CuatroBtnMouseClicked

  private void ProductoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBtnMouseClicked
    if (servicios.getOperacion().equals("")) {
      servicios.setOperacion(" * ");
      if (servicios.getAcumMostrar().length() <= 30) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " * ");
      }
      servicios.asignacion(servicios.getMostrar(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getOperacion(), servicios.getAux());
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    }
  }//GEN-LAST:event_ProductoBtnMouseClicked

  private void NueveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NueveBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "9");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "9");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_NueveBtnMouseClicked

  private void OchoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OchoBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "8");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "8");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_OchoBtnMouseClicked

  private void SieteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SieteBtnMouseClicked
    servicios.setMostrar(servicios.getMostrar() + "7");
    if (servicios.getAcumMostrar().length() <= 28) {
      servicios.setAcumMostrar(servicios.getAcumMostrar() + "7");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    } else {
      Pantalla.setText("ERROR ");
      Pantalla1.setText("Máximo de dígitos");
      servicios.Reset();
    }
    igual = false;
  }//GEN-LAST:event_SieteBtnMouseClicked

  private void DividirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DividirBtnMouseClicked
    if (servicios.getOperacion().equals("")) {
      servicios.setOperacion(" / ");
      if (servicios.getAcumMostrar().length() <= 28) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " / ");
        servicios.asignacion(servicios.getMostrar(), servicios.getNumeritos(), servicios.getNumeritos2(), servicios.getOperacion(), servicios.getAux());
        Pantalla.setText(servicios.getAcumMostrar());
        Pantalla1.setText(servicios.getMostrar());
      } else {
        Pantalla.setText("ERROR ");
        Pantalla1.setText("Máximo de dígitos");
        servicios.Reset();
      }

    }
  }//GEN-LAST:event_DividirBtnMouseClicked

  private void PorcentajeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PorcentajeBtnMouseClicked

    if (servicios.getPorcentaje().equals("")) {
      servicios.setMostrar(servicios.getMostrar() + " % ");
      if (servicios.getAcumMostrar().length() <= 28) {
        servicios.setAcumMostrar(servicios.getAcumMostrar() + " % ");
      }
      servicios.setPorcentaje(" % ");
      Pantalla.setText(servicios.getAcumMostrar());
      Pantalla1.setText(servicios.getMostrar());
    }
  }//GEN-LAST:event_PorcentajeBtnMouseClicked

  private void CbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbtnMouseClicked
    servicios.setMostrar("");
    servicios.setAcumMostrar("");
    servicios.setOperacion("");
    servicios.setAux("");
    servicios.setPorcentaje("");
    servicios.setNumeritos(0);
    servicios.setNumeritos2(0);
    Pantalla.setText(servicios.getAcumMostrar());
    Pantalla1.setText(servicios.getMostrar());
    igual = false;
  }//GEN-LAST:event_CbtnMouseClicked

  private void OFFbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFbtnActionPerformed
    System.exit(0);
  }//GEN-LAST:event_OFFbtnActionPerformed

   private void UnoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnoBtnMouseEntered
      UnoBtn.setBackground(Color.GRAY);
   }//GEN-LAST:event_UnoBtnMouseEntered

   private void UnoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnoBtnMouseExited
      UnoBtn.setBackground(Color.white);
   }//GEN-LAST:event_UnoBtnMouseExited

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new Ventana1().setVisible(true);
    });
  }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton Cbtn;
   private javax.swing.JButton CeroBtn;
   private javax.swing.JButton CincoBtn;
   private javax.swing.JButton CuatroBtn;
   private javax.swing.JButton DividirBtn;
   private javax.swing.JButton DosBtn;
   private javax.swing.JButton IgualBtn;
   private javax.swing.JButton NueveBtn;
   private javax.swing.JButton OFFbtn;
   private javax.swing.JButton OchoBtn;
   private javax.swing.JPanel Panel1;
   private javax.swing.JPanel Panel2;
   private javax.swing.JPanel Panel3;
   private javax.swing.JLabel Pantalla;
   private javax.swing.JLabel Pantalla1;
   private javax.swing.JButton PorcentajeBtn;
   private javax.swing.JButton ProductoBtn;
   private javax.swing.JButton PuntoBtn;
   private javax.swing.JButton RestaBtn;
   private javax.swing.JButton SeisBtn;
   private javax.swing.JButton SieteBtn;
   private javax.swing.JButton SumaBtn;
   private javax.swing.JButton TresBtn;
   private javax.swing.JButton UnoBtn;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenuBar jMenuBar1;
   // End of variables declaration//GEN-END:variables
}
