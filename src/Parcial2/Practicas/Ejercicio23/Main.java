package Parcial2.Practicas.Ejercicio23;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Empleado per1=new Empleado("Pedro",1000.0);
        Empleado per2=new Empleado("Juan",2000.0);
        Stack<Empleado>pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Desea ingresar los datos a mano? (si/no): ");
        String x=sc.next();
        if (x.equals("si")){
            System.out.print("Ingrese el nombre del Trabajador1: ");
            String n=sc.next();
            per1.setNombre(n);
            System.out.print("Ingrese el salario del Trabajador1: ");
            Double m=sc.nextDouble();
            per1.setSalario(m);
            System.out.print("Desea llenar los datos del Trabajador 2?(si/no): ");
            String x2=sc.next();
            pila.add(per1);
            if (x2.equals("si")){
                System.out.print("Ingrese el nombre del trabajador 2: ");
                String n2=sc.next();
                per2.setNombre(n2);
                System.out.print("Ingrese el salario del trabajador2: ");
                Double m2=sc.nextDouble();
                per2.setSalario(m2);
                pila.add(per2);
            } else {
                pila.add(per2);
            }
        } else {
            pila.add(per1);
            pila.add(per2);
        }
        System.out.print("Ingrese el valor de salario que desea revisar: ");
        Double salm=sc.nextDouble();
        for (Empleado e : pila) {
            if (e.getSalario() > salm) {
                System.out.println(e.getNombre());
            }
        }
    }

}
