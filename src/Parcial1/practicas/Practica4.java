package Parcial1.practicas;
import java.util.Scanner;
public class Practica4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("***   Menu    ***");
            System.out.println("1- Ejercicio 5.1");
            System.out.println("2- Ejercicio 5.2");
            System.out.println("3- Ejercicio 5.3");
            System.out.println("4- Ejercicio 5.4");
            System.out.println("5- Ejercicio 5.5");
            System.out.println("6- Ejercicio 5.6");
            System.out.println("7- Ejercicio 5.7");
            System.out.println("8- Ejercicio 5.8");
            System.out.println("9- Ejercicio 5.9");
            System.out.println("0- Salir");
            System.out.print("-> Elije una opcion: ");
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
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (x!=0);
    }
    public static void Ejercicio1(){
        Scanner sc=new Scanner(System.in);
        int vec[];
        int n;
        System.out.println("Ejercicio 5.1");
        System.out.print("Ingrese la cantidad de edades: ");
        n=sc.nextInt();
        vec = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese la edad "+(i+1)+":");
            vec[i]=sc.nextInt();
        }
        for (int j=0; j<n; j++){
            System.out.print("Edad de persona "+(j+1)+" es ");
            System.out.println(vec[j]);
        }
    }
    public static void Ejercicio2(){
        Scanner sc=new Scanner(System.in);
        double va[],su=0;
        va =new double[10];
        System.out.println("Ejercicio 5.2");
        for (int i=0; i<10; i++){
            System.out.println(i+"**");
            System.out.print("Ingrese el valor: ");
            va[i]=sc.nextDouble();
        }
        for (int j=0; j<10; j++){
            su=su+va[j];
        }
        System.out.println("La suma de los valores es "+su);
    }
    public static void Ejercicio3(){
        Scanner sc=new Scanner(System.in);
        double a[],b[],c[];
        int n;
        System.out.println("Ejercicio 5.3");
        System.out.print("Ingrese la cantidad de elemnetos: ");
        n=sc.nextInt();
        a=new double[n];
        b=new double[n];
        c=new double[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el valor A"+(i+1)+": ");
            a[i]=sc.nextDouble();
            System.out.print("Ingrese el valor B"+(i+1)+": ");
            b[i]=sc.nextDouble();
        }
        for (int j=0; j<n; j++){
            c[j]=a[j]+b[j];
        }
        for (int k=0; k<n; k++){
            System.out.println("La suma de los valores"+(k+1)+" son "+c[k]);
        }
    }
    public static void Ejercicio4(){
        Scanner sc=new Scanner(System.in);
        double p[],pa;
        String n[],na;
        int a;
        System.out.println("Ejercicio 5.4");
        System.out.print("Ingrese la cantidad de alumnos: ");
        a=sc.nextInt();
        p=new double[a];
        n=new String[a];
        for (int i=0; i<a; i++){
            System.out.print("Ingrese el nombre del alumno "+(i+1)+": ");
            n[i]=sc.next();
            System.out.print("Ingrese la nota promedio del alumno "+(i+1)+": ");
            p[i]=sc.nextDouble();
            for (int j=0; j<a; j++){
                if (p[j]>p[i]){
                    pa=p[i];
                    na=n[i];
                    p[i]=p[j];
                    n[i]=n[j];
                    p[j]=pa;
                    n[j]=na;
                }
            }
        }
        for (int k=0; k<a; k++){
            System.out.println("El alumno "+n[k]);
            System.out.println("Tiene un promedio de "+p[k]);
        }
    }
    public static void Ejercicio5(){
        Scanner sc=new Scanner(System.in);
        int a[],b[],c[];
        a=new int[10];
        b=new int[10];
        c=new int[10];
        System.out.println("Ejercicio 5.5");
        for (int i=0; i<10; i++){
            System.out.print("Ingrese la cantidad de un producto almacenado: ");
            a[i]=sc.nextInt();
            System.out.print("Ingrese la cantidad del producto pedido por el cliente: ");
            b[i]=sc.nextInt();
        }
        for (int j=0; j<10; j++){
            if (a[j]==b[j]){
                c[j]=a[j];
            } else {
                if (b[j]>a[j]){
                    c[j]=(b[j]-a[j])*2;
                } else {
                    c[j]=b[j];
                }
            }
        }
        for (int k=0; k<10; k++){
            System.out.println("La cantidad que se requiere comprar para mantener stock es "+c[k]);
        }
    }
    public static void Ejercicio6(){
        Scanner sc=new Scanner(System.in);
        int v[],av;
        v=new int[6];
        System.out.println("Ejercicio 5.6");
        for (int i=0; i<6; i++){
            System.out.print("Ingrese el valor del elemento: ");
            v[i]=sc.nextInt();
        }
        for (int j=0; j<3; j++) {
            av=v[j];
            v[j]=v[5-j];
            v[5-j]=av;
        }
        for (int k=0; k<6; k++){
            System.out.println("Los valores de los elementos son "+v[k]);
        }
    }
    public static void Ejercicio7(){
        Scanner sc=new Scanner(System.in);
        double cal[][];
        int n,m;
        System.out.println("Ejercicio 5.7");
        System.out.print("Ingrese la cantidad de alumnos: ");
        n=sc.nextInt();
        System.out.print("Ingrese la cantidad de materias: ");
        m=sc.nextInt();
        cal=new double[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("Ingrese la calificacion en la materia "+(j+1)+" del alumno "+(i+1)+": ");
                cal[i][j]=sc.nextDouble();
            }
        }
        for (int k=0; k<n; k++){
            for (int l=0; l<m; l++){
                System.out.println("Estas son las calificaciones del alumno "+(k+1)+" en la materia "+(l+1)+" ; "+cal[k][l]);
            }
        }
    }
    public static void Ejercicio8(){
        Scanner sc=new Scanner(System.in);
        int v[][],nc=0;
        v=new int[4][4];
        System.out.println("Ejercicio 5.8");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print("Ingrese valores a la matriz: ");
                v[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (v[i][j]==0){
                    nc++;
                }
            }
        }
        System.out.println("La cantidad de ceros en la matriz es de "+nc);
    }
    public static void Ejercicio9(){
        Scanner sc=new Scanner(System.in);
        int n,k[][],tk[];
        String nc[];
        System.out.println("Ejercicio 5.9");
        System.out.print("Ingrese el la cantidad de choferes: ");
        n=sc.nextInt();
        nc=new String[n];
        k=new int[n][6];
        tk=new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el nombre del chofer "+(1+1)+": ");
            nc[i]=sc.next();
            for (int j=0; j<6; j++){
                System.out.print("Ingrese la cantidad de kilometros recorridos por el chofer "+(i+1)+" en el dia "+(j+1)+": ");
                k[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            tk[i]=0;
            for (int j=0; j<6; j++){
                tk[i]=tk[i]+k[i][j];
            }
        }
        for (int i=0; i<n; i++){
            System.out.println("El chofer "+(i+1)+" de nombre: "+nc[i]);
            for (int j=0; j<6; j++){
                System.out.println(" ,ah recorrido "+k[i][j]+" kilometros en el dia "+(j+1));
            }
            System.out.println(" , habiendo recorrido en total "+tk[i]+" kilometros.");
        }
    }
}
