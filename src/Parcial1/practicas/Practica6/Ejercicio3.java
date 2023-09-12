package Parcial1.practicas.Practica6;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();
        long fac = calcularFactorial(num);
        System.out.println("El factorial de " + num + " es " + fac);
    }
    public static long calcularFactorial(int num) {
        long fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }
}
