package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

public class Proyectos_concluidos {
    private int id;
    private String nombre;
    private String titulo_comercial;
    private Date fecha_de_finalizacion;
    private Date fecha_de_lanzamiento;
    private Double presupuesto_invertido;
    private Double ganacias_totales;
    private int juegos_propios_id;
    public Proyectos_concluidos() {
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
    public String getTitulo_comercial() {
        return titulo_comercial;
    }
    public void setTitulo_comercial(String titulo_comercial) {
        this.titulo_comercial = titulo_comercial;
    }
    public Date getFecha_de_finalizacion() {
        return fecha_de_finalizacion;
    }
    public void setFecha_de_finalizacion(Date fecha_de_finalizacion) {
        this.fecha_de_finalizacion = fecha_de_finalizacion;
    }
    public Date getFecha_de_lanzamiento() {
        return fecha_de_lanzamiento;
    }
    public void setFecha_de_lanzamiento(Date fecha_de_lanzamiento) {
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
    }
    public Double getPresupuesto_invertido() {
        return presupuesto_invertido;
    }
    public void setPresupuesto_invertido(Double presupuesto_invertido) {
        this.presupuesto_invertido = presupuesto_invertido;
    }
    public Double getGanacias_totales() {
        return ganacias_totales;
    }
    public void setGanacias_totales(Double ganacias_totales) {
        this.ganacias_totales = ganacias_totales;
    }
    public int getJuegos_propios_id() {
        return juegos_propios_id;
    }
    public void setJuegos_propios_id(int juegos_propios_id) {
        this.juegos_propios_id = juegos_propios_id;
    }
    @Override
    public String toString() {
        return "Proyectos_concluidos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titulo_comercial='" + titulo_comercial + '\'' +
                ", fecha_de_finalizacion=" + fecha_de_finalizacion +
                ", fecha_de_lanzamiento=" + fecha_de_lanzamiento +
                ", presupuesto_invertido=" + presupuesto_invertido +
                ", ganacias_totales=" + ganacias_totales +
                ", juegos_propios_id=" + juegos_propios_id +
                '}';
    }
    public ArrayList<Proyectos_concluidos> listarProyectosC(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Proyectos_concluidos> listaProyectosC=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM proyectos_concluidos");
            while (rows.next()){
                Proyectos_concluidos pyc=new Proyectos_concluidos();
                pyc.setId(rows.getInt("id"));
                pyc.setNombre(rows.getString("nombre"));
                pyc.setTitulo_comercial(rows.getString("titulo_comercial"));
                pyc.setFecha_de_finalizacion(rows.getDate("fecha_de_finalizacion"));
                pyc.setFecha_de_lanzamiento(rows.getDate("fecha_de_lanzamiento"));
                pyc.setPresupuesto_invertido(rows.getDouble("presupuesto_invertido"));
                pyc.setGanacias_totales(rows.getDouble("ganacias_totales"));
                pyc.setJuegos_propios_id(rows.getInt("juegos_propios_id"));
                listaProyectosC.add(pyc);
            }
            conex.desconectar();
            return listaProyectosC;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaProyectosC;
    }
    public String registrarProyectosC(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO proyectos_concluidos (nombre, titulo_comercial, fecha_de_finalizacion, fecha_de_lanzamiento, presupuesto_invertido, ganancias_totales)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.titulo_comercial);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setDouble(5, this.presupuesto_invertido);
            preparedStatement.setDouble(6, this.ganacias_totales);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarProyectosC(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE proyectos_concluidos SET nombre=?, titulo_comercial=?, fecha_de_finalizacion=?, fecha_de_lanzamiento=?, presupuesto_invertido=?, ganancias_totales=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.titulo_comercial);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_lanzamiento);
            preparedStatement.setDouble(5, this.presupuesto_invertido);
            preparedStatement.setDouble(6, this.ganacias_totales);
            preparedStatement.setInt(7, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarProyectosC(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM proyectos_concluidos WHERE id=?";
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
