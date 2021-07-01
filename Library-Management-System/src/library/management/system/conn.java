package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection c=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:XE","system","kannan");  
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
