package Parcial2.Practicas.Ejercicio8;
public class Animal {
    private String nombre;
    public Animal(String nombre) {
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
