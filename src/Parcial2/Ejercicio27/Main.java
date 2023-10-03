package Parcial2.Ejercicio27;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Estudiante es1=new Estudiante("Pedro",20.0);
        Estudiante es2=new Estudiante("Juan",50.0);
        Estudiante es3=new Estudiante("Carlos",66.0);
        Estudiante es4=new Estudiante("Mario",21.0);
        Estudiante es5=new Estudiante("Alan",80.0);
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
        System.out.println("Estudiante 4");
        System.out.println(es4.toString());
        lista.add(es4);
        System.out.println("Estudiante 5");
        System.out.println(es5.toString());
        lista.add(es5);
        for (Estudiante es : lista) {
            if (es.getCalificacion()>70.0){
                System.out.println("El estudiante con mayor calificacion es "+es.getNombre()+" con una nota de "+es.getCalificacion());
            }
        }

    }
}
