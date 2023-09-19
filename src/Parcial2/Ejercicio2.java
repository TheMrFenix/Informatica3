package Parcial2;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class Ejercicio2 {
    public static void main(String[] args) {
        Stack<Integer> pila=new Stack<Integer>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        pila.push(9);
        pila.push(10);
        System.out.println("Elmentos de la pila en el orden inverso: ");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
        Queue<Integer> cola=new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);
        cola.add(7);
        cola.add(8);
        cola.add(9);
        cola.add(10);
        System.out.println("Elmentos de la pila en el orden ascendente: ");
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
