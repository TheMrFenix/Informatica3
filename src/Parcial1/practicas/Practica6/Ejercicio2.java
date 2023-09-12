package Parcial1.practicas.Practica6;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int fil = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int col = sc.nextInt();

        int[][] m1 = generarMatrizAleatoria(fil, col);
        int[][] m2 = generarMatrizAleatoria(fil, col);

        System.out.println("Matriz 1:");
        imprimirMatriz(m1);
        System.out.println("Matriz 2:");
        imprimirMatriz(m2);

        int[][] matrizSuma = sumarMatrices(m1, m2);
        System.out.println("Matriz suma:");
        imprimirMatriz(matrizSuma);
    }
    public static int[][] generarMatrizAleatoria(int fil, int col) {
        Random rnd = new Random();
        int[][] matriz = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = rnd.nextInt(10);
            }
        }
        return matriz;
    }
    public static int[][] sumarMatrices(int[][] m1, int[][] m2) {
        int fil = m1.length;
        int col = m1[0].length;
        int[][] matrizSuma = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizSuma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return matrizSuma;
    }
    public static void imprimirMatriz(int[][] matriz) {
        int fil = matriz.length;
        int col = matriz[0].length;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
