package Parcial2.Ejercicio25;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Producto p1=new Producto("Papaya",10.0);
        Producto p2=new Producto("Jamon",20.0);
        Producto p3=new Producto("Arroz",15.0);
        ArrayList<Producto> lista=new ArrayList<>();
        System.out.print("Desea ingresar los productos manualmente?(si/no): ");
        String x1=sc.next();
        if (x1.equals("si")){
            System.out.print("Ingrese el nombre del primer producto: ");
            String n1=sc.next();
            p1.setNombre(n1);
            System.out.print("Ingrese el precio del primer producto: ");
            Double pr1=sc.nextDouble();
            p1.setPrecio(pr1);
            lista.add(p1);
            System.out.print("Desea ingresar el siguiente producto?(si/no): ");
            String x2=sc.next();
            if (x2.equals("si")){
                System.out.print("Ingrese el nombre del segundo producto: ");
                String n2=sc.next();
                p2.setNombre(n2);
                System.out.print("Ingrese el precio del segundo producto: ");
                Double pr2=sc.nextDouble();
                p2.setPrecio(pr2);
                lista.add(p2);
                System.out.print("Desea ingresar el siguiente producto?(si/no): ");
                String x3=sc.next();
                if (x3.equals("si")){
                    System.out.print("Ingrese el nombre del tercer producto: ");
                    String n3=sc.next();
                    p3.setNombre(n3);
                    System.out.print("Ingrese el precio del tercer producto: ");
                    Double pr3=sc.nextDouble();
                    p3.setPrecio(pr3);
                    lista.add(p3);
                    System.out.println("----------------------------------------");
                    System.out.println("El precio mas alto");
                    Double m=0.0;
                    Producto aux=null;
                    for (Producto p: lista){
                        if (p.getPrecio()>m){
                            m=p.getPrecio();
                            aux=p;
                        }
                    }
                    System.out.println(aux.toString());
                } else {
                    lista.add(p3);
                    System.out.println("----------------------------------------");
                    System.out.println("El precio mas alto");
                    Double m=0.0;
                    Producto aux=null;
                    for (Producto p: lista){
                        if (p.getPrecio()>m){
                            m=p.getPrecio();
                            aux=p;
                        }
                    }
                    System.out.println(aux.toString());
                }
            } else {
                lista.add(p2);
                lista.add(p3);
                System.out.println("----------------------------------------");
                System.out.println("El precio mas alto");
                Double m=0.0;
                Producto aux=null;
                for (Producto p: lista){
                    if (p.getPrecio()>m){
                        m=p.getPrecio();
                        aux=p;
                    }
                }
                System.out.println(aux.toString());
            }
        } else {
            lista.add(p1);
            lista.add(p2);
            lista.add(p3);
            System.out.println("----------------------------------------");
            System.out.println("El precio mas alto");
            Double m=0.0;
            Producto aux=null;
            for (Producto p: lista){
                if (p.getPrecio()>m){
                    m=p.getPrecio();
                    aux=p;
                }
            }
            System.out.println(aux.toString());
        }
    }
}
