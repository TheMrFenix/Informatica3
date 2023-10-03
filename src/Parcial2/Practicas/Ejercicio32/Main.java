package Parcial2.Ejercicio32;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Fruta fr1=new Fruta("Manzana",40);
        Fruta fr2=new Fruta("Naranja",55);
        Fruta fr3=new Fruta("Pera", 60);
        ArrayList<Fruta> lista=new ArrayList<>();
        System.out.println("Fruta 1");
        System.out.println(fr1.toString());
        lista.add(fr1);
        System.out.println("Fruta 2");
        System.out.println(fr2.toString());
        lista.add(fr2);
        System.out.println("Fruta 3");
        System.out.println(fr3.toString());
        lista.add(fr3);
        List<Fruta> frf = lista.stream()
                .filter(fruta -> fruta.getCalorias()>50)
                .collect(Collectors.toList());
        System.out.println("Frutas con más de 50 calorías por porción:");
        for (Fruta fruta : frf) {
            System.out.println("Nombre: " + fruta.getNombre() + ", Calorías por porción: " + fruta.getCalorias());
        }
    }
}
