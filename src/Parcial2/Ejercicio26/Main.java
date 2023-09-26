package Parcial2.Ejercicio26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Animal a1=new Animal("Perro");
        Animal a2=new Animal("Gato");
        Animal a3=new Animal("Avestruz");
        Animal a4=new Animal("Gato");
        ArrayList<Animal> lista=new ArrayList<>();
        System.out.print("Desea ingresar los nombres manualmente?(si/no): ");
        String x1=sc.next();
        if (x1.equals("si")){
            System.out.print("Ingrese la especie del primer animal: ");
            String e1=sc.next();
            a1.setEspecie(e1);
            lista.add(a1);
            System.out.print("Desea ingresar el siguiente animal?(si/no): ");
            String x2=sc.next();
            if (x2.equals("si")){
                System.out.print("Ingrese la especie del segundo animal: ");
                String e2=sc.next();
                a2.setEspecie(e2);
                lista.add(a2);
                System.out.print("Desea ingresar el siguiente animal?(si/no): ");
                String x3=sc.next();
                if (x3.equals("si")){
                    System.out.print("Ingrese la especie del tercer animal: ");
                    String e3=sc.next();
                    a3.setEspecie(e3);
                    lista.add(a3);
                    System.out.print("Desea ingresar el siguiente animal?(si/no): ");
                    String x4=sc.next();
                    if (x4.equals("si")){
                        System.out.print("Ingrese la especie del cuarto animal: ");
                        String e4=sc.next();
                        a4.setEspecie(e4);
                        lista.add(a4);
                        System.out.println("----------------------------------------");
                        for (Animal an1 : lista) {
                            String aux= an1.getEspecie();
                            int cont=0;
                            for (Animal an2 : lista) {
                                if (an2.getEspecie().equals(aux)){
                                    cont++;
                                }
                            }
                            boolean y=false;
                            for (int i=0;i<4;i++){
                                if (lista.get(i).getEspecie().equals(aux)){
                                    y=true;
                                    break;
                                }
                                if (!y){
                                    System.out.println("La especie "+aux+", tiene "+cont+" Animales");
                                }
                            }
                        }
                    } else {
                        lista.add(a4);
                        System.out.println("----------------------------------------");
                        for (Animal an1 : lista) {
                            String aux= an1.getEspecie();
                            int cont=0;
                            for (Animal an2 : lista) {
                                if (an2.getEspecie().equals(aux)){
                                    cont++;
                                }
                            }
                            boolean y=false;
                            for (int i=0;i<4;i++){
                                if (lista.get(i).getEspecie().equals(aux)){
                                    y=true;
                                    break;
                                }
                                if (!y){
                                    System.out.println("La especie "+aux+", tiene "+cont+" Animales");
                                }
                            }
                        }
                    }
                } else {
                    lista.add(a3);
                    lista.add(a4);
                    System.out.println("----------------------------------------");
                    for (Animal an1 : lista) {
                        String aux= an1.getEspecie();
                        int cont=0;
                        for (Animal an2 : lista) {
                            if (an2.getEspecie().equals(aux)){
                                cont++;
                            }
                        }
                        boolean y=false;
                        for (int i=0;i<4;i++){
                            if (lista.get(i).getEspecie().equals(aux)){
                                y=true;
                                break;
                            }
                            if (!y){
                                System.out.println("La especie "+aux+", tiene "+cont+" Animales");
                            }
                        }
                    }
                }
            } else {
                lista.add(a2);
                lista.add(a3);
                lista.add(a4);
                System.out.println("----------------------------------------");
                for (Animal an1 : lista) {
                    String aux= an1.getEspecie();
                    int cont=0;
                    for (Animal an2 : lista) {
                        if (an2.getEspecie().equals(aux)){
                            cont++;
                        }
                    }
                    boolean y=false;
                    for (int i=0;i<4;i++){
                        if (lista.get(i).getEspecie().equals(aux)){
                            y=true;
                            break;
                        }
                        if (!y){
                            System.out.println("La especie "+aux+", tiene "+cont+" Animales");
                        }
                    }
                }
            }
        } else {
            lista.add(a1);
            lista.add(a2);
            lista.add(a3);
            lista.add(a4);
            System.out.println("----------------------------------------");
            for (Animal an1 : lista) {
                String aux= an1.getEspecie();
                int cont=0;
                for (Animal an2 : lista) {
                    if (an2.getEspecie().equals(aux)){
                        cont++;
                    }
                }
                boolean y=false;
                for (int i=0;i<4;i++){
                    if (lista.get(i).getEspecie().equals(aux)){
                        y=true;
                        break;
                    }
                    if (!y){
                        System.out.println("La especie "+aux+", tiene "+cont+" Animales");
                    }
                }
            }
        }
    }
}
