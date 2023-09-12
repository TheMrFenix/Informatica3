package parcial2;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio3 {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        cola.add("Manzana");
        cola.add("Pera");
        cola.add("Naranja");
        cola.add("Plátano");
        System.out.println("Los elementos de la cola son: ");
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
