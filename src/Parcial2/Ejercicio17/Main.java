package Parcial2.Ejercicio17;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Persona per1=new Persona("Pedro","Torres",20);
        Persona per2=new Persona("Pablo","Aguilar",30);
        Stack<Persona> pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Desea ingresar datos? (si/no): ");
        String x=sc.next();
        if (x.equals("si")){
            System.out.print("Ingrese el nombre de la persona1: ");
            String n=sc.next();
            per1.setNombre(n);
            System.out.print("Ingrese el apellido de la persona1: ");
            String m=sc.next();
            per1.setApellido(m);
            System.out.print("Ingrese la edad de la persona1: ");
            int ñ=sc.nextInt();
            per1.setEdad(ñ);
            System.out.print("Desea llenar los datos de la persona 2?(si/no): ");
            String x2=sc.next();
            pila.add(per1);
            if (x2.equals("si")){
                System.out.print("Ingrese el nombre de la persona2: ");
                String n2=sc.next();
                per2.setNombre(n2);
                System.out.print("Ingrese el apellido de la persona2: ");
                String m2=sc.next();
                per2.setApellido(m2);
                System.out.print("Ingrese la edad de la persona2: ");
                int ñ2=sc.nextInt();
                per2.setEdad(ñ2);
                pila.add(per2);
                for (Persona pe1 : pila) {
                    System.out.println(pe1);
                }
            } else {
                pila.add(per2);
                for (Persona pe1 : pila) {
                    System.out.println(pe1);
                }
            }
        } else {
            pila.add(per1);
            pila.add(per2);
            for (Persona pe1 : pila) {
                System.out.println(pe1);
            }
        }
    }
}
