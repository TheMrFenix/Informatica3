package Parcial2.Ejercicio24;
import java.util.Comparator;
import java.util.Objects;
public class Persona implements Comparable<Persona> {
    private String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int compareTo(Persona p){
        return this.nombre.compareTo(p.getNombre());
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
