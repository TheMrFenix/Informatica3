package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Compra {
    private int id;
    private String titulo_de_juego;
    private Double precio_de_compra;
    private int codigo_de_tarjeta;
    public Compra() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo_de_juego() {
        return titulo_de_juego;
    }
    public void setTitulo_de_juego(String titulo_de_juego) {
        this.titulo_de_juego = titulo_de_juego;
    }
    public Double getPrecio_de_compra() {
        return precio_de_compra;
    }
    public void setPrecio_de_compra(Double precio_de_compra) {
        this.precio_de_compra = precio_de_compra;
    }
    public int getCodigo_de_tarjeta() {
        return codigo_de_tarjeta;
    }
    public void setCodigo_de_tarjeta(int codigo_de_tarjeta) {
        this.codigo_de_tarjeta = codigo_de_tarjeta;
    }
    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", titulo_de_juego='" + titulo_de_juego + '\'' +
                ", precio_de_compra=" + precio_de_compra +
                ", codigo_de_tarjeta=" + codigo_de_tarjeta +
                '}';
    }
    public ArrayList<Compra> listarCompra(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Compra> listaCompra=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM compra");
            while (rows.next()){
                Compra com=new Compra();
                com.setId(rows.getInt("id"));
                com.setTitulo_de_juego(rows.getString("titulo_de_juegos"));
                com.setPrecio_de_compra(rows.getDouble("precio_de_compra"));
                com.setCodigo_de_tarjeta(rows.getInt("codigo_de_trajeta"));
                listaCompra.add(com);
            }
            conex.desconectar();
            return listaCompra;
        }catch (Exception e){
            System.out.println("Erro al recuperar los registros");
        }
        return listaCompra;
    }
    public String registrarCompra(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO compra (titulo_de_juego, precio_de_compra, codigo_de_tarjeta)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo_de_juego);
            preparedStatement.setDouble(2, this.precio_de_compra);
            preparedStatement.setInt(3, this.codigo_de_tarjeta);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarCompra(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE compra SET titulo_de_juego=?, precio_de_compra=?, codigo_de_tarjeta=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo_de_juego);
            preparedStatement.setDouble(2, this.precio_de_compra);
            preparedStatement.setInt(3, this.codigo_de_tarjeta);
            preparedStatement.setInt(4, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarCompra(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM compra WHERE id=?";
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
