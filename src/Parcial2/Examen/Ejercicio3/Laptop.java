package Parcial2.Examen.Ejercicio3;
public class Laptop {
    private String nombre;
    private String marca;
    private String tipo;
    private int codigo;
    public Laptop(String nombre, String marca, String tipo, int codigo) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
