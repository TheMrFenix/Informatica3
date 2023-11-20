package proyecto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Lista_de_generos {
    private int id;
    private String tipo_de_genero;
    public Lista_de_generos() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo_de_genero() {
        return tipo_de_genero;
    }
    public void setTipo_de_genero(String tipo_de_genero) {
        this.tipo_de_genero = tipo_de_genero;
    }
    @Override
    public String toString() {
        return "lista_de_generos{" +
                "id=" + id +
                ", tipo_de_genero='" + tipo_de_genero + '\'' +
                '}';
    }
    public ArrayList<Lista_de_generos> listarListaG(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Lista_de_generos> listaG=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM lista_de_generos");
            while (rows.next()){
                Lista_de_generos ldg=new Lista_de_generos();
                ldg.setId(rows.getInt("id"));
                ldg.setTipo_de_genero(rows.getString("tipo_de_genero"));
                listaG.add(ldg);
            }
            conex.desconectar();
            return listaG;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaG;
    }
    public String registrarListaG(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO lista_de_generos (tipo_de_genero)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.tipo_de_genero);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarListaG(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE lista_de_generos SET tipo_de_genero=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.tipo_de_genero);
            preparedStatement.setInt(2, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarListaG(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM lista_de_generos WHERE id=?";
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
