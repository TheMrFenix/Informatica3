package Parcial1.practicas;
import java.util.Scanner;
public class Practica7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("╔══»»   Menu   ««══╗");
            System.out.println("╠1.- Suma");
            System.out.println("╠2.- Resta");
            System.out.println("╠3.- Multiplicacion");
            System.out.println("╠4.- Division");
            System.out.println("╠0.- Salir");
            System.out.println("╚═» Elija una opcion:");
            x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    Suma();
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
                case 2:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    Resta();
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
                case 3:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    Multi();
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
                case 4:
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    Divi();
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    break;
                default:
                    System.out.println("#¶§?[^`!▓©BªÞØ#¶§?[^`!▓©BªÞØ#¶§?[^`!▓©BªÞØ");
                    System.out.println("Opcion incorrecta");
            }
        } while (x!=0);
    }
    public static void Suma(){
        Scanner sc=new Scanner(System.in);
        double v;
        double s=0;
        System.out.println("╔»Ejercicio de suma");
        System.out.print("╠»Ingrese la cantidad de numaros que desea sumar:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("╠»Ingrese el valor "+(i+1)+": ");
            v=sc.nextDouble();
            s=s+v;
        }
        System.out.println("╚»La suma de todos los "+n+" valores es "+s);
    }
    public static void Resta(){
        Scanner sc=new Scanner(System.in);
        double v;
        double s=0;
        System.out.println("╔»Ejercicio de resta");
        System.out.print("╠»Ingrese la cantidad de numaros que desea restar:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("╠»Ingrese el valor "+(i+1)+": ");
            v=sc.nextDouble();
            s=s-v;
        }
        System.out.println("╚»La resta de todos los "+n+" valores es "+s);
    }
    public static void Multi(){
        Scanner sc=new Scanner(System.in);
        double v;
        double b;
        double s=0;
        System.out.println("╔»Ejercicio de multiplicacion");
        System.out.print("╠»Ingrese el valor 1: ");
        v=sc.nextDouble();
        System.out.print("╠»Ingrese el valor 2: ");
        b=sc.nextDouble();
        s=v*b;
        System.out.println("╚»La multiplicacion es "+s);
    }
    public static void Divi(){
        Scanner sc=new Scanner(System.in);
        double v;
        double b;
        double s=0;
        System.out.println("╔»Ejercicio de division");
        System.out.print("╠»Ingrese el valor 1: ");
        v=sc.nextDouble();
        System.out.print("╠»Ingrese el valor 2: ");
        b=sc.nextDouble();
        s=v/b;
        System.out.println("╚»La division es "+s);
    }
}
