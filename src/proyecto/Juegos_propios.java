package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

public class Juegos_propios {
    private int id;
    private String titulo;
    private String genero;
    private Date fecha_de_lanzamiento;
    private String desarrollador;
    private String editor;
    private Double precio_de_compra;
    private int lista_de_generos_id;
    private int compra_id;
    public Juegos_propios() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getFecha_de_lanzamiento() {
        return fecha_de_lanzamiento;
    }
    public void setFecha_de_lanzamiento(Date fecha_de_lanzamiento) {
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
    }
    public String getDesarrollador() {
        return desarrollador;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public Double getPrecio_de_compra() {
        return precio_de_compra;
    }
    public void setPrecio_de_compra(Double precio_de_compra) {
        this.precio_de_compra = precio_de_compra;
    }
    public int getLista_de_generos_id() {
        return lista_de_generos_id;
    }
    public void setLista_de_generos_id(int lista_de_generos_id) {
        this.lista_de_generos_id = lista_de_generos_id;
    }
    public int getCompra_id() {
        return compra_id;
    }
    public void setCompra_id(int compra_id) {
        this.compra_id = compra_id;
    }
    @Override
    public String toString() {
        return "Juegos_propios{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", fecha_de_lanzamiento=" + fecha_de_lanzamiento +
                ", desarrollador='" + desarrollador + '\'' +
                ", editor='" + editor + '\'' +
                ", precio_de_compra=" + precio_de_compra +
                ", lista_de_generos_id=" + lista_de_generos_id +
                ", compra_id=" + compra_id +
                '}';
    }
    public ArrayList<Juegos_propios> listarJuegosP(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Juegos_propios> listaJuegosP=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM juegos_propios");
            while (rows.next()){
                Juegos_propios jup=new Juegos_propios();
                jup.setId(rows.getInt("id"));
                jup.setTitulo(rows.getString("titulo"));
                jup.setGenero(rows.getString("genero"));
                jup.setFecha_de_lanzamiento(rows.getDate("fecha_de_lanzamiento"));
                jup.setDesarrollador(rows.getString("desarrollador"));
                jup.setEditor(rows.getString("editor"));
                jup.setPrecio_de_compra(rows.getDouble("precio_de_compra"));
                jup.setLista_de_generos_id(rows.getInt("lista_de_generos_id"));
                jup.setCompra_id(rows.getInt("compra_id"));
                listaJuegosP.add(jup);
            }
            conex.desconectar();
            return listaJuegosP;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaJuegosP;
    }
    public String registrarJuegosP(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO juegos_propios (titulo, genero, fecha_de_lanzamiento, desarrollador, editor, precio_de_compra) VALUES(?,?,?,?,?,?)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo);
            preparedStatement.setString(2, this.genero);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setString(4, this.desarrollador);
            preparedStatement.setString(5, this.editor);
            preparedStatement.setDouble(6, this.precio_de_compra);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarJuegosP(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE juegos_propios SET titulo=?, genero=?, fecha_de_lanzamiento=?, desarrollador=?, editor=?, precio_de_compra=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo);
            preparedStatement.setString(2, this.genero);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setString(4, this.desarrollador);
            preparedStatement.setString(5, this.editor);
            preparedStatement.setDouble(6, this.precio_de_compra);
            preparedStatement.setInt(7, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarJuegosP(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM juegos_propios WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.id);
            int rowsInseted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Eliminadas: "+rowsInseted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
