package Parcial3.Practicas;

public class Practica1 {
    public static int sumaRecursiva(int n){
        if (n==0){
            return 0;
        } else {
            return n+sumaRecursiva(n-1);
        }
    }
    public static void main(String[] args) {
        int numero=5;
        int resultado=sumaRecursiva(numero);
        System.out.println("La suma de los numeros de 1 a "+numero+" es: "+resultado);
    }
}
