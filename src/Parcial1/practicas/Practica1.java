package Parcial1.practicas;
import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("***   Menu   ***");
            System.out.println("1*  Ejercicio 2.1");
            System.out.println("2*  Ejercicio 2.2");
            System.out.println("3*  Ejercicio 2.3");
            System.out.println("4*  Ejercicio 2.4");
            System.out.println("5*  Ejercicio 2.5");
            System.out.println("6*  Ejercicio 2.6");
            System.out.println("7*  Ejercicio 2.7");
            System.out.println("8*  Ejercicio 2.8");
            System.out.println("9*  Ejercicio 2.9");
            System.out.println("10* Ejercicio 2.10");
            System.out.println("11* Ejercicio 2.11");
            System.out.println("0* salir");
            System.out.print("elija una opcion: ");
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
                default:
                    System.out.println("opcion equivocada");
            }
        } while (x != 0);
    }
    public static void Ejercicio1(){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Ejercicio 2.1");
        System.out.print("Ingrese el primer numero: ");
        a=sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b= sc.nextInt();
        c=a+b;
        System.out.println("El resultado de "+a+"+"+b+" es "+c);
    }
    public static void Ejercicio2(){
        Scanner sc=new Scanner(System.in);
        int c1,c2,c3,c4,r,p;
        System.out.println("Ejercicio2.2");
        System.out.print("Ingrese la calificacion 1: ");
        c1=sc.nextInt();
        System.out.print("Ingrese la calificacion 2: ");
        c2=sc.nextInt();
        System.out.print("Ingrese la calificacion 3: ");
        c3=sc.nextInt();
        System.out.print("Ingrese la calificacion 4: ");
        c4=sc.nextInt();
        r=c1+c2+c3+c4;
        p=r/4;
        System.out.println("El resultado total es de "+r);
        System.out.println("El promedio es de "+p);
    }
    public static void Ejercicio3(){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Ejercicio 2.3");
        System.out.print("Ingrese la altura: ");
        a=sc.nextInt();
        System.out.print("Ingrese la base: ");
        b=sc.nextInt();
        c=a*b;
        System.out.println("El Area es "+c);
    }
    public static void Ejercicio4(){
        Scanner sc=new Scanner(System.in);
        double r,pi=3.1416,a;
        System.out.println("Ejercicio 2.4");
        System.out.print("Ingrese el radio de la circunferencia: ");
        r= sc.nextDouble();
        a=(r*r)*pi;
        System.out.print("El area de la circunferencia es "+a);
    }
    public static void Ejercicio5(){
        Scanner sc=new Scanner(System.in);
        int at,au,bu,ar;
        double areat,arear,area;
        System.out.println("Ejercicio 2.5");
        System.out.print("Ingrese la altura mas alta: ");
        au=sc.nextInt();
        System.out.print("Ingrese la base: ");
        bu=sc.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        ar=sc.nextInt();
        at=au-ar;
        areat=(bu*at)/2;
        arear=bu*ar;
        area=areat+arear;
        System.out.println("El area total es "+area);
    }
    public static void Ejercicio6(){
        Scanner sc=new Scanner(System.in);
        double bu,ht,cf,areat,areac,pi=3.1416,area;
        System.out.println("Ejercicio 2.6");
        System.out.print("Ingrese la base: ");
        bu=sc.nextDouble();
        System.out.print("Ingrese la hipitenusa: ");
        ht=sc.nextDouble();
        cf=(ht*ht)+(bu*bu)/2;
        areat=2*(bu*cf)/2;
        areac=(pi*bu*bu)/2;
        area=areat+areac;
        System.out.println("El area es "+area);
    }
    public static void Ejercicio7(){
        Scanner sc=new Scanner(System.in);
        int l;
        double pg,cg,gl;
        System.out.println("Ejercicio 2.7");
        System.out.print("Ingrese la cantidad de litros de leche: ");
        l=sc.nextInt();
        System.out.print("Ingrese el preciio del galon: ");
        pg=sc.nextDouble();
        cg=l/3.785;
        gl=pg*cg;
        System.out.println("La ganancia obtenida es "+gl+" Bs");
    }
    public static void Ejercicio8(){
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2,x,y,d;
        System.out.println("Ejercicio 2.8");
        System.out.print("Ingrese la coordenada x1: ");
        x1=sc.nextDouble();
        System.out.print("Ingrese la coordenada y1: ");
        y1=sc.nextDouble();
        System.out.print("Ingrese la coordenada x2: ");
        x2=sc.nextDouble();
        System.out.print("Ingrese la coordenada y2: ");
        y2=sc.nextDouble();
        x=x2-x1;
        y=y2-y1;
        d=(x*x)+(y*y)/2;
        System.out.println("La distancia entre los dos puntos es "+d);
    }
    public static void Ejercicio9(){
        Scanner sc=new Scanner(System.in);
        double ht,ph,ss;
        System.out.println("Ejercicio 2.9");
        System.out.print("Ingrese las horas trabajadas: ");
        ht=sc.nextDouble();
        System.out.print("Ingrese le pago por hora: ");
        ph=sc.nextDouble();
        ss=ht*ph;
        System.out.println("El sueldo semanal es de "+ss+" Bs");
    }
    public static void Ejercicio10(){
        Scanner sc=new Scanner(System.in);
        double cm,pg;
        System.out.println("Ejercicio 2.10");
        System.out.print("Ingrese la cantidad de metros recorridos: ");
        cm=sc.nextDouble();
        pg=cm/2.54;
        System.out.println("La cantidad de pulgadas es de "+pg);
    }
    public static void Ejercicio11(){
        Scanner sc=new Scanner(System.in);
        double a,l,n,cm,v,pag;
        System.out.println("Ejercicio 2.11");
        System.out.print("Ingrese la altura: ");
        a=sc.nextDouble();
        System.out.print("Ingrese el largo: ");
        l=sc.nextDouble();
        System.out.print("Ingrese el ancho: ");
        n=sc.nextDouble();
        System.out.print("Ingrese el costo por petro cubico: ");
        cm=sc.nextDouble();
        v=a*l*n;
        pag=v*cm;
        System.out.println("El pago es de "+pag+" Bs");
    }
}
