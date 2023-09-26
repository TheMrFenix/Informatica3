package Parcial2.Ejercicio24;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona p1=new Persona("Pablo");
        Persona p2=new Persona("Jóse");
        Persona p3=new Persona("Alva");
        ArrayList<String> lista=new ArrayList<>();
        System.out.print("Desea ingresar los nombres manualmente?(si/no): ");
        String x1=sc.next();
        if (x1.equals("si")){
            System.out.print("Ingrese el primer nombre: ");
            String n1=sc.next();
            p1.setNombre(n1);
            lista.add(n1);
            System.out.print("Desea ingresar el siguiente nombre?(si/no): ");
            String x2=sc.next();
            if (x2.equals("si")){
                System.out.print("Ingrese el nombre de la segunda persona: ");
                String n2=sc.next();
                p2.setNombre(n2);
                lista.add(n2);
                System.out.print("Desea ingresar el siguiente nombre?(si/no): ");
                String x3=sc.next();
                if (x3.equals("si")){
                    System.out.print("Ingrese el nombre de la tercera persona: ");
                    String n3=sc.next();
                    p3.setNombre(n3);
                    lista.add(n3);
                    System.out.println("----------------------------------------");
                    System.out.println("Lista desordenada");
                    for (String s : lista) {
                        System.out.println(s.toString());
                    }
                    System.out.println("Lista ordenada");
                    Collections.sort(lista);
                    for (String s : lista) {
                        System.out.println(s.toString());
                    }
                } else {
                    lista.add(p3.getNombre());
                    System.out.println("----------------------------------------");
                    System.out.println("Lista desordenada");
                    for (String s : lista) {
                        System.out.println(s.toString());
                    }
                    System.out.println("Lista ordenada");
                    Collections.sort(lista);
                    for (String s : lista) {
                        System.out.println(s.toString());
                    }
                }
            } else {
                lista.add(p2.getNombre());
                lista.add(p3.getNombre());
                System.out.println("----------------------------------------");
                System.out.println("Lista desordenada");
                for (String s : lista) {
                    System.out.println(s.toString());
                }
                System.out.println("Lista ordenada");
                Collections.sort(lista);
                for (String s : lista) {
                    System.out.println(s.toString());
                }
            }
        } else {
            lista.add(p1.getNombre());
            lista.add(p2.getNombre());
            lista.add(p3.getNombre());
            System.out.println("----------------------------------------");
            System.out.println("Lista desordenada");
            for (String s : lista) {
                System.out.println(s.toString());
            }
            System.out.println("Lista ordenada");
            Collections.sort(lista);
            for (String s : lista) {
                System.out.println(s.toString());
            }
        }
    }
}
