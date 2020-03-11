
package com.learning.Interface;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JD_Service  implements IJD_Interface{

    String user="sa";
    String pass=" ";
    String url=" ";
    Connection conn;
    Statement st;
    ResultSet rs;
    boolean JDBC_Connection()
    {
        if(JDBC_Connection())
        {
                try {
            conn=DriverManager.getConnection(url,user,pass);
            st=conn.createStatement();
        
        } catch (SQLException ex) {
                    System.out.println("Error"+ex);
        }
        }
        return(false);
    } 
    public List<object> userdetails()
    {
            if(JDBC_Connection())
        {
                try {
            conn=DriverManager.getConnection(url,user,pass);
            st=conn.createStatement();
            String query="SELECT * FROM USERDETAILS ";
            rs=st.executeQuery(query);
                    System.out.println("Name /t Email");
                    while(rs.next())
                    {
                        System.out.println(rs.getString("Name")+ "\t" +rs.getString("Email"));
                    }
            
        } catch (SQLException ex) {
                    System.out.println("Details Adding Failed");
        }
        }
        return null;
    }
   
    public int adddetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int updatedetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int deletedetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getdetailbyid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
