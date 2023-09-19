package Parcial2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> pila = new ArrayList<>();
        System.out.print("Ingrese la cantidad de palabras que desea: ");
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            System.out.print("Ingrese una palabra: ");
            String pal=sc.next();
            pila.add(pal);
        }
        Collections.sort(pila);
        for (String c : pila) {
            System.out.println(c);
        }
    }
}
