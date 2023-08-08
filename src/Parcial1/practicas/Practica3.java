package Parcial1.practicas;
import java.util.Scanner;
public class Practica3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("***   Menu   ***");
            System.out.println("1- Practica 4.1");
            System.out.println("2- Practica 4.2");
            System.out.println("3- Practica 4.3");
            System.out.println("4- Practica 4.4");
            System.out.println("5- Practica 4.5");
            System.out.println("6- Practica 4.6");
            System.out.println("7- Practica 4.7");
            System.out.println("8- Practica 4.8");
            System.out.println("9- Practica 4.9");
            System.out.println("10- Practica 4.10");
            System.out.println("11- Practica 4.11");
            System.out.println("12- Practica 4.12");
            System.out.println("13- Practica 4.13");
            System.out.println("14- Practica 4.14");
            System.out.println("15- Practica 4.15");
            System.out.println("16- Practica 4.16");
            System.out.println("0- Salir");
            System.out.print("Elija una opcion: ");
            x=sc.nextInt();
            switch (x){
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
                case 7:
                    Ejercicio7();
                    break;
                case 8:
                    Ejercicio8();
                    break;
                case 9:
                    Ejercicio9();
                    break;
                case 10:
                    Ejercicio10();
                    break;
                case 11:
                    Ejercicio11();
                    break;
                case 12:
                    Ejercicio12();
                    break;
                case 13:
                    Ejercicio13();
                    break;
                case 14:
                    Ejercicio14();
                    break;
                case 15:
                    Ejercicio15();
                    break;
                case 16:
                    Ejercicio16();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (x != 0);
    }
    public static void Ejercicio1(){
        Scanner sc=new Scanner(System.in);
        int c=1;
        double va,su=0;
        System.out.println("Practica 4.1");
        while (c<=10){
            System.out.print("Ingrese el valor a sumar ("+c+"): ");
            va=sc.nextDouble();
            su=su+va;
            c++;
        }
        System.out.println("La suma acumulada es "+su);
    }
    public static void Ejercicio2(){
        Scanner sc=new Scanner(System.in);
        int c=1;
        double va,su=0;
        System.out.println("Practica 4.2");
        do {
            System.out.print("Ingrese el valor por sumar ("+c+"): ");
            va=sc.nextDouble();
            su=su+va;
            c++;
        } while (c<=10);
        System.out.println("La suma acumulada es "+su);
    }
    public static void Ejercicio3(){
        Scanner sc=new Scanner(System.in);
        double va,su=0;
        System.out.println("Practica 4.3");
        for (int c=1;c<=10;c++){
            System.out.print("Ingrese el valor a sumar ("+c+"): ");
            va=sc.nextDouble();
            su=su+va;
        }
        System.out.println("La suma acumulada es "+su);
    }
    public static void Ejercicio4(){
        Scanner sc=new Scanner(System.in);
        int c=1,ed,su=0,nu;
        double pr;
        System.out.println("Practica 4.4");
        System.out.print("Ingrese el numero de alumnos: ");
        nu=sc.nextInt();
        while (c<=nu){
            System.out.print("Ingrese la edad del alumno ("+c+"): ");
            ed=sc.nextInt();
            su=su+ed;
            c++;
        }
        pr=su/nu;
        System.out.println("La edad promedio del grupo es "+pr);
    }
    public static void Ejercicio5(){
        Scanner sc=new Scanner(System.in);
        int c=0;
        double pr=0,su=0,es;
        System.out.println("Practica 4.5");
        System.out.print("Ingrese la estatura de la primera persona: ");
        es=sc.nextDouble();
        while (es>0){
            su=su/es;
            System.out.print("Ingrese la estatura de la siguiente persona :");
            es=sc.nextDouble();
            c++;
        }
        if (c==0){
            System.out.println("No hay estatura");
        } else {
            pr=su/c;
        }
        System.out.println("De un grupo de "+c+" personas, la altura promedio es "+pr);
    }
    public static void Ejercicio6(){
        Scanner sc=new Scanner(System.in);
        double ah=0;
        int m=1,ca;
        System.out.println("Practica 4.6");
        while (m<=12){
            System.out.print("Ingrese el ahorro en el mes ("+m+"): ");
            ca=sc.nextInt();
            ah=ah+ca;
            m++;
            System.out.println("El ahorro del mes es "+ah);
        }
        System.out.println("El ahorro logrado es "+ah);
    }
    public static void Ejercicio7(){
        Scanner sc=new Scanner(System.in);
        int c=1,ca,cp=0,cn=0;
        double nu;
        System.out.println("Ejercicio 4.7");
        System.out.print("Ingrese el numero de cantidades: ");
        nu=sc.nextDouble();
        do {
            System.out.print("Ingrese la cantidad ("+c+"): ");
            ca=sc.nextInt();
            if (ca>0){
                cp++;
            } else {
                cn++;
            }
            c++;
        } while (c<=nu);
        System.out.println("La cantidad de numeros positivos es "+cp);
        System.out.println("La cantidad de numeros negativos es "+cn);
    }
    public static void Ejercicio8(){
        int n=0;
        System.out.println("Ejercicio 4.8");
        while (n<=100){
            System.out.println(n);
            n=n+2;
        }
    }
    public static void Ejercicio9(){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,m=1,n;
        System.out.println("Ejercicio 4.9");
        System.out.print("Ingrese la cantidad de termino: ");
        n=sc.nextInt();
        System.out.println("los dos primeros terminos son "+a+" "+b);
        while (m<=(n-2)){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            m++;
        }
    }
    public static void Ejercicio10(){
        Scanner sc=new Scanner(System.in);
        int d=1,sh=0,ht;
        double ph,su;
        System.out.println("Ejericico 4.10");
        System.out.print("Ingrese el pago por hora: ");
        ph=sc.nextDouble();
        while (d<=6){
            System.out.print("Ingrese las horas trabajadas: ");
            ht=sc.nextInt();
            sh=sh+ht;
            d++;
        }
        su=sh*ph;
        System.out.println("El sueldo semanal es de "+su+" bs, por "+sh+" horas semanales trabajadas");
    }
    public static void Ejercicio11(){
        double r,ka=70,kb=150;
        r=kb-ka;
        System.out.println("Ejercicio 4.11");
        while (r>0){
            ka++;
            kb--;
            r=kb-ka;
        }
        if (r==0){
            ka=kb;
        } else {
            ka=ka-0.5;
        }
        System.out.println("El punto de encuentro esta a "+ka+" km");
    }
    public static void Ejercicio12(){
        Scanner sc=new Scanner(System.in);
        double n,cn=1,v,t1=0,t2=0,t3=0,tt=0;
        int a=0,b=0,c=0;
        System.out.println("Ejercicio 4.12");
        System.out.print("Ingrese el numero de ventas: ");
        n=sc.nextDouble();
        while (cn<=n){
            System.out.print("Ingrese el monto de la venta: ");
            v=sc.nextDouble();
            if (v>1000){
                a++;
                t1=t1+v;
            } else {
                if (v>500){
                    b++;
                    t2=t2+v;
                } else {
                    c++;
                    t3=t3+v;
                }
            }
            tt=tt+v;
            cn++;
        }
        System.out.println("La cantidad de ventas mayores a mil son "+a);
        System.out.println("La cantidad de ventas mayores a quinientos y menoresa a mil son "+b);
        System.out.println("La cantidad de ventas menores a quinientos son "+c);
        System.out.println("El total de ventas tipo A es "+t1);
        System.out.println("El total de ventas tipo B es "+t2);
        System.out.println("El total de ventas tipo C es "+t3);
        System.out.println("El total de ventas es "+tt);
    }
    public static void Ejercicio13(){
        double p=5.00,t=0;
        System.out.println("Ejercicio 4.13");
        for (int i=1;i<20;i++){
            p=p*2;
            System.out.println("El pago mesual es "+p+" Bs");
            t=t+p;
        }
        System.out.println("El pago total es de "+t+" Bs");
    }
    public static void Ejercicio14(){
        Scanner sc=new Scanner(System.in);
        int n;
        double ht,ph,ss,tot=0;
        System.out.println("Ejercicio 4.14");
        System.out.print("Ingrese el numero de empleados: ");
        n=sc.nextInt();
        for (int i=1;i<n;i++){
            System.out.println("Empleado "+i);
            System.out.print("Ingrese las horas trabajadas: ");
            ht=sc.nextDouble();
            System.out.print("Ingrese el pago por hora: ");
            ph=sc.nextDouble();
            ss=ht*ph;
            System.out.println("El sueldo semanal es de "+ss+" Bs");
            tot=tot+ss;
        }
        System.out.println("El pago total es de "+tot+" Bs");
    }
    public static void Ejercicio15(){
        Scanner sc=new Scanner(System.in);
        int n,dt;
        double ht,ph,sh=0,ss,tot=0;
        System.out.println("Ejercicio 4.15");
        System.out.print("Ingrese el numero de trabajadores: ");
        n=sc.nextInt();
        for (int i=1;i<n;i++){
            System.out.println("Empleado "+i);
            System.out.print("Ingrese el pago por hora: ");
            ph=sc.nextDouble();
            System.out.print("Ingrese los dias trabajados: ");
            dt=sc.nextInt();
            for (int d=1;d<dt;d++){
                System.out.println("Dia "+d);
                System.out.print("Ingrese las horas trabajadas: ");
                ht=sc.nextDouble();
                sh=sh+ht;
            }
            ss=sh*ph;
            System.out.println("El sueldo semanal es de "+ss+" Bs");
            tot=tot+ss;
        }
        System.out.println("El pago total es de "+tot+" Bs");
    }
    public static void Ejercicio16(){
        Scanner sc=new Scanner(System.in);
        int ci,ti,em;
        double tt=0,st=0,se=0,ve;
        System.out.println("Ejercicio 4.16");
        System.out.print("Ingrese la camtidad de ciudades donde tiene una tienda: ");
        ci=sc.nextInt();
        for (int i=1;i<ci;i++){
            System.out.println("Ciudad "+i);
            System.out.print("Ingrese el numero de tiendas en la ciudad: ");
            ti=sc.nextInt();
            for (int j=1;j<ti;j++){
                System.out.println("Tienda "+j);
                System.out.print("Ingrese el numero de empleados en la tienda: ");
                em=sc.nextInt();
                for (int k=1;k<em;k++){
                    System.out.println("Empleado "+em);
                    System.out.print("Ingrese el numero de ventas por empleados: ");
                    ve=sc.nextDouble();
                    se=se+ve;
                    System.out.println("Las ventas en la tienda son de "+se);
                }
                st=st+se;
                System.out.println("Las ventas en la ciudad son de "+st);
            }
            tt=tt+st;
            System.out.println("La antidad recaudada es de "+tt+" Bs");
        }
        System.out.println();
    }
}
