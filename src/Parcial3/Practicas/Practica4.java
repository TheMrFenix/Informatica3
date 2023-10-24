package Parcial3.Practicas;
public class Practica4 {
        public static void contarRegresivamente(int n) {
            if (n>=0) {
                System.out.println(n);
                contarRegresivamente(n-1);
            }
        }
        public static void main(String[] args) {
            int numeroInicial=10;
            System.out.println("Conteo regresivo desde "+numeroInicial+" hasta 0:");
            contarRegresivamente(numeroInicial);
        }
}
