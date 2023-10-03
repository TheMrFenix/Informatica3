package Parcial2.Practicas.Ejercicio9;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        Colores c1=new Colores("rojo");
        Colores c2=new Colores("verde");
        Colores c3=new Colores("azul");
        Colores c4=new Colores("amarillo");
        cola.add(c1.getNombre());
        cola.add(c2.getNombre());
        cola.add(c3.getNombre());
        cola.add(c4.getNombre());
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("--------------------------");
        cola.add(c1.getNombre());
        cola.add(c2.getNombre());
        cola.add(c3.getNombre());
        cola.add(c4.getNombre());
        cola.remove("rojo");
        cola.remove("amarillo");
        for (String s: cola) {
            System.out.println(s);
        }
    }
}
