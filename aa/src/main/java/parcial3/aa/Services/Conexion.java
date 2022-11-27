package parcial3.aa.Services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    public Connection openDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=parcial3;"
            + "user=sa;"
            + "password=4321;"
            + "trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException E) {
            System.out.println("ERROR DE CONEXION xd");
            int x = 1;
        }
        catch(ClassNotFoundException cnfex){
            System.out.println("error en clase conexion");
            int x = 1;
        }
        return null;
    }    
}