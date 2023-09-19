package Parcial2;
import java.util.Stack;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Stack<Integer>pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de numeros que desea: ");
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            System.out.print("Ingrese el numero "+(i+1)+": ");
            n=sc.nextInt();
            pila.add(n);
        }
        int max=pila.peek(), min=pila.peek();
        for (Integer num : pila) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Número máximo en la pila: " + max);
        System.out.println("Número mínimo en la pila: " + min);
    }
}
