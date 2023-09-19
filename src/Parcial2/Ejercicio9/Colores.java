package Parcial2.Ejercicio9;
public class Colores {
    private String nombre;
    public Colores(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "Nombre:'" + nombre + '\'' +
                '}';
    }
}
