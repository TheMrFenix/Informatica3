package Parcial2.Ejercicio33;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Estudiante es1=new Estudiante("Javier",4.2);
        Estudiante es2=new Estudiante("Martin",6.5);
        Estudiante es3=new Estudiante("Carmila",8.1);
        ArrayList<Estudiante> lista=new ArrayList<>();
        System.out.println("Estudiante 1");
        System.out.println(es1.toString());
        lista.add(es1);
        System.out.println("Estudiante 2");
        System.out.println(es2.toString());
        lista.add(es2);
        System.out.println("Estudiante 3");
        System.out.println(es3.toString());
        lista.add(es3);
        List<Estudiante> esf = lista.stream()
                .filter(estudiante -> estudiante.getPuntos() > 5.0)
                .collect(Collectors.toList());
        System.out.println("Estudiantes con más de 5.0 puntos:");
        for (Estudiante estudiante : esf) {
            System.out.println(estudiante.getNombre() + " - Puntos: " + estudiante.getPuntos());
        }
    }
}
