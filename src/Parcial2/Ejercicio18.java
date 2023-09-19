package Parcial2;
import java.util.Stack;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Stack<String>pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String pal= sc.nextLine();
        pila.add(pal);
        if (esPalindromo(pal)){
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }
    }
    public static boolean esPalindromo(String pal) {
        int lon = pal.length();
        for (int i=0;i<lon/2;i++) {
            if (pal.charAt(i) !=pal.charAt(lon-i-1)) {
                return false;
            }
        }
        return true;
    }
}
