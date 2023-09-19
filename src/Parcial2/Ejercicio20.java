package Parcial2;
import java.util.Scanner;
import java.util.Stack;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String>pila=new Stack<>();
        System.out.print("Ingrese la cantidad de caracteres que desea: ");
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            System.out.print("Ingrese un caracter: ");
            String car=sc.next();
        }
        pila.clear();
        System.out.println("La pila a sido eliminada");
    }
}
