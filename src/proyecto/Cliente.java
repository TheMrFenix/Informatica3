package proyecto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class Cliente {
    private int id;
    private String apodo;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String pais;
    private String direccion_email;
    private int telefono;
    private String contraseña;
    private int tienda_de_juegos_id;
    public Cliente() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
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
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getDireccion_email() {
        return direccion_email;
    }
    public void setDireccion_email(String direccion_email) {
        this.direccion_email = direccion_email;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public int getTienda_de_juegos_id() {
        return tienda_de_juegos_id;
    }
    public void setTienda_de_juegos_id(int tienda_de_juegos_id) {
        this.tienda_de_juegos_id = tienda_de_juegos_id;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", apodo='" + apodo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion_email='" + direccion_email + '\'' +
                ", telefono=" + telefono +
                ", contraseña='" + contraseña + '\'' +
                ", tienda_de_juegos_id=" + tienda_de_juegos_id +
                '}';
    }
    public ArrayList<Cliente> listarCliente(){
            Statement statement;
            ResultSet rows;
            Conexion conex=new Conexion();
        ArrayList<Cliente> listaCliente=new ArrayList<>();
        try {
            statement=conex.conectar().createStatement();
            rows=statement.executeQuery("SELECT * FROM cliente");
            while (rows.next()){
                Cliente cli=new Cliente();
                cli.setId(rows.getInt("id"));
                cli.setApodo(rows.getString("apodo"));
                cli.setNombre(rows.getString("nombre"));
                cli.setApellido_paterno(rows.getString("apellido_paterno"));
                cli.setApellido_materno(rows.getString("apellido_materno"));
                cli.setPais(rows.getString("pais"));
                cli.setDireccion_email(rows.getString("direccion_email"));
                cli.setTelefono(rows.getInt("telefono"));
                cli.setContraseña(rows.getString("contraseña"));
                cli.setTienda_de_juegos_id(rows.getInt("tienda_de_juegos_id"));
                listaCliente.add(cli);
            }
            conex.desconectar();
            return listaCliente;
        }catch (Exception e){
            System.out.println("Error al recuperar los registro");
        }
        return listaCliente;
    }
    public String registrarCliente(){
        Conexion conex=new Conexion();
        try {
            String sql="INSERT INTO cliente (apodo, nombre, apellido_paterno, apellido_materno, pais, direccion_email, telefono, contraseña, tienda_de_juegos_id)";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.apodo);
            preparedStatement.setString(2, this.nombre);
            preparedStatement.setString(3, this.apellido_paterno);
            preparedStatement.setString(4, this.apellido_materno);
            preparedStatement.setString(5, this.pais);
            preparedStatement.setString(6, this.direccion_email);
            preparedStatement.setInt(7, this.telefono);
            preparedStatement.setString(8, this.contraseña);
            preparedStatement.setInt(9, this.tienda_de_juegos_id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas insertadas: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String actualizarCliente(){
        Conexion conex=new Conexion();
        try {
            String sql="UPDATE cliente SET apodo=?, nombre=?, apellido_paterno=?, apellido_materno=?, pais=?, direccion_email=?, telefono=?, contraseña=?, tienda_de_juegos_id=? WHERE id=?";
            PreparedStatement preparedStatement=conex.conectar().prepareStatement(sql);
            preparedStatement.setString(1, this.apodo);
            preparedStatement.setString(2, this.nombre);
            preparedStatement.setString(3, this.apellido_paterno);
            preparedStatement.setString(4, this.apellido_materno);
            preparedStatement.setString(5, this.pais);
            preparedStatement.setString(6, this.direccion_email);
            preparedStatement.setInt(7, this.telefono);
            preparedStatement.setString(8, this.contraseña);
            preparedStatement.setInt(9, this.tienda_de_juegos_id);
            preparedStatement.setInt(10, this.id);
            int rowsInserted=preparedStatement.executeUpdate();
            conex.desconectar();
            return "Filas Actualizada: "+rowsInserted;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public String eliminarCliente(){
        Conexion conex=new Conexion();
        try {
            String sql="DELETE FROM cliente WHERE id=?";
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
