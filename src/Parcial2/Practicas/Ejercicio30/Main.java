package Parcial2.Ejercicio30;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Producto pr1=new Producto("Bateria");
        Producto pr2=new Producto("Zapato");
        Producto pr3=new Producto("Cloro");
        ArrayList<Producto> lista=new ArrayList<>();
        System.out.println("Producto 1");
        System.out.println(pr1.toString());
        lista.add(pr1);
        System.out.println("Producto 2");
        System.out.println(pr2.toString());
        lista.add(pr2);
        System.out.println("Producto 3");
        System.out.println(pr3);
        lista.add(pr3);
        Producto prl = null;
        int lm = 0;
        for (Producto pr : lista) {
            String n = pr.getNombre();
            int ln = n.length();

            if (ln > lm) {
                lm = ln;
                prl = pr;
            }
        }
        System.out.println("El nombre mas largo es "+prl);
    }
}
