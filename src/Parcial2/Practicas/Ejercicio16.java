package Parcial2.Practicas;
import java.util.Stack;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Stack<Integer> pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de datos que desea: ");
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            System.out.print("Ingrese un numero "+(i+1)+": ");
            int n=sc.nextInt();
            pila.add(n);
        }
        System.out.print("Ingrese el numero que desea revisar: ");
        int r=sc.nextInt();
        if (pila.contains(r)){
            System.out.println("El numaro a sido ingresado");
        } else {
            System.out.println("El numero no a sido ingresado");
            System.out.println("estas si");
            for (Integer s:pila) {
                System.out.println(s);
            }
        }
    }
}
