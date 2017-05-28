package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Scott on 5/23/2017.
 */
public class Connector {

    private Connection con;

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dial_a_song","root","password");
        }catch(Exception e){ System.out.println(e);}
        return con;
    }

}
