package Parcial1.practicas;
import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("***   Menu   ***");
            System.out.println("1* Ejercicio 3.1");
            System.out.println("2* Ejercicio 3.2");
            System.out.println("3* Ejercicio 3.3");
            System.out.println("4* Ejercicio 3.4");
            System.out.println("5* Ejercicio 3.5");
            System.out.println("6* Ejercicio 3.6");
            System.out.println("7* Ejercicio 3.7");
            System.out.println("8* Ejercicio 3.8");
            System.out.println("9* Ejercicio 3.9");
            System.out.println("10* Ejercicio 3.10");
            System.out.println("11* Ejercicio 3.11");
            System.out.println("12* Ejercicio 3.12");
            System.out.println("13* Ejercicio 3.13");
            System.out.println("14* Ejercicio 3.14");
            System.out.println("15* Ejercicio 3.15");
            System.out.println("0* Salir");
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
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (x!=0);
    }
    public static void Ejercicio1(){
        Scanner sc=new Scanner(System.in);
        int a,b,m;
        System.out.println("Ejericio 3.1");
        System.out.print("Ingrese el primer valor a comparar: ");
        a=sc.nextInt();
        System.out.print("Ingrese el segundo valor a ser comparado: ");
        b=sc.nextInt();
        if (a>b){
            m=a;
        } else {
            m=b;
        }
        System.out.println("El numero de mayor valor es "+m);
    }
    public static void Ejercicio2(){
        Scanner sc=new Scanner(System.in);
        int num;
        String r;
        System.out.println("Ejericico 3.2");
        System.out.print("Ingrese el numero: ");
        num=sc.nextInt();
        if (num>=0){
            r="Positivo";
        } else {
            r="Negativo";
        }
        System.out.println("El resulta do es "+r);
    }
    public static void Ejercicio3(){
        Scanner sc=new Scanner(System.in);
        int x;
        double pag;
        System.out.println("Ejericicio 3.3");
        System.out.print("Ingrese la cantidad de lapices: ");
        x=sc.nextInt();
        if (x>=1000){
            pag=x*0.85;
        } else {
            pag=x*0.90;
        }
        System.out.println("El pago es de "+pag+" Bs");
    }
    public static void Ejercicio4(){
        Scanner sc=new Scanner(System.in);
        double ct,de,pf;
        System.out.println("Ejercicio 3.4");
        System.out.print("Ingrese el costo del traje: ");
        ct=sc.nextDouble();
        if (ct>2500){
            de=ct*0.15;
        } else {
            de=ct*0.08;
        }
        pf=ct-de;
        System.out.println("El precio final es de "+pf+" Bs, com un descuento de "+de+" %");
    }
    public static void Ejercicio5(){
        Scanner sc=new Scanner(System.in);
        double a,b,c,m;
        System.out.println("Ejercicio 3.5");
        System.out.print("Ingrese el primer valor: ");
        a=sc.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        b=sc.nextDouble();
        System.out.print("Ingrese el tercer valor: ");
        c=sc.nextDouble();
        if (a>b){
            if (a>c){
                m=a;
            } else {
                m=c;
            }
        } else {
            if (b>c){
                m=b;
            } else {
                m=c;
            }
        }
        System.out.println("El numero mayor es "+m);
    }
    public static void Ejercicio6(){
        Scanner sc=new Scanner(System.in);
        int np;
        double tot;
        System.out.println("Ejercicio 3.6");
        System.out.print("Ingrese el numero de personas: ");
        np=sc.nextInt();
        if (np>300){
            tot=np*75.00;
        } else {
            if (np>200){
                tot=np*85.00;
            } else {
                tot=np*95.00;
            }
        }
        System.out.println("El total a pagar por "+np+" personas es de "+tot+" Bs");
    }
    public static void Ejercicio7(){
        Scanner sc=new Scanner(System.in);
        String ti;
        int ta,k;
        double p,ga;
        System.out.println("Ejercicio 3.7");
        System.out.print("Ingrese el tipo de uva: ");
        ti=sc.next();
        System.out.print("Ingrese el tamaño de la uva: ");
        ta=sc.nextInt();
        System.out.print("Ingrese el precio de la uva: ");
        p=sc.nextDouble();
        System.out.print("Ingrese los kilos producidos: ");
        k=sc.nextInt();
        if (ti.equals("A")){
            if (ta==1){
                p=p+0.20;
            } else {
                p=p+0.30;
            }
        } else {
            if (ta==1){
                p=p-0.30;
            } else {
                p=p-0.50;
            }
        }
        ga=p*k;
        System.out.println("La ganancia obtenida es de "+ga+" Bs");
    }
    public static void Ejercicio8(){
        Scanner sc=new Scanner(System.in);
        int na;
        double pa,tot;
        System.out.println("Ejercicio 3.8");
        System.out.print("Ingrese el numero de alumnos que viajaran: ");
        na=sc.nextInt();
        if (na>100){
            pa=65.00;
        } else {
            if (na>50){
                pa=70.00;
            } else {
                if (na>30){
                    pa=95.00;
                } else {
                    pa=4000/na;
                }
            }
        }
        tot=pa*na;
        System.out.println("El pago individual es de "+pa+" Bs, y el pago total es de "+tot+" Bs");
    }
    public static void Ejercicio9(){
        Scanner sc=new Scanner(System.in);
        int ti;
        String di,tu;
        double pag,imp,tot;
        System.out.println("Ejercicio 3.9");
        System.out.print("Ingrese el tiempo: ");
        ti=sc.nextInt();
        System.out.print("Ingrese el dia: ");
        di=sc.next();
        System.out.print("Ingrese el turno: ");
        tu=sc.next();
        if (ti<5){
            pag=ti*1;
        } else {
            if (ti<8){
                pag=(ti-5)*0.8+5;
            } else {
                if (ti<=10){
                    pag=(ti-8)*0.7+7.4;
                } else {
                    pag=(ti-10)*0.5+8.8;
                }
            }
        }
        if (di.equals("Dom")){
            imp=pag*0.05;
        } else {
            if (tu.equals("m")){
                imp=pag*0.15;
            } else {
                imp=pag*0.10;
            }
        }
        tot=pag+imp;
        System.out.println("El pago es de "+pag+" Bs, con un impuesto de "+imp+"% , siendo el total "+tot+" Bs");
    }
    public static void Ejercicio10(){
        Scanner sc=new Scanner(System.in);
        String ti;
        int km, npr, np;
        double ck, cp, to;
        System.out.println("Ejercicio 3.10");
        System.out.print("Ingrese el tipo de bus: ");
        ti=sc.next();
        System.out.print("Ingrese los kilometros por recorrer: ");
        km=sc.nextInt();
        System.out.print("Ingrese el numero de personas: ");
        npr=sc.nextInt();
        if (ti.equals("A")){
            ck=2.00;
        } else {
            if (ti.equals("B")){
                ck=2.50;
            } else {
                ck=3.00;
            }
        }
        if (npr<20){
            np=20;
        } else {
            np=npr;
        }
        to=np*ck*km;
        cp=to/npr;
        System.out.println("El costo por persona es de "+cp+" Bs, y el total del viaje es de "+to+" Bs");
    }
    public static void Ejercicio11(){
        Scanner sc=new Scanner(System.in);
        String ti,tp;
        int n;
        double pa,ca,to,tot;
        System.out.println("Ejercicio 3.11");
        System.out.print("Ingrese el numero de hamburguesas: ");
        n=sc.nextInt();
        System.out.print("Ingrese el tipo de hamburguesas: ");
        ti=sc.next();
        System.out.print("Ingrese el tipo de pago: ");
        tp=sc.next();
        if (ti.equals("Sencilla")){
            pa=20;
        } else {
            if (ti.equals("Doble")){
                pa=25;
            } else {
                pa=28;
            }
        }
        to=pa*n;
        if (tp.equals("Tar")){
            ca=to*0.05;
        } else {
            ca=0;
        }
        tot=to+ca;
        System.out.println("El precio de la haburguesa es de "+pa+" Bs.");
        System.out.println("El total sin cargo es de "+to+" Bs");
        System.out.println("El total con cargo es de "+tot+" Bs, siendo el cargo de "+ca+" Bs");
    }
    public static void Ejercicio12(){
        Scanner sc=new Scanner(System.in);
        int nc;
        double cc,tot;
        System.out.println("Ejercicio 3.12");
        System.out.print("Ingrese el numero de cita: ");
        nc=sc.nextInt();
        if (nc<=3){
            cc=200;
            tot=nc*cc;
        } else {
            if (nc<=5){
                cc=150;
                tot=(nc-3)*150+600;
            } else {
                if (nc<=8){
                    cc=100;
                    tot=(nc-5)*100+900;
                } else {
                    cc=50;
                    tot=(nc-8)*50+1200;
                }
            }
        }
        System.out.println("El costo de la cita es de "+cc+" Bs");
        System.out.println("El total del tratamiento es de "+tot+" BS");
    }
    public static void Ejercicio13(){
        Scanner sc=new Scanner(System.in);
        int c;
        double mp,mo,gf,cp,cv;
        System.out.println("Ejercicio 3.13");
        System.out.print("Ingrese el costo de la materia prima: ");
        mp=sc.nextDouble();
        System.out.print("Ingrese la clave del articulo: ");
        c=sc.nextInt();
        if (c==3||c==4){
            mo=mp*0.75;
        } else {
            if (c==1||c==5){
                mo=mp*0.80;
            } else {
                mo=mp*0.85;
            }
        }
        if (c==2||c==5){
            gf=mp*0.30;
        } else {
            if (c==3||c==6){
                gf=mp*0.35;
            } else {
                gf=mp*0.28;
            }
        }
        cp=mp+mo+gf;
        cv=cp+cp*0.45;
        System.out.println("El costo de produccion es de "+cp+" Bs, siendo el precio de venta "+cv+" Bs");
    }
    public static void Ejercicio14(){
        Scanner sc=new Scanner(System.in);
        int nz,pe;
        double co=0;
        System.out.println("Ejercicio 3.14");
        System.out.print("Ingrese la zona horaria: ");
        nz=sc.nextInt();
        System.out.print("Ingrese el peso del paquete: ");
        pe=sc.nextInt();
        if (pe>5000){
            System.out.println("No se da servicio");
        } else {
            if (nz==1){
                co=pe*11;
            } else if (nz==2) {
                co=pe*10;
            } else if (nz==3) {
                co=pe*12;
            } else if (nz==4) {
                co=pe*24;
            } else {
                co=pe*27;
            }
        }
        System.out.println("El servicio costo "+co+" Bs");
    }
    public static void Ejercicio15(){
        Scanner sc=new Scanner(System.in);
        int tt;
        double la,ac,nc;
        System.out.println("Ejercicio 3.15");
        System.out.print("Ingrese el tipo de tarjeta: ");
        tt=sc.nextInt();
        System.out.print("Ingrese el limite actual de credito: ");
        la=sc.nextDouble();
        if (tt==1){
            ac=la*0.25;
        } else if (tt==2) {
            ac=la*0.35;
        } else if (tt==3) {
            ac=la*0.40;
        } else {
            ac=la*0.50;
        }
        nc=la+ac;
        System.out.println("El aumento de credito es "+ac+" BS");
        System.out.println("El nuevo limite de credito es "+nc);
    }
}
