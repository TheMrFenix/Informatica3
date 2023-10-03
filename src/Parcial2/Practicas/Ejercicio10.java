package Parcial2.Practicas;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio10 {
    public static void main(String[] args) {
        Queue<Integer> cola=new LinkedList<>();
        for (int i=1; i<=10; i++){
            cola.add(i);
        }
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("---------------------------");
        for (int i=1; i<=10; i++){
            if (i%2!=0){
                cola.add(i);
            }
        }
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
