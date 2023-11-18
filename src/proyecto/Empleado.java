package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Empleado {
    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String contraseña;
    private String area_de_trabajo;
    private int personal_de_tienda_id;
    private int personal_de_desarrollo_id;
    public Empleado() {
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
    public String getApellido_paterno() {
        return apellido_paterno;
    }
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    public String getApellido_materno() {
        return apellido_materno;
    }
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getArea_de_trabajo() {
        return area_de_trabajo;
    }
    public void setArea_de_trabajo(String area_de_trabajo) {
        this.area_de_trabajo = area_de_trabajo;
    }
    public int getPersonal_de_tienda_id() {
        return personal_de_tienda_id;
    }
    public void setPersonal_de_tienda_id(int personal_de_tienda_id) {
        personal_de_tienda_id = personal_de_tienda_id;
    }
    public int getPersonal_de_desarrollo_id() {
        return personal_de_desarrollo_id;
    }
    public void setPersonal_de_desarrollo_id(int personal_de_desarrollo_id) {
        personal_de_desarrollo_id = personal_de_desarrollo_id;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", area_de_trabajo='" + area_de_trabajo + '\'' +
                ", Personal_de_tienda_id=" + personal_de_tienda_id +
                ", Personal_de_desarrollo_id=" + personal_de_desarrollo_id +
                '}';
    }
    public ArrayList<Empleado> listarEmpleado(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Empleado> listaEmpleados=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM Empleado");
            while (rows.next()){
                Empleado emp=new Empleado();
                emp.setId(rows.getInt("id"));
                emp.setNombre(rows.getString("nombre"));
                emp.setApellido_paterno(rows.getString("apellido_paterno"));
                emp.setApellido_materno(rows.getString("apellido_materno"));
                emp.setContraseña(rows.getString("contraseña"));
                emp.setArea_de_trabajo(rows.getString("area_de_trabajo"));
                emp.setPersonal_de_tienda_id(rows.getInt("personal_de_tienda_id"));
                emp.setPersonal_de_desarrollo_id(rows.getInt("personal_de_desarrollo_id"));
                listaEmpleados.add(emp);
            }
            conex.desconectar();
            return listaEmpleados;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaEmpleados;
    }
    public String registrarEmpleado(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO Empleado (nombre, apellido_paterno, apellido_materno, contraseña, area_de_trabajo, personal_de_tienda_id, personal_de_desarrollo_id)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.apellido_paterno);
            preparedStatement.setString(3, this.apellido_materno);
            preparedStatement.setString(4, this.contraseña);
            preparedStatement.setString(5, this.area_de_trabajo);
            preparedStatement.setInt(6, this.personal_de_tienda_id);
            preparedStatement.setInt(7, this.personal_de_desarrollo_id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarEmpleado(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE Empleado SET nombre=?, apellido_paterno=?, apellido_materno=?, contraseña=?, area_de_trabajo=?, personal_de_tienda_id=?, personal_de_desarrollo_id=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.nombre);
            preparedStatement.setString(2, this.apellido_paterno);
            preparedStatement.setString(3, this.apellido_materno);
            preparedStatement.setString(4, this.contraseña);
            preparedStatement.setString(5, this.area_de_trabajo);
            preparedStatement.setInt(6, this.personal_de_tienda_id);
            preparedStatement.setInt(7, this.personal_de_desarrollo_id);
            preparedStatement.setInt(8, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarEmpleado(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM Empleado WHERE id=?";
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
