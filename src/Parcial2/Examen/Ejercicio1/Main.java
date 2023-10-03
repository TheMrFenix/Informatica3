package Parcial2.Examen.Ejercicio1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona per1=new Persona("Jose","Jaiva","Ortuño",1);
        Persona per2=new Persona("Carla","Martinez","Casas",2);
        Persona per3=new Persona("Marcus","Camacho","Condori",3);
        Persona per4=new Persona("Patricia","Estrella","Roca",4);
        Persona per5=new Persona("Alva","Soto","Peralta",5);
        Queue<Persona> cola=new LinkedList<>();
        int x=0;
        do {
            System.out.println("Menu principal de Ejercicio 1");
            System.out.println("1- Continuar sin rellenar");
            System.out.println("2- Rellenar los datos");
            System.out.println("0- Salir");
            System.out.print("-> Elija una opcion: ");
            x=sc.nextInt();
            if (x==1){
                cola.add(per1);
                cola.add(per2);
                cola.add(per3);
                cola.add(per4);
                cola.add(per5);
                System.out.println("---------------------------------------------");
                System.out.println("Hay 5 Personas");
                while (!cola.isEmpty()) {
                    System.out.println("La primera persona es " + cola);
                    cola.poll();
                    System.out.print("Desea acabar el proceso? si/no: ");
                    String z=sc.next();
                    if (z.equals("si")){
                        cola.clear();
                    } else if (z.equals("no")){}
                }
            }
            if (x==2){
                System.out.println("Persona 1");
                System.out.print("Ingrese el nombre: ");
                String nom1=sc.next();
                per1.setNombre(nom1);
                System.out.print("Ingrese el apellido paterno: ");
                String apeP1=sc.next();
                per1.setApellidoPaterno(apeP1);
                System.out.print("Ingrese el apellido materno: ");
                String apeM1=sc.next();
                per1.setApellidoMaterno(apeM1);
                System.out.print("Ingrese el numero de ticket: ");
                int tik1=sc.nextInt();
                per1.setTicket(tik1);
                cola.add(per1);
                cola.add(per2);
                cola.add(per3);
                cola.add(per4);
                cola.add(per5);
                System.out.println("---------------------------------------------");
                System.out.println("Hay 5 Personas");
                while (!cola.isEmpty()) {
                    System.out.println("La primera persona es " + cola);
                    cola.poll();
                    System.out.print("Desea acabar el proceso? si/no: ");
                    String z=sc.next();
                    if (z.equals("si")){
                        cola.clear();
                    } else if (z.equals("no")){}
                }
            }
        } while (x!=0);
    }
}
