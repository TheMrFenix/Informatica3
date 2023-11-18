package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Departamentos_de_trabajo {
    private int id;
    private String nombre;
    private Double presupuesto_asignado;
    private Double gastos;
    private int proyectos_actuales_id;
    public Departamentos_de_trabajo() {
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
    public Double getGastos() {
        return gastos;
    }
    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }
    public int getProyectos_actuales_id() {
        return proyectos_actuales_id;
    }
    public void setProyectos_actuales_id(int proyectos_actuales_id) {
        this.proyectos_actuales_id = proyectos_actuales_id;
    }
    @Override
    public String toString() {
        return "Departamentos_de_trabajo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", presupuesto_asignado=" + presupuesto_asignado +
                ", gastos=" + gastos +
                ", proyectos_actuales_id=" + proyectos_actuales_id +
                '}';
    }
    public ArrayList<Departamentos_de_trabajo> listarDatos(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Departamentos_de_trabajo> listaDepartamentos=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM Departamentos_de_trabajo");
            while (rows.next()){
                Departamentos_de_trabajo ddt=new Departamentos_de_trabajo();
                ddt.setId(rows.getInt("id"));
                ddt.setNombre(rows.getString("nombre"));
                ddt.setPresupuesto_asignado(rows.getDouble("presupuesto_asignado"));
                ddt.setGastos(rows.getDouble("gastos"));
                ddt.setProyectos_actuales_id(rows.getInt("proyectos_actuales_id"));
                listaDepartamentos.add(ddt);
            }
            conex.desconectar();
            return listaDepartamentos;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaDepartamentos;
    }
    public String registrarDepartamentos(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO Departamentos_de_trabajo (nombre, presupuesto_asignado, gastos, proyectos_actuales_id)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setDouble(2, this.presupuesto_asignado);
            preparedStatement.setDouble(3, this.gastos);
            preparedStatement.setInt(4, this.proyectos_actuales_id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarDepartamentos(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE Departamentos_de_trabajo SET nombre=?, presupuesto_asignado=?, gastos=?, proyectos_actuales_id=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setDouble(2, this.presupuesto_asignado);
            preparedStatement.setDouble(3, this.gastos);
            preparedStatement.setInt(4, this.proyectos_actuales_id);
            preparedStatement.setInt(5, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarDepartamentos(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM Departamentos_de_trabajo WHERE id=?";
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
