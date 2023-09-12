package parcial2;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio12 {
    public static void main(String[] args) {
        Queue<String> cola1=new LinkedList<>();
        Queue<String> cola2=new LinkedList<>();
        Queue<String> cola3=new LinkedList<>();
        cola3.add("A");
        cola3.add("B");
        cola3.add("C");
        cola3.add("D");
        cola3.add("E");
        cola3.add("1");
        cola3.add("2");
        cola3.add("3");
        cola3.add("4");
        cola3.add("5");
        for (String s:cola3) {
            System.out.println(s);
        }
    }
}
