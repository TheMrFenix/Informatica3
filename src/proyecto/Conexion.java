package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    String url="jdbc:mysql://localhost:3306/";
    String db="mydb";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection jdbc;
    public Conexion(){}
    public Connection conectar(){
        try {
            Class.forName(driver);
            jdbc=DriverManager.getConnection(url+db,user,password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("No se conecto a la base de datos "+e);
        }
        return jdbc;
    }
    public void desconectar(){
        try {
            jdbc.close();
        }catch (SQLException e){
            System.out.println("Error al finalizar la conexion "+e);
        }
    }
}
