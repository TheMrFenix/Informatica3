package Parcial2.Ejercicio4;
public class Persona {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    public Persona(String nombre, String apellido_paterno, String apellido_materno) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
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

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre: '" + nombre + '\'' +
                ", Apellido Paterno:'" + apellido_paterno + '\'' +
                ", Apellido Materno:'" + apellido_materno + '\'' +
                '}';
    }
}
