package Parcial2;
import java.util.Scanner;
import java.util.Stack;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String>pila=new Stack<>();
        System.out.print("Ingrese la cantidad de numeros que desea: ");
        int x=sc.nextInt();
        int sum=0;
        for (int i=0;i<x;i++){
            System.out.print("Ingrese un caracter: ");
            int n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("La suma de los numeros en la pila es: "+sum);
    }
}
