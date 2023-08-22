package Parcial1.Examen;
import java.util.Scanner;
public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("***   Menu   ***");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            System.out.println("3- Ejercicio 3");
            System.out.println("0- Salir");
            System.out.print("->Elija una opcion: ");
            x= sc.nextInt();
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
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (x != 0);
    }
    public static void Ejercicio1(){
        Scanner sc=new Scanner(System.in);
        double bm=0,an,s,sb,st;
        System.out.println("Ejercicio 1");
        System.out.print("Ingrese sus años de antiguadad: ");
        an=sc.nextDouble();
        System.out.print("Ingrese el monto de su sueldo: ");
        s=sc.nextDouble();
        if (an>2&&an<5){
            bm=0.20;
        } else if (an>=5) {
            bm=0.30;
        } else if (an<=2&&s<=1000){
            bm=0.25;
        } else if (an<=2&&s>1000&&s<=3500) {
            bm=0.15;
        } else if (an<=2&&s>3500) {
            bm=0.10;
        }
        sb=s*bm;
        st=sb+s;
        System.out.println("Su sueldo total por antiguedad de "+an+" años, y sueldo de "+s+" Bs");
        System.out.println(", proporcionando un bono de "+sb+" Bs, da como resultado "+st+" Bs.");
    }
    public static void Ejercicio2(){
        Scanner sc=new Scanner(System.in);
        int v[],nc=0,mec=0,mac=0,cv;
        System.out.println("Ejercicio 2");
        System.out.print("Ingrese la cantidad de variables: ");
        cv=sc.nextInt();
        v=new int[cv];
        for (int i=0; i<cv; i++){
            System.out.print("Ingrese el valor "+(i+1)+": ");
            v[i]=sc.nextInt();
        }
        for (int j=0;j<cv;j++){
            if (v[j]<0){
                mec++;
            }
            if (v[j]==0){
                nc++;
            }
            if (v[j]>0){
                mac++;
            }
        }
        System.out.println("La cantidad de variables menores a cero son "+mec);
        System.out.println("La cantidad de variables iguales a cero son "+nc);
        System.out.println("La cantidad de variables mayores a cero son "+mac);
    }
    public static void Ejercicio3(){
        Scanner sc=new Scanner(System.in);
        String nc[];
        int ht[][],hs[],mh[],auxh[];
        double ss[],sh[],st;
        ss=new double[5];
        sh=new double[5];
        nc=new String[5];
        ht=new int[5][6];
        hs=new int[5];
        mh=new int[3];
        auxh=new int[5];
        System.out.println("Ejercicio 3");
        for (int i=0;i<5;i++){
            System.out.print("Ingrese el nombre del chofer "+(i+1)+": ");
            nc[i]=sc.next();
            System.out.print("Ingrese el sueldo por hora del chofer "+(i+1)+": ");
            sh[i]= sc.nextDouble();
            for (int j=0;j<6;j++){
                System.out.print("Ingrese las horas trabajadas en el dia "+(j+1)+" ,del trabajador "+(i+1)+" : ");
                ht[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<5;i++){
            hs[i]=0;
            for (int j=0;j<6;j++){
                hs[i]=hs[i]+ht[i][j];
            }
            mh[0]=ht[0][4];
            auxh[i]=ht[i][4];
            if (auxh[i]>mh[0]){
                if (auxh[i]>mh[1]){
                    mh[1]=auxh[i];
                    mh[2]=mh[1];
                }
            }
            ss[i]=sh[i]*hs[i];
        }
        st=ss[0]+ss[1]+ss[2]+ss[3]+ss[4];
        for (int i=0;i<5;i++){
            System.out.println("El chofer "+(i+1)+" de nombre: "+nc[i]);
            System.out.println(" , ah trabajado "+hs[i]+" horas semanales");
            System.out.println(" , teniendo un sueldo semanal de "+ss[i]+" Bs.");
        }
        System.out.println(" Concinderando que la mayor cantidad de horas es de "+mh[2]+".");
        System.out.println(" La empresa tendra que pagar en sueldos un total de "+st+" Bs.");
    }
}
