package Parcial1.practicas.Practica5;
public class Persona {
    private String nombre_alumno;
    private String apellido_alumno;
    private int edad_alumno;
    public Persona() {
    }
    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }
    public void setApellido_alumno(String apellido_alumno) {
        this.apellido_alumno = apellido_alumno;
    }
    public void setEdad_alumno(int edad_alumno) {
        this.edad_alumno = edad_alumno;
    }
    @Override
    public String toString() {
        return "Persona{" +
                " Nombre del alumno: '" + nombre_alumno + '\'' +
                ", Apellido del alumno: '" + apellido_alumno + '\'' +
                ", Edad del alumno: " + edad_alumno + '\'' +
                '}';
    }
}
