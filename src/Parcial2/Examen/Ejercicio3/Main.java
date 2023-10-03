package Parcial2.Examen.Ejercicio3;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Laptop lap1=new Laptop("L13","Lenovo","ThinkPad",1);
        Laptop lap2=new Laptop("EliteBook 845","HP","G9",2);
        Laptop lap3=new Laptop("Strix G16","Asus","ROG",3);
        Laptop lap4=new Laptop("Stealth","MSI","GS66",4);
        ArrayList<Laptop> lista=new ArrayList<>();
        int x=0;
        do {
            System.out.println("Menu principal de Ejercicio 1");
            System.out.println("1- Continuar sin rellenar");
            System.out.println("2- Rellenar los datos");
            System.out.println("0- Salir");
            System.out.print("-> Elija una opcion: ");
            x=sc.nextInt();
            if (x==1){
                lista.add(lap1);
                lista.add(lap2);
                lista.add(lap3);
                lista.add(lap4);
                System.out.println("---------------------------------------------");
                for (Laptop lap : lista) {
                    while (!lista.isEmpty()){
                        System.out.println("Todos los elementos en la lista");
                        System.out.println(lista);
                        System.out.print("Ingrese el nombre de laptop que busca: ");
                        String bus1=sc.next();
                        if (bus1.equals(lap.getNombre())){
                            System.out.println("Resultado");
                            System.out.println(lap);
                        }
                        System.out.print("Ingrese el nombre de la laptop que desea eliminar: ");
                        String eli1=sc.next();
                        if (eli1.equals(lap.getNombre())){
                            System.out.println("Resultado eliminado");
                            lista.remove(lap);
                        }
                        System.out.print("Desea acabar el proceso? si/no: ");
                        String z=sc.next();
                        if (z.equals("si")){
                            lista.clear();
                        } else if (z.equals("no")){}
                    }
                }
            }
            if (x==2){
                System.out.println("Laptop 1");
                System.out.print("Ingrese el nombre: ");
                String nom1=sc.next();
                lap1.setNombre(nom1);
                System.out.print("Ingrese La Marca: ");
                String mar1=sc.next();
                lap1.setMarca(mar1);
                System.out.print("Ingrese el Tipo: ");
                String ti1=sc.next();
                lap1.setTipo(ti1);
                System.out.print("Ingrese el codigo: ");
                int co1=sc.nextInt();
                lap1.setCodigo(co1);
                lista.add(lap1);
                lista.add(lap2);
                lista.add(lap3);
                lista.add(lap4);
                System.out.println("---------------------------------------------");
            }
        } while (x!=0);
    }
}
