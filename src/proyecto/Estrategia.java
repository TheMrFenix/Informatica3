package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

public class Estrategia {
    private int id;
    private String titulo;
    private Date fecha_de_lanzamiento;
    private String desarrollador;
    private String editor;
    private Double precio_de_compra;
    private int lista_de_generos_id;
    private int compra_id;
    public Estrategia() {
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
        return "Estrategia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fecha_de_lanzamiento=" + fecha_de_lanzamiento +
                ", desarrollador='" + desarrollador + '\'' +
                ", editor='" + editor + '\'' +
                ", precio_de_compra=" + precio_de_compra +
                ", lista_de_generos_id=" + lista_de_generos_id +
                ", compra_id=" + compra_id +
                '}';
    }
    public ArrayList<Estrategia> listarEstrategia(){
        Statement statement;
        ResultSet rows;
        Conexion conex=new Conexion();
        ArrayList<Estrategia> listaEstrategia=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM estrategia");
            while (rows.next()){
                Estrategia est=new Estrategia();
                est.setId(rows.getInt("id"));
                est.setFecha_de_lanzamiento(rows.getDate("fecha_de_lanzamiento"));
                est.setDesarrollador(rows.getString("desarrollador"));
                est.setEditor(rows.getString("editor"));
                est.setPrecio_de_compra(rows.getDouble("precio_de_compra"));
                est.setLista_de_generos_id(rows.getInt("lista_de_generos_id"));
                est.setCompra_id(rows.getInt("compra_id"));
                listaEstrategia.add(est);
            }
            conex.desconectar();
            return listaEstrategia;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaEstrategia;
    }
    public String registrarEstrategia(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO estrategia(titulo, fecha_de_lanzamiento, desarrollador, editor, precio_de_compra) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo);
            preparedStatement.setDate(2, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setString(3, this.desarrollador);
            preparedStatement.setString(4, this.editor);
            preparedStatement.setDouble(5, this.precio_de_compra);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarEstrategia(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE estrategia SET titulo=?, fecha_de_lanzamiento=?, desarrollador=?, editor=?, precio_de_compra=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.titulo);
            preparedStatement.setDate(2, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setString(3, this.desarrollador);
            preparedStatement.setString(4, this.editor);
            preparedStatement.setDouble(5, this.precio_de_compra);
            preparedStatement.setInt(6, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarEstrategia(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM estrategia WHERE id=?";
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
