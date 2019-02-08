
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

public class BazaStudentov extends javax.swing.JFrame {
        Connection conn = null;                         //DB connection 
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        

    
    public BazaStudentov() {
        
        initComponents();
        conn = SqlDatabase.conectDB();
        updateTable();                      //rs2xml.. rabi zato da ti JTable izpise podatke iz database ,tiste ki smo jih vpisali 
     
         }
    private void updateTable(){
        String sql = "select * from Users";     
        try{
            pst = conn.prepareStatement(sql);
            rs  = pst.executeQuery();                               //query da prikaze in model tabele default od netbeensa 
            Tabela1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlStudentiMain = new javax.swing.JPanel();
        jlblsistemUpravljanja1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpnlStudentiMain.setBackground(new java.awt.Color(153, 0, 204));
        jpnlStudentiMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblsistemUpravljanja1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jlblsistemUpravljanja1.setForeground(new java.awt.Color(255, 255, 255));
        jlblsistemUpravljanja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/classes.jpg"))); // NOI18N
        jlblsistemUpravljanja1.setText("Vpogled v bazo Študentov ");
        jpnlStudentiMain.add(jlblsistemUpravljanja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        Tabela1.setBackground(new java.awt.Color(255, 255, 255));
        Tabela1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela1.setForeground(new java.awt.Color(0, 0, 0));
        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        Tabela1.setGridColor(new java.awt.Color(0, 0, 0));
        Tabela1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Tabela1);

        jpnlStudentiMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 1180, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlStudentiMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlStudentiMain, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1490, 984));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblsistemUpravljanja1;
    private javax.swing.JPanel jpnlStudentiMain;
    // End of variables declaration//GEN-END:variables
}
