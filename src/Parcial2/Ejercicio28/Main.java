package Parcial2.Ejercicio28;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Libro l1=new Libro("J.R.R. Tolkien","El Señor De Los Anillos");
        Libro l2=new Libro("Kentaro Miura","Berserk");
        Libro l3=new Libro("Frank Herbert","Dune");
        ArrayList<Libro> lista=new ArrayList<>();
        System.out.println("Libro 1");
        System.out.println(l1.toString());
        lista.add(l1);
        System.out.println("Libro 2");
        System.out.println(l2.toString());
        lista.add(l2);
        System.out.println("Libro 3");
        System.out.println(l3.toString());
        lista.add(l3);
        System.out.println("Lista ordenada por autor y titulo");
        Collections.sort(lista);
        for (Libro li : lista) {
            System.out.println(li.toString());
        }
    }
}
