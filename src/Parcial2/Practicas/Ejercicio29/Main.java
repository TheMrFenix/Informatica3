package Parcial2.Ejercicio29;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cb1=new CuentaBancaria("Alejandro",2500.0);
        CuentaBancaria cb2=new CuentaBancaria("Alejandro",526.3);
        CuentaBancaria cb3=new CuentaBancaria("Alejandro",25000.5);
        ArrayList<CuentaBancaria> lista=new ArrayList<>();
        System.out.println("Cuenta Bancaria 1");
        System.out.println(cb1.toString());
        lista.add(cb1);
        System.out.println("Cuenta Bancaria 2");
        System.out.println(cb2.toString());
        lista.add(cb2);
        System.out.println("Cuenta bancaria 3");
        System.out.println(cb3.toString());
        lista.add(cb3);
        Double sum=0.0;
        for (CuentaBancaria cb : lista) {
            sum=sum+cb.getSaldo();
        }
        System.out.println("El saldo total es de "+sum+" Bs");
    }
}
