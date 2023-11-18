package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

public class Personal_de_tienda {
    private int id;
    private int horas_de_trabajo;
    private Double sueldo_semanal;
    private Date fecha_de_contratacion;
    private Date fecha_de_finalizacion;
    private int tienda_de_juegos_id;
    public Personal_de_tienda() {
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
    public int getTienda_de_juegos_id() {
        return tienda_de_juegos_id;
    }
    public void setTienda_de_juegos_id(int tienda_de_juegos_id) {
        this.tienda_de_juegos_id = tienda_de_juegos_id;
    }
    @Override
    public String toString() {
        return "Personal_de_tienda{" +
                "id=" + id +
                ", horas_de_trabajo=" + horas_de_trabajo +
                ", sueldo_semanal=" + sueldo_semanal +
                ", fecha_de_contratacion=" + fecha_de_contratacion +
                ", fecha_de_finalizacion=" + fecha_de_finalizacion +
                ", tienda_de_juegos_id=" + tienda_de_juegos_id +
                '}';
    }
    public ArrayList<Personal_de_tienda> listarPersonalT(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Personal_de_tienda> listaPersonalT=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM Personal_de_tienda");
            while (rows.next()){
                Personal_de_tienda pdt=new Personal_de_tienda();
                pdt.setId(rows.getInt("id"));
                pdt.setHoras_de_trabajo(rows.getInt("horas_de_trabajo"));
                pdt.setSueldo_semanal(rows.getDouble("sueldo_semanal"));
                pdt.setFecha_de_contratacion(rows.getDate("fecha_de_contratacion"));
                pdt.setFecha_de_finalizacion(rows.getDate("fecha_de_finalizacion"));
                pdt.setTienda_de_juegos_id(rows.getInt("tienda_de_juegos_id"));
                listaPersonalT.add(pdt);
            }
            conex.desconectar();
            return listaPersonalT;
        }catch (Exception e){
            System.out.println("Error al recuperar los registros");
        }
        return listaPersonalT;
    }
    public String registrarPersonalT(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO Personal_de_tienda (horas_de_trabajo, sueldo_semanal, fecha_de_contratacion, fecha_de_finalizacion, tienda_de_juegos_id)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.horas_de_trabajo);
            preparedStatement.setDouble(2, this.sueldo_semanal);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_contratacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setInt(5, this.tienda_de_juegos_id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarPersonalT(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE Personal_de_tienda SET horas_de_trabajo=?, sueldo_semanal=?, fecha_de_contratacion=?, fecha_de_finalizacion=?, tienda_de_juegos_id=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setInt(1, this.horas_de_trabajo);
            preparedStatement.setDouble(2, this.sueldo_semanal);
            preparedStatement.setDate(3, (java.sql.Date) this.fecha_de_contratacion);
            preparedStatement.setDate(4, (java.sql.Date) this.fecha_de_finalizacion);
            preparedStatement.setInt(5, this.tienda_de_juegos_id);
            preparedStatement.setInt(6, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarPersonalT(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM Personal_de_tienda WHERE id=?";
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
