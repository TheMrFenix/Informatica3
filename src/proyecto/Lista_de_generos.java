package proyecto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Lista_de_generos {
    private int id;
    private String tipo_de_genero;
    private int cantidad_de_juegos;
    private int accion_id;
    private int aventura_id;
    private int estrategia_id;
    private int rol_id;
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
    public int getCantidad_de_juegos() {
        return cantidad_de_juegos;
    }
    public void setCantidad_de_juegos(int cantidad_de_juegos) {
        this.cantidad_de_juegos = cantidad_de_juegos;
    }
    public int getAccion_id() {
        return accion_id;
    }
    public void setAccion_id(int accion_id) {
        this.accion_id = accion_id;
    }
    public int getAventura_id() {
        return aventura_id;
    }
    public void setAventura_id(int aventura_id) {
        this.aventura_id = aventura_id;
    }
    public int getEstrategia_id() {
        return estrategia_id;
    }
    public void setEstrategia_id(int estrategia_id) {
        this.estrategia_id = estrategia_id;
    }
    public int getRol_id() {
        return rol_id;
    }
    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    @Override
    public String toString() {
        return "Lista_de_generos{" +
                "id=" + id +
                ", tipo_de_genero='" + tipo_de_genero + '\'' +
                ", cantidad_de_juegos=" + cantidad_de_juegos +
                ", accion_id=" + accion_id +
                ", aventura_id=" + aventura_id +
                ", estrategia_id=" + estrategia_id +
                ", rol_id=" + rol_id +
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
                ldg.setCantidad_de_juegos(rows.getInt("cantidad_de_juegos"));
                ldg.setAccion_id(rows.getInt("accion_id"));
                ldg.setAventura_id(rows.getInt("aventura_id"));
                ldg.setEstrategia_id(rows.getInt("estrategia_id"));
                ldg.setRol_id(rows.getInt("rol_id"));
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
            String sql="INSERT INTO lista_de_generos (tipo_de_genero, cantidad_de_juegos) VALUES(?,?)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.tipo_de_genero);
            preparedStatement.setInt(2, this.cantidad_de_juegos);
            preparedStatement.setInt(3, this.accion_id);
            preparedStatement.setInt(4, this.aventura_id);
            preparedStatement.setInt(5, this.estrategia_id);
            preparedStatement.setInt(6, this.rol_id);
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
            String sql="UPDATE lista_de_generos SET tipo_de_genero=?, cantidad_de_juegos=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.tipo_de_genero);
            preparedStatement.setInt(2, this.cantidad_de_juegos);
            preparedStatement.setInt(3, this.accion_id);
            preparedStatement.setInt(4, this.aventura_id);
            preparedStatement.setInt(5, this.estrategia_id);
            preparedStatement.setInt(6, this.rol_id);
            preparedStatement.setInt(7, this.id);
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
