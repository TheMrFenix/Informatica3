package Parcial2.Ejercicio32;
public class Fruta {
    private String nombre;
    private int calorias;
    public Fruta(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
