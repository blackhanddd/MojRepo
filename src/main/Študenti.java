
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author grzet
 */

public class Študenti extends javax.swing.JFrame {
        Connection conn = null;                     //connection v DB
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        

    
    public Študenti() {
        
        initComponents();
        conn = SqlDatabase.conectDB();
        updateTable();                      //rs2xml.. rabi zato da ti JTable izpise podatke iz database ,tiste ki smo jih vpisali 
     
         }
    private void updateTable(){
        String sql = "select * from Users";     //updejta tako da se v zivo doda ..moramo se klicat metodo v jButton1ActionPerformed
        try{
            pst = conn.prepareStatement(sql);
            rs  = pst.executeQuery();
            Tabela1.setModel(DbUtils.resultSetToTableModel(rs));                        //standard izberi iz tabele ki sem jo poimenoval Users
        
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlStudentiMain = new javax.swing.JPanel();
        jlblsistemUpravljanja1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ime = new javax.swing.JTextField();
        Priimek = new javax.swing.JTextField();
        Naslov = new javax.swing.JTextField();
        Datum = new javax.swing.JTextField();
        Telefon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbutVnesi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        JbtnIzbrisi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnlimePriimek = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnlStudentiMain.setBackground(new java.awt.Color(153, 0, 204));
        jpnlStudentiMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblsistemUpravljanja1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlblsistemUpravljanja1.setForeground(new java.awt.Color(255, 255, 255));
        jlblsistemUpravljanja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Student-3-icon.png"))); // NOI18N
        jlblsistemUpravljanja1.setText("Študenti");
        jpnlStudentiMain.add(jlblsistemUpravljanja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 39, -1, -1));

        jLabel1.setText("Ime");
        jpnlStudentiMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 186, 69, 29));

        Ime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImeActionPerformed(evt);
            }
        });
        jpnlStudentiMain.add(Ime, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 188, 234, -1));

        Priimek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriimekActionPerformed(evt);
            }
        });
        jpnlStudentiMain.add(Priimek, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 223, 234, -1));

        Naslov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaslovActionPerformed(evt);
            }
        });
        jpnlStudentiMain.add(Naslov, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 258, 234, -1));
        jpnlStudentiMain.add(Datum, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 293, 234, -1));
        jpnlStudentiMain.add(Telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 328, 234, -1));

        jLabel8.setText("Priimek");
        jpnlStudentiMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 221, 69, 29));

        jLabel9.setText("Naslov");
        jpnlStudentiMain.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 256, 69, 29));

        jLabel10.setText("Telefon");
        jpnlStudentiMain.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 326, 69, 29));

        jLabel11.setText("Datum Rojstva");
        jpnlStudentiMain.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 291, 69, 29));

        jbutVnesi.setText("Vnesi");
        jbutVnesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutVnesiActionPerformed(evt);
            }
        });
        jpnlStudentiMain.add(jbutVnesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        Tabela1.setBackground(new java.awt.Color(255, 255, 255));
        Tabela1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela1.setForeground(new java.awt.Color(0, 0, 0));
        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela1.setGridColor(new java.awt.Color(0, 0, 0));
        Tabela1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Tabela1);

        jpnlStudentiMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 930, 280));

        JbtnIzbrisi.setText("Izbriši");
        JbtnIzbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnIzbrisiActionPerformed(evt);
            }
        });
        jpnlStudentiMain.add(JbtnIzbrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/School.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 323, 245));

        jpnlStudentiMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 880, 240));

        jpnlimePriimek.setBackground(new java.awt.Color(255, 255, 255));
        jpnlimePriimek.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jpnlimePriimekLayout = new javax.swing.GroupLayout(jpnlimePriimek);
        jpnlimePriimek.setLayout(jpnlimePriimekLayout);
        jpnlimePriimekLayout.setHorizontalGroup(
            jpnlimePriimekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1466, Short.MAX_VALUE)
        );
        jpnlimePriimekLayout.setVerticalGroup(
            jpnlimePriimekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnlimePriimek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlStudentiMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlStudentiMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlimePriimek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriimekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriimekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriimekActionPerformed

    private void NaslovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaslovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NaslovActionPerformed

    private void ImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImeActionPerformed

    private void jbutVnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutVnesiActionPerformed
        String sql = "INSERT INTO Users(Ime,Priimek,Naslov,Datum,Telefon) VALUES(?,?,?,?,?)";           //nacin za vpisovat
        try{
            pst = conn.prepareStatement(sql);                                                   //dodamo id in to kar pac nastavimo da se bo izpisalo .. prej pa nardimo tabelo v sqlite Browser
            pst.setString(1, Ime.getText());
            pst.setString(2, Priimek.getText());
            pst.setString(3, Naslov.getText());
            pst.setString(4, Datum.getText());
            pst.setString(5, Telefon.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Vnos potrjen");                                //samo pokaze da si potrdil vnos... 
            updateTable();      //direktno izpise v tabelo 

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jbutVnesiActionPerformed

    private void JbtnIzbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnIzbrisiActionPerformed
      int vrstica = Tabela1.getSelectedRow();                                       //dobimo model tabele kjer lahko zbrisemo vrstice.. 
      String cell = Tabela1.getModel().getValueAt(vrstica, 0).toString();   //izbrisemo vrstico v tabeli 
      String sql = "DELETE FROM Users where id = " + cell;                          //nacin za izbris 
      try{
          pst = conn.prepareStatement(sql);
          pst.execute();
           JOptionPane.showMessageDialog(null, "Vrstica je bila izbrisana");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
      
        updateTable();      //klicemo da updejta tabelo , zbrise v zivo vrstico 
    }//GEN-LAST:event_JbtnIzbrisiActionPerformed
       
    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Datum;
    private javax.swing.JTextField Ime;
    private javax.swing.JButton JbtnIzbrisi;
    private javax.swing.JTextField Naslov;
    private javax.swing.JTextField Priimek;
    private javax.swing.JTable Tabela1;
    private javax.swing.JTextField Telefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutVnesi;
    private javax.swing.JLabel jlblsistemUpravljanja1;
    private javax.swing.JPanel jpnlStudentiMain;
    private javax.swing.JPanel jpnlimePriimek;
    // End of variables declaration//GEN-END:variables
}
