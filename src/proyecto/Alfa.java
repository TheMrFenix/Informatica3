package proyecto;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
public class Alfa {
    private int id;
    private String numero;
    public Alfa() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Alfa{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                '}';
    }
    public ArrayList<Alfa> listarAlfa(){
        ResultSet rows;
        Statement statement;
        Conexion conex=new Conexion();
        ArrayList<Alfa> listaAlfa=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM alfa");
            while (rows.next()){
                Alfa al=new Alfa();
                al.setId(rows.getInt("id"));
                al.setNumero(rows.getString("numero"));
                listaAlfa.add(al);
            }
            conex.desconectar();
            return listaAlfa;
        }catch (Exception e){
            System.out.println("Error registro");
        }
        return listaAlfa;
    }
    public String registroAlfa(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO alfa(numero) VALUES(?)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.numero);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarAlfa(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE alfa SET nombre=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.numero);
            preparedStatement.setInt(2, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarAlfa(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM alfa WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Eliminadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
