package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
public class Personal_de_desarrollo {
    private int id;
    private int horas_de_trabajo;
    private Double sueldo_semanal;
    private Date fecha_de_contratacion;
    private Date fecha_de_finalizacion;
    private String especializacion;
    private int departamentos_de_trabajo_id;
    public Personal_de_desarrollo() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHoras_de_trabajo() {
        return horas_de_trabajo;
    }
    public void setHoras_de_trabajo(int horas_de_trabajo) {
        this.horas_de_trabajo = horas_de_trabajo;
    }
    public Double getSueldo_semanal() {
        return sueldo_semanal;
    }
    public void setSueldo_semanal(Double sueldo_semanal) {
        this.sueldo_semanal = sueldo_semanal;
    }
    public Date getFecha_de_contratacion() {
        return fecha_de_contratacion;
    }
    public void setFecha_de_contratacion(Date fecha_de_contratacion) {
        this.fecha_de_contratacion = fecha_de_contratacion;
    }
    public Date getFecha_de_finalizacion() {
        return fecha_de_finalizacion;
    }
    public void setFecha_de_finalizacion(Date fecha_de_finalizacion) {
        this.fecha_de_finalizacion = fecha_de_finalizacion;
    }
    public String getEspecializacion() {
        return especializacion;
    }
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
    public int getDepartamentos_de_trabajo_id() {
        return departamentos_de_trabajo_id;
    }
    public void setDepartamentos_de_trabajo_id(int departamentos_de_trabajo_id) {
        this.departamentos_de_trabajo_id = departamentos_de_trabajo_id;
    }
    @Override
    public String toString() {
        return "Personal_de_desarrollo{" +
                "id=" + id +
                ", horas_de_trabajo=" + horas_de_trabajo +
                ", sueldo_semanal=" + sueldo_semanal +
                ", fecha_de_contratacion=" + fecha_de_contratacion +
                ", fecha_de_finalizacion=" + fecha_de_finalizacion +
                ", especializacion='" + especializacion + '\'' +
                ", departamentos_de_trabajo_id=" + departamentos_de_trabajo_id +
                '}';
    }
    public ArrayList<Personal_de_desarrollo> listarPersonalD(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Personal_de_desarrollo> listaPersonalD=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery(" SELECT * FROM Personal_de_desarrollo");
            while (rows.next()){
                Personal_de_desarrollo pdd=new Personal_de_desarrollo();
                pdd.setId(rows.getInt("id"));
                pdd.setHoras_de_trabajo(rows.getInt("horas_de_trabajo"));
                pdd.setSueldo_semanal(rows.getDouble("sueldo_semanal"));
                pdd.setFecha_de_contratacion(rows.getDate("fecha_de_contratacion"));
                pdd.setFecha_de_finalizacion(rows.getDate("fecha_de_finalizacion"));
                pdd.setEspecializacion(rows.getString("especializacion"));
                pdd.setDepartamentos_de_trabajo_id(rows.getInt("departamentos_de_trabajo_id"));
                listaPersonalD.add(pdd);
            }
            conex.desconectar();
            return listaPersonalD;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaPersonalD;
    }
    public String registrarPersonalD(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO Personal_de_desarrollo(horas_de_trabajo, sueldo_semanal, fecha_de_contratacion, fecha_de_finalizacion, especializacion, departamentos_de_trabajo_id)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.horas_de_trabajo);
            preparedStatement.setDouble(2, this.sueldo_semanal);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_contratacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setString(5, this.especializacion);
            preparedStatement.setInt(6, this.departamentos_de_trabajo_id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarPersonalD(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE Personal_de_desarrollo SET horas_de_trabajo=?, sueldo_semanal=?, fecha_de_contratacion=?, fecha_de_finalizacion=?, especializacion=?, departamentos_de_trabajo_id=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.horas_de_trabajo);
            preparedStatement.setDouble(2, this.sueldo_semanal);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_contratacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setString(5, this.especializacion);
            preparedStatement.setInt(6, this.departamentos_de_trabajo_id);
            preparedStatement.setInt(7, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarPersonalD(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM Personal_de_desarrollo WHERE id=?";
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
