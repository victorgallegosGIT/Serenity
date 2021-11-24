package motoresdebusqueda.SistemaAcuerdos.pageobject.DB;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.findAll;

public class ConsultaUsuario {
    //4789101112

    public static void main(String[] args) {
        try {
            //

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://"+SERVER+":"+PORT+";databaseName="+DATABASE+ ";user=" +USER+ ";password=" +PASS+ ";";
            String ConexionURL = "jdbc:jtds:sqlserver://10.100.100.102:1033;encrypt=false;databaseName=GremialesStaFe_DB;user=gremiales_user;password=123456;";
            Connection myConn = DriverManager.getConnection(ConexionURL);
            System.out.println("conectado");


            Statement statement = myConn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM USUARIOS");
            while (rs.next()) {
                System.out.println(rs.getString("DNI") + " " + rs.getString("ID"));
                String Dni = "4789101112";
                if(Dni  == "4789101112" ){

                    String InstrucionSql2= "DELETE FROM USUARIOS WHERE DNI='4789101112'";
                    statement.executeUpdate(InstrucionSql2);
                    System.out.println("dato borrado");

                }
            }


        } catch (Exception e) {
            System.out.println("No conecta");
        }

    }
}
