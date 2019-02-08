
package main;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblBaza = new javax.swing.JLabel();
        jlblOCcenSTu = new javax.swing.JLabel();
        jlblUrniklbl = new javax.swing.JLabel();
        jpanelEmail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblBaza.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlblBaza.setForeground(new java.awt.Color(255, 255, 255));
        jlblBaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/classes.jpg"))); // NOI18N
        jlblBaza.setText("Baza Študentov");
        jlblBaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblBazaMouseClicked(evt);
            }
        });
        jPanel1.add(jlblBaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jlblOCcenSTu.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlblOCcenSTu.setForeground(new java.awt.Color(255, 255, 255));
        jlblOCcenSTu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/OceneStud.png"))); // NOI18N
        jlblOCcenSTu.setText("Ocene Študentov");
        jlblOCcenSTu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblOCcenSTuMousePressed(evt);
            }
        });
        jPanel1.add(jlblOCcenSTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jlblUrniklbl.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlblUrniklbl.setForeground(new java.awt.Color(255, 255, 255));
        jlblUrniklbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Apps-preferences-system-time-icon.png"))); // NOI18N
        jlblUrniklbl.setText("    Urnik");
        jlblUrniklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblUrniklblMousePressed(evt);
            }
        });
        jPanel1.add(jlblUrniklbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jpanelEmail.setBackground(new java.awt.Color(153, 0, 204));
        jpanelEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelEmailMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/emial.png"))); // NOI18N

        javax.swing.GroupLayout jpanelEmailLayout = new javax.swing.GroupLayout(jpanelEmail);
        jpanelEmail.setLayout(jpanelEmailLayout);
        jpanelEmailLayout.setHorizontalGroup(
            jpanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEmailLayout.setVerticalGroup(
            jpanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEmailLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jpanelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/School.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 323, 245));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblOCcenSTuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblOCcenSTuMousePressed
            new OceneStudenti().show();
    }//GEN-LAST:event_jlblOCcenSTuMousePressed

    private void jlblUrniklblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUrniklblMousePressed
                new Urnik1().show();
    }//GEN-LAST:event_jlblUrniklblMousePressed

    private void jpanelEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelEmailMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://mail.google.com/mail/u/0/#inbox"));   //povezava direkt na email(v tem primeru gmail v inbox)
        } catch (IOException e) {

        }
    }//GEN-LAST:event_jpanelEmailMouseClicked

    private void jlblBazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBazaMouseClicked
        new BazaStudentov().show();
    }//GEN-LAST:event_jlblBazaMouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblBaza;
    private javax.swing.JLabel jlblOCcenSTu;
    private javax.swing.JLabel jlblUrniklbl;
    private javax.swing.JPanel jpanelEmail;
    // End of variables declaration//GEN-END:variables
}
