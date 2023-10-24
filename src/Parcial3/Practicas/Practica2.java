package Parcial3.Practicas;
public class Practica2 {
    public static int calcularFactorial(int n) {
        if (n<=1) {
            return 1;
        } else {
            return n*calcularFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int numero=5;
        long factorial=calcularFactorial(numero);
        System.out.println("El factorial de "+numero+" es "+factorial);
    }
}
