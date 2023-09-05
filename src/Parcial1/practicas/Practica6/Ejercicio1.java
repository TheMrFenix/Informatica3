package Parcial1.practicas.Practica6;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cad = sc.nextLine();
        if (esPalindromo(cad)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }

    public static boolean esPalindromo(String cad) {
        int longitud = cad.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cad.charAt(i) != cad.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
