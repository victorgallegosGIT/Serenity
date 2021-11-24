package motoresdebusqueda.SistemaAcuerdos.pageobject.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try {
            //

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://"+SERVER+":"+PORT+";databaseName="+DATABASE+ ";user=" +USER+ ";password=" +PASS+ ";";
            String ConexionURL = "jdbc:jtds:sqlserver://10.100.100.102:1033;encrypt=false;databaseName=GremialesStaFe_DB;user=gremiales_user;password=123456;";
            Connection myConn = DriverManager.getConnection(ConexionURL);
            System.out.println("conectado");


            Statement statement = myConn.createStatement();

            ResultSet rs = statement.executeQuery("select DNI from usuarios where DNI=47891011");
            while (rs.next()) {
                System.out.println(rs.getString("DNI"));
            }



        } catch (Exception e) {
            System.out.println("No conecta");
        }
    }


}

