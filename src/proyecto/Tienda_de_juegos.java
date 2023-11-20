package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Tienda_de_juegos {
    private int id;
    private int catalogo_principal;
    private int lista_de_generos;
    private int juegos_propios;
    private int catalogo_principal_id;
    private int lista_de_generos_id;
    private int juegos_propios_id;
    public Tienda_de_juegos() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCatalogo_principal() {
        return catalogo_principal;
    }
    public void setCatalogo_principal(int catalogo_principal) {
        this.catalogo_principal = catalogo_principal;
    }
    public int getLista_de_generos() {
        return lista_de_generos;
    }
    public void setLista_de_generos(int lista_de_generos) {
        this.lista_de_generos = lista_de_generos;
    }
    public int getJuegos_propios() {
        return juegos_propios;
    }
    public void setJuegos_propios(int juegos_propios) {
        this.juegos_propios = juegos_propios;
    }
    public int getCatalogo_principal_id() {
        return catalogo_principal_id;
    }
    public void setCatalogo_principal_id(int catalogo_principal_id) {
        this.catalogo_principal_id = catalogo_principal_id;
    }
    public int getLista_de_generos_id() {
        return lista_de_generos_id;
    }
    public void setLista_de_generos_id(int lista_de_generos_id) {
        this.lista_de_generos_id = lista_de_generos_id;
    }
    public int getJuegos_propios_id() {
        return juegos_propios_id;
    }
    public void setJuegos_propios_id(int juegos_propios_id) {
        this.juegos_propios_id = juegos_propios_id;
    }
    @Override
    public String toString() {
        return "Tienda_de_juegos{" +
                "id=" + id +
                ", catalogo_principal=" + catalogo_principal +
                ", lista_de_generos=" + lista_de_generos +
                ", juegos_propios=" + juegos_propios +
                ", catalogo_principal_id=" + catalogo_principal_id +
                ", lista_de_generos_id=" + lista_de_generos_id +
                ", juegos_propios_id=" + juegos_propios_id +
                '}';
    }
    public ArrayList<Tienda_de_juegos> listarTiendaJ(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Tienda_de_juegos> listaTiendaJ=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM tienda_de_juegos");
            while (rows.next()){
                Tienda_de_juegos tdj=new Tienda_de_juegos();
                tdj.setId(rows.getInt("id"));
                tdj.setCatalogo_principal(rows.getInt("catalogo_principal"));
                tdj.setLista_de_generos(rows.getInt("lista_de_generos"));
                tdj.setJuegos_propios(rows.getInt("juegos_propios"));
                tdj.setCatalogo_principal_id(rows.getInt("catalogo_principal_id"));
                tdj.setLista_de_generos_id(rows.getInt("lista_de_generos_id"));
                tdj.setJuegos_propios_id(rows.getInt("juegos_propios_id"));
                listaTiendaJ.add(tdj);
            }
            conex.desconectar();
            return listaTiendaJ;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaTiendaJ;
    }
    public String registrarTiendaJ(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO tienda_de_juegos (catalogo_principal, lista_de_generos, juegos_propios) VALUES(?,?,?)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.catalogo_principal);
            preparedStatement.setInt(2, this.lista_de_generos);
            preparedStatement.setInt(3, this.juegos_propios);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarTiendaJ(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE tienda_de_juegos SET catalogo_principal=?, lista_de_generos=?, juegos_propios=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.catalogo_principal);
            preparedStatement.setInt(2, this.lista_de_generos);
            preparedStatement.setInt(3, this.juegos_propios);
            preparedStatement.setInt(4, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarTiendaJ(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM tienda_de_juegos WHERE id=?";
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
