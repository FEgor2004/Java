/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlinejction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author egor
 */
public class connection {
    Connection con;
    Statement st;
    
    public connection(String url, String user, String pass) {
         try {
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
    }
         catch(SQLException sqlexp) {
             sqlexp.printStackTrace();
         }
    }
    public ResultSet executeQuery(String query) {
        try {
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
           ex.printStackTrace();
           return null;
        }
    }
    public void executeUpdate(String query) {
        try {
            int rs = st.executeUpdate(query);
        }
        catch(SQLException sqlexp) {
            sqlexp.printStackTrace();
        }
    }
}
