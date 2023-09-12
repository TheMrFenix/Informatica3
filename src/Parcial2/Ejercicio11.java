package parcial2;
import java.util.LinkedList;
import java.util.Queue;
public class Ejercicio11 {
    public static void main(String[] args) {
        Queue<Integer> cola=new LinkedList<>();
        int sum=0;
        for (int i=1; i<=10; i++){
            cola.add(i);
            sum=sum+i;
        }
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("---------------------------");
        System.out.println(sum);
    }
}
