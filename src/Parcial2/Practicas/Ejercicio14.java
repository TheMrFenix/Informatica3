package Parcial2.Practicas;
import java.util.Stack;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> pila=new Stack<>();
        System.out.print("Ingrese la cantidad de datos que desea: ");
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            System.out.print("Ingrese un numero "+(i+1)+": ");
            int n=sc.nextInt();
            pila.add(n);
        }
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }

    }
}
