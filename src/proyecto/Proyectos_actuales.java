package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Proyectos_actuales {
    private int id;
    private String nombre;
    private Double presupuesto_asignado;
    private Double tiempo_estimado;
    private int proyectos_concluidos_id;
    public Proyectos_actuales() {
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
    public Double getPresupuesto_asignado() {
        return presupuesto_asignado;
    }
    public void setPresupuesto_asignado(Double presupuesto_asignado) {
        this.presupuesto_asignado = presupuesto_asignado;
    }
    public Double getTiempo_estimado() {
        return tiempo_estimado;
    }
    public void setTiempo_estimado(Double tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }
    public int getProyectos_concluidos_id() {
        return proyectos_concluidos_id;
    }
    public void setProyectos_concluidos_id(int proyectos_concluidos_id) {
        this.proyectos_concluidos_id = proyectos_concluidos_id;
    }
    @Override
    public String toString() {
        return "Proyectos_actuales{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", presupuesto_asignado=" + presupuesto_asignado +
                ", tiempo_estimado=" + tiempo_estimado +
                ", proyectos_concluidos_id=" + proyectos_concluidos_id +
                '}';
    }
    public ArrayList<Proyectos_actuales> listarProyectosA(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Proyectos_actuales> listaProyectosA=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM proyectos_actuales");
            while (rows.next()){
                Proyectos_actuales pya=new Proyectos_actuales();
                pya.setId(rows.getInt("id"));
                pya.setNombre(rows.getString("nombre"));
                pya.setPresupuesto_asignado(rows.getDouble("presupuesto_asignado"));
                pya.setTiempo_estimado(rows.getDouble("tiempo_estimado"));
                pya.setProyectos_concluidos_id(rows.getInt("proyectos_concluidos_id"));
                listaProyectosA.add(pya);
            }
            conex.desconectar();
            return listaProyectosA;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaProyectosA;
    }
    public String registrarProyectosA(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO proyectos_actuales(nombre, presupusto_asignado, tiempo_estimado)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setDouble(2, this.presupuesto_asignado);
            preparedStatement.setDouble(3, this.tiempo_estimado);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarProyectosA(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE proyectos_actuales SET nombre=?, presupuesto_asignado=?, tiempo_estimado=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setDouble(2, this.presupuesto_asignado);
            preparedStatement.setDouble(3, this.tiempo_estimado);
            preparedStatement.setInt(4, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarProyectosA(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM proyectos_actuales WHERE id=?";
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
