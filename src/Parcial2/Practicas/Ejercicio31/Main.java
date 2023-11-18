package Parcial2.Practicas.Ejercicio31;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Empleado em1=new Empleado("Raul",230.5);
        Empleado em2=new Empleado("Alex",500.0);
        Empleado em3=new Empleado("Fabio",1500.0);
        ArrayList<Empleado>lista=new ArrayList<>();
        System.out.println("Empleado 1");
        System.out.println(em1.toString());
        lista.add(em1);
        System.out.println("Empleado 2");
        System.out.println(em2.toString());
        lista.add(em2);
        System.out.println("Empleado 3");
        System.out.println(em3.toString());
        lista.add(em3);
        double sum=0.0;
        for (Empleado em : lista) {
            sum+=em.getSalario();
        }
        double sp=sum/lista.size();
        System.out.println("El salario promedio es de "+sp+" Bs");
    }
}
