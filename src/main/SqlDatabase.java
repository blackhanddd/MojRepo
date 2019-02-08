package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class SqlDatabase{
    Connection conn = null;             //nardimo standard database .. 
    
    public static Connection conectDB(){
        
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");  //povezava 
            System.out.println("Povezano z sql");       // to sm naredu zato da vidim ce dela oz ce se je pravilno connectalo 
            return conn;
        
        
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
    }
}
    
// uporabil sem jar rs2XML jar zato da displeya iz database v tabelo .... iskal sem najhitrejso resitev za to kar rabim .. 
//dodal sm rs2XML v knjiznico ... pobral sem sqlite Manager zato da naredim tam tabelo .. tabelo povezem ter jo displeyam z rs2XML