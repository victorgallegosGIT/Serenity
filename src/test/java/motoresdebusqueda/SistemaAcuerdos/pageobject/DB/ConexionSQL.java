package motoresdebusqueda.SistemaAcuerdos.pageobject.DB;
import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class ConexionSQL {
    public void DeleteUser() throws SQLException{
        try
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String url = "jdbc:sqlserver://"+SERVER+":"+PORT+";databaseName="+DATABASE+ ";user=" +USER+ ";password=" +PASS+ ";";
        String ConexionURL = "jdbc:jtds:sqlserver://10.100.100.102:1033;encrypt=false;databaseName=GremialesStaFe_DB;user=gremiales_user;password=123456;";
        Connection myConn = DriverManager.getConnection(ConexionURL);
        System.out.println("conectado");
        Statement statement = myConn.createStatement();
        String InstrucionSql = "declare @idUsuario int = (select id from usuarios where dni = 47891011) delete perfilesXusuarios where idUsuario = @idUsuario delete usuarios where id = @idUsuario";
        statement.executeUpdate(InstrucionSql);
        System.out.println("usuario borraado");
    } catch(
    Exception e)
    {
        System.out.println("No conecta");
    }
}

public void DeletePerfil() {
    try
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String url = "jdbc:sqlserver://"+SERVER+":"+PORT+";databaseName="+DATABASE+ ";user=" +USER+ ";password=" +PASS+ ";";
        String ConexionURL = "jdbc:jtds:sqlserver://10.100.100.102:1033;encrypt=false;databaseName=GremialesStaFe_DB;user=gremiales_user;password=123456;";
        Connection myConn = DriverManager.getConnection(ConexionURL);
        System.out.println("conectado");
        Statement statement = myConn.createStatement();
        String InstrucionSql = "declare @idPerfiles int = (select id from perfiles where codigo = 'zzzzz3' ) delete DelegacionesXPerfiles where idPerfil = @idPerfiles delete perfiles where id = @idPerfiles";
        statement.executeUpdate(InstrucionSql);
        System.out.println("Perfil borrado");
    } catch(
            Exception e)
    {
        System.out.println("No conecta");
    }

}

    public void DeleteTipoDeAcuerdo() {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url = "jdbc:sqlserver://"+SERVER+":"+PORT+";databaseName="+DATABASE+ ";user=" +USER+ ";password=" +PASS+ ";";
            String ConexionURL = "jdbc:jtds:sqlserver://10.100.100.102:1033;encrypt=false;databaseName=GremialesStaFe_DB;user=gremiales_user;password=123456;";
            Connection myConn = DriverManager.getConnection(ConexionURL);
            System.out.println("conectado");
            Statement statement = myConn.createStatement();
            String InstrucionSql = "declare @idPerfiles int = (declare @idPerfiles int = (select id from tiposAcuerdo where codigo = 'CoasZ' ) delete acuerdosGremiales where idRelacionado = @idPerfiles  ";
            statement.executeUpdate(InstrucionSql);
            System.out.println("Tipo de acuerdo borraado");
        } catch(
                Exception e)
        {
            System.out.println("No conecta");
        }

    }

}
//tipos de acuerdo
//declare @idPerfiles int = (select id from tiposAcuerdo where codigo = 'coasz4')
//
//delete acuerdosGremiales where id = @idPerfiles
//delete tiposAcuerdo where id = @idPerfiles


//delegacion
//declare @idPerfiles int = (select id from delegaciones where codigo = 'Deleg0')
//
//        delete DelegacionesXPerfiles where idDelegacion = @idPerfiles
//delete delegaciones where id = @idPerfiles