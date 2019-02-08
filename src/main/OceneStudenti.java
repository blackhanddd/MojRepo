
package main;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grzet
 */
public class OceneStudenti extends javax.swing.JFrame {

    
    public OceneStudenti() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbloS = new javax.swing.JLabel();
        jpanelZgokno = new javax.swing.JPanel();
        jlblStudIme1 = new javax.swing.JLabel();
        jlblStudIme2 = new javax.swing.JLabel();
        jlblStudIme3 = new javax.swing.JLabel();
        jpanelZgokno1 = new javax.swing.JPanel();
        jbtnClear = new javax.swing.JButton();
        jbtnPrintaj = new javax.swing.JButton();
        jbtnDodaj = new javax.swing.JButton();
        jtextOceneMat = new javax.swing.JTextField();
        jtxtIDS = new javax.swing.JTextField();
        jtextIME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jArea = new javax.swing.JTextArea();
        jlblStudIme4 = new javax.swing.JLabel();
        jlblStudIme5 = new javax.swing.JLabel();
        jtextPRII = new javax.swing.JTextField();
        jtextOceneSlo = new javax.swing.JTextField();
        jlblStudIme6 = new javax.swing.JLabel();
        jlblStudIme7 = new javax.swing.JLabel();
        jlblStudIme8 = new javax.swing.JLabel();
        jlblStudIme9 = new javax.swing.JLabel();
        jtextOceneInfo = new javax.swing.JTextField();
        jtextOceneAng = new javax.swing.JTextField();
        jtextOceneFi = new javax.swing.JTextField();
        jtextOceneWeb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbloS.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlbloS.setForeground(new java.awt.Color(255, 255, 255));
        jlbloS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/OceneStud.png"))); // NOI18N
        jlbloS.setText("Ocene Študentov");
        jlbloS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbloSMousePressed(evt);
            }
        });
        jPanel1.add(jlbloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jpanelZgokno.setBackground(new java.awt.Color(51, 102, 255));
        jpanelZgokno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        javax.swing.GroupLayout jpanelZgoknoLayout = new javax.swing.GroupLayout(jpanelZgokno);
        jpanelZgokno.setLayout(jpanelZgoknoLayout);
        jpanelZgoknoLayout.setHorizontalGroup(
            jpanelZgoknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1454, Short.MAX_VALUE)
        );
        jpanelZgoknoLayout.setVerticalGroup(
            jpanelZgoknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        jPanel1.add(jpanelZgokno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1470, 130));

        jlblStudIme1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme1.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme1.setText("ID ŠTUDENTA ");
        jPanel1.add(jlblStudIme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 40));

        jlblStudIme2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme2.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme2.setText("IME ŠTUDENTA ");
        jPanel1.add(jlblStudIme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 40));

        jlblStudIme3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme3.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme3.setText("OCENE IZ SLOVENŠČINE");
        jPanel1.add(jlblStudIme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 310, 40));

        jpanelZgokno1.setBackground(new java.awt.Color(51, 102, 255));
        jpanelZgokno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jbtnClear.setBackground(new java.awt.Color(0, 0, 0));
        jbtnClear.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClear.setText("IZBRIŠI");
        jbtnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtnPrintaj.setBackground(new java.awt.Color(0, 0, 0));
        jbtnPrintaj.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPrintaj.setText("PRINTAJ");
        jbtnPrintaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnPrintaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintajActionPerformed(evt);
            }
        });

        jbtnDodaj.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDodaj.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDodaj.setText("DODAJ");
        jbtnDodaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelZgokno1Layout = new javax.swing.GroupLayout(jpanelZgokno1);
        jpanelZgokno1.setLayout(jpanelZgokno1Layout);
        jpanelZgokno1Layout.setHorizontalGroup(
            jpanelZgokno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelZgokno1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jbtnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(jbtnPrintaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
        );
        jpanelZgokno1Layout.setVerticalGroup(
            jpanelZgokno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelZgokno1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpanelZgokno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrintaj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jpanelZgokno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 1460, -1));
        jPanel1.add(jtextOceneMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 230, 30));
        jPanel1.add(jtxtIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 230, -1));
        jPanel1.add(jtextIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 230, -1));

        jArea.setColumns(20);
        jArea.setRows(5);
        jScrollPane1.setViewportView(jArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 530, 470));

        jlblStudIme4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme4.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme4.setText("PRIIMEK ŠTUDENTA ");
        jPanel1.add(jlblStudIme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 250, 40));

        jlblStudIme5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme5.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme5.setText("OCENE IZ INFORMATIKE");
        jPanel1.add(jlblStudIme5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 310, 40));
        jPanel1.add(jtextPRII, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 230, -1));
        jPanel1.add(jtextOceneSlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 700, 230, 30));

        jlblStudIme6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme6.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme6.setText("OCENE IZ MATEMATIKE");
        jPanel1.add(jlblStudIme6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 310, 40));

        jlblStudIme7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme7.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme7.setText("OCENE IZ ANGLEŠČINE");
        jPanel1.add(jlblStudIme7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 310, 40));

        jlblStudIme8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme8.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme8.setText("OCENE IZ FIZIKE");
        jPanel1.add(jlblStudIme8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 310, 40));

        jlblStudIme9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblStudIme9.setForeground(new java.awt.Color(0, 0, 0));
        jlblStudIme9.setText("OCENE IZ WEB DESIGNA");
        jPanel1.add(jlblStudIme9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 310, 40));
        jPanel1.add(jtextOceneInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 230, 30));
        jPanel1.add(jtextOceneAng, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 230, 30));

        jtextOceneFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextOceneFiActionPerformed(evt);
            }
        });
        jPanel1.add(jtextOceneFi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 230, 30));
        jPanel1.add(jtextOceneWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlbloSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbloSMousePressed
       
    }//GEN-LAST:event_jlbloSMousePressed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jArea.setText("");                                  //damo text na nulo 
        
        jtxtIDS.setText("");
        jtextIME.setText("");
        jtextPRII.setText("");

        jtextOceneInfo.setText("");
        jtextOceneMat.setText("");
        jtextOceneAng.setText("");
        jtextOceneFi.setText("");
        jtextOceneWeb.setText("");
        jtextOceneSlo.setText("");

    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnPrintajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintajActionPerformed
        try {                                                                           //nardimo gumb print za printat povezano z java awt print.. 
            jArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(OceneStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPrintajActionPerformed

    private void jbtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajActionPerformed
        jArea.append("\t\t Ocene Študentov \n\n"+                                           //appendamo to da lahko displayamo v jAREa
               "ID ŠTUDENTA:   \t\t\t" + jtxtIDS.getText()+                                 // uredimo obliko da se lepo izpise v Jtextarea 
                "\n==========================================================\n " +             //mardimo gumb za dodajat 
                
                "IME ŠTUDENTA:\t\t\t" + jtextIME.getText() + "\n\n" +                       //nardimo tako da izpise v jtextarea po defaultu vse kar je nastavljeno npr IME ŠTUDENTA
                "PRIIMEK ŠTUDENTA:\t\t\t" + jtextPRII.getText() + "\n\n" +
                        "OCENE INFORMATIKE:\t\t\t" + jtextOceneInfo.getText() + "\n\n" +
                        "OCENE MATEMATIKE:\t\t\t" + jtextOceneMat.getText() + "\n\n" +
                        "OCENE ANGLEŠČINE:\t\t\t" + jtextOceneAng.getText() + "\n\n" +
                        "OCENE FIZIKE:      \t\t\t" + jtextOceneFi.getText() + "\n\n" +
                        "OCENE WEB DESIGNA:\t\t\t" + jtextOceneWeb.getText() + "\n\n" +
                        "OCENE SLOVENŠČINE:\t\t\t" + jtextOceneSlo.getText() + "\n\n" +
                "==========================================================="
                
                
                
                
                
                
                );
    }//GEN-LAST:event_jbtnDodajActionPerformed

    private void jtextOceneFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextOceneFiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextOceneFiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDodaj;
    private javax.swing.JButton jbtnPrintaj;
    private javax.swing.JLabel jlblStudIme1;
    private javax.swing.JLabel jlblStudIme2;
    private javax.swing.JLabel jlblStudIme3;
    private javax.swing.JLabel jlblStudIme4;
    private javax.swing.JLabel jlblStudIme5;
    private javax.swing.JLabel jlblStudIme6;
    private javax.swing.JLabel jlblStudIme7;
    private javax.swing.JLabel jlblStudIme8;
    private javax.swing.JLabel jlblStudIme9;
    private javax.swing.JLabel jlbloS;
    private javax.swing.JPanel jpanelZgokno;
    private javax.swing.JPanel jpanelZgokno1;
    private javax.swing.JTextField jtextIME;
    private javax.swing.JTextField jtextOceneAng;
    private javax.swing.JTextField jtextOceneFi;
    private javax.swing.JTextField jtextOceneInfo;
    private javax.swing.JTextField jtextOceneMat;
    private javax.swing.JTextField jtextOceneSlo;
    private javax.swing.JTextField jtextOceneWeb;
    private javax.swing.JTextField jtextPRII;
    private javax.swing.JTextField jtxtIDS;
    // End of variables declaration//GEN-END:variables
}
