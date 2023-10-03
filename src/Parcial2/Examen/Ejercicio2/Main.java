package Parcial2.Examen.Ejercicio2;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Libro li1=new Libro("El Señor De Los Anillos","J.R.R. Tolkien","Fantasia");
        Libro li2=new Libro("Berserk","Kentaro Miura","Fantasia Oscura");
        Libro li3=new Libro("Dune","Frank Herbert","Ciencia Ficcion");
        Stack<Libro> pila=new Stack<>();
        int x=0;
        do {
            System.out.println("Menu principal de Ejercicio 1");
            System.out.println("1- Continuar sin rellenar");
            System.out.println("2- Rellenar los datos");
            System.out.println("0- Salir");
            System.out.print("-> Elija una opcion: ");
            x=sc.nextInt();
            if (x==1){
                pila.add(li1);
                pila.add(li2);
                pila.add(li3);
                System.out.println("---------------------------------------------");
                System.out.println("Hay 3 Lobros");
                while (!pila.isEmpty()) {
                    System.out.println("El ultimo libro es " + pila);
                    pila.pop();
                    System.out.print("Desea acabar el proceso? si/no: ");
                    String z=sc.next();
                    if (z.equals("si")){
                        pila.clear();
                    } else if (z.equals("no")){}
                }
            }
            if (x==2){
                System.out.println("Libro 1");
                System.out.print("Ingrese el Titulo: ");
                String ti1=sc.next();
                li1.setTitulo(ti1);
                System.out.print("Ingrese el Autor: ");
                String au1=sc.next();
                li1.setAutor(au1);
                System.out.print("Ingrese el Categoria: ");
                String ca1=sc.next();
                li1.setCategoria(ca1);
                pila.add(li1);
                pila.add(li2);
                pila.add(li3);
                System.out.println("---------------------------------------------");
                System.out.println("Hay 3 Lobros");
                while (!pila.isEmpty()) {
                    System.out.println("El ultimo libro es " + pila);
                    pila.pop();
                    System.out.print("Desea acabar el proceso? si/no: ");
                    String z=sc.next();
                    if (z.equals("si")){
                        pila.clear();
                    } else if (z.equals("no")){}
                }
            }
        } while (x!=0);
    }
}
