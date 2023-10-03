package Parcial2.Practicas.Ejercicio4;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<String> cola=new LinkedList<>();
        Persona p1=new Persona("Don Pablo","Fernandes","Julius");
        Persona p2=new Persona("Pedro","Torres","Rojas");
        Persona p3=new Persona("Leydi","Cuevas","Canaviri");
        Persona p4=new Persona("Jhony","Ramirez","Ortuño");
        Persona p5=new Persona("Carla","Guayacuma","Fuentes");
        cola.add(p1.getNombre());
        cola.add(p1.getApellido_paterno());
        cola.add(p1.getApellido_materno());
        cola.add(p2.getNombre());
        cola.add(p2.getApellido_paterno());
        cola.add(p2.getApellido_materno());
        cola.add(p3.getNombre());
        cola.add(p3.getApellido_paterno());
        cola.add(p3.getApellido_materno());
        cola.add(p4.getNombre());
        cola.add(p4.getApellido_paterno());
        cola.add(p4.getApellido_materno());
        cola.add(p5.getNombre());
        cola.add(p5.getApellido_paterno());
        cola.add(p5.getApellido_materno());
        System.out.println("Nombre completo:");
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
