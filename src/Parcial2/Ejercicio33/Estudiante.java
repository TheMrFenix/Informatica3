package Parcial2.Ejercicio33;
public class Estudiante {
    private String nombre;
    private Double puntos;
    public Estudiante(String nombre, Double puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPuntos() {
        return puntos;
    }
    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
