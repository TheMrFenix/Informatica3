import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Persona {
    private int id;
    private String nombre;
    private String papellido;
    private String sapellido;

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", papellido='" + papellido + '\'' +
                ", sapellido='" + sapellido + '\'' +
                '}';
    }

    public ArrayList<Persona> listarDatos(){
            Statement statement;
            ResultSet rows;
            Conexion con=new Conexion();
        ArrayList<Persona> listaPersona= new ArrayList<>();
        try{
            statement=con.conectar().createStatement();
            rows=statement.executeQuery("select * from persona");
            while (rows.next()){
                Persona p= new Persona();
                p.setId(rows.getInt("id"));
                p.setNombre(rows.getString("nombre"));
                p.setPapellido(rows.getString("papellido"));
                p.setSapellido(rows.getString("sapellido"));
                listaPersona.add(p);
            }
            con.desconectar();
            return listaPersona;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaPersona;
    }
    public String registrarPersona() {
        Conexion con=new Conexion();
        try {
            String sql = "INSERT INTO persona (nombre, papellido, sapellido) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = con.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.papellido);
            preparedStatement.setString(3, this.sapellido);
            int rowsInserted = preparedStatement.executeUpdate();
            con.desconectar();
            return "Filas insertadas: " + rowsInserted;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarPersona(){
        Conexion con=new Conexion();
        try {
            String sql = "UPDATE persona SET nombre=?, papellido=?, sapellido=? WHERE id=?";
            PreparedStatement preparedStatement = con.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.papellido);
            preparedStatement.setString(3, this.sapellido);
            preparedStatement.setInt(4, this.id);
            int rowsInserted = preparedStatement.executeUpdate();
            con.desconectar();
            return "Filas Actualizadas: " + rowsInserted;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarPersona(){
        Conexion con=new Conexion();
        try {
            String sql = "DELETE FROM persona WHERE id=?";
            PreparedStatement preparedStatement = con.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.id);
            int rowsInserted = preparedStatement.executeUpdate();
            con.desconectar();
            return "Filas Eliminadas: " + rowsInserted;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
