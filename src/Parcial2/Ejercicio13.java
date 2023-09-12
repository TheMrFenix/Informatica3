package parcial2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<String> cola=new LinkedList<>();
        int x;
        do {
            System.out.println(" Menu ");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar de la cola");
            System.out.println("3- Mostrar");
            System.out.println("0- Salir");
            System.out.print("> Elija una opcion: ");
            x=sc.nextInt();
            if (x==1){
                System.out.print("Ingrese la cantidad de nombres que desea: ");
                int a=sc.nextInt();
                for (int i=0; i<a;i++){
                    System.out.print("Ingrese el nombre "+(i+1)+": ");
                    String n=sc.next();
                    cola.add(n);
                }
            }
            if (x==2){
                for (String s:cola) {
                    System.out.println(s);
                }
                System.out.print("Cuantos nombres decea eliminar?: ");
                int n2=sc.nextInt();
                for (int i=0;i<n2;i++){
                    System.out.println("Ingrese el nombre que desea eliminar");
                    String eli=sc.next();
                    cola.remove(eli);
                }
                System.out.println("Precione enter");
            }
            if (x==3){
                for (String z:cola) {
                    System.out.println(z);
                }
            }
        } while (x!=0);
    }
}
