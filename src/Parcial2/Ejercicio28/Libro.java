package Parcial2.Ejercicio28;
import java.util.Comparator;
import java.util.Objects;
public class Libro implements Comparable<Libro>{
    private String autor;
    private String titulo;
    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int compareTo(Libro l){
        return this.autor.compareTo(l.getAutor());
    }
    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
