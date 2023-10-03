package Parcial2.Ejercicio27;
public class Estudiante {
    private String nombre;
    private Double calificacion;
    public Estudiante(String nombre, Double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
