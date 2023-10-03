package Parcial2.Practicas.Ejercicio8;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        Animal m1=new Animal("perro");
        Animal m2=new Animal("gato");
        Animal m3=new Animal("conejo");
        Animal m4=new Animal("loro");
        cola.add(m1.getNombre());
        cola.add(m2.getNombre());
        cola.add(m3.getNombre());
        cola.add(m4.getNombre());
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("--------------------------");
        cola.add(m1.getNombre());
        cola.add(m2.getNombre());
        cola.add(m3.getNombre());
        cola.add(m4.getNombre());
        cola.remove("conejo");
        for (String s: cola) {
            System.out.println(s);
        }
    }
}
