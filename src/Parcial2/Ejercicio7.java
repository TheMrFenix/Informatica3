package Parcial2;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio7 {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");
        cola.add("E");
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("----------------------------------");
        cola.add("F");
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
