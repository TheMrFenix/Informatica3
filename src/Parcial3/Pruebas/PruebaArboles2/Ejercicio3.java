package Parcial3.Pruebas.PruebaArboles2;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer>lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        ArbolBinario arbol=new ArbolBinario();
        int x;
        int y;
        System.out.println("Ingrese la cantidad de nodos que desea ingresar: ");
        x=sc.nextInt();
        int z=x;
        while (x>0){
            System.out.println("Ingrese un valor: ");
            y=sc.nextInt();
            if (lista.contains(y)){
                System.out.println("ya esta ingresado");
            } else {
                lista.add(y);
                arbol.insertar(y);
                x--;
            }
        }
        System.out.println("Arbol en orden: ");
        arbol.imprimirEnOrden();
        System.out.println();
        System.out.println("El nivel del arbol es: "+arbol.calcularAltura(arbol.raiz));
        System.out.println("El peso del arbol y cantidad de nodos es: "+z);
        Nodo valorMax=arbol.encontrarMaximo(arbol.raiz);
        System.out.println("El nodo de mayor valor es: "+valorMax.valor);
        Nodo valorMin=arbol.encontrarMinimo(arbol.raiz);
        System.out.println("El nodo de minimo valor es: "+valorMin.valor);
    }
}
class Nodo{
    int valor;
    Nodo izquierda;
    Nodo derecha;
    public Nodo(int valor){
        this.valor=valor;
        izquierda=null;
        derecha=null;
    }
}
class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }
        if (valor < nodo.valor) {
            nodo.izquierda = insertarNodo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarNodo(nodo.derecha, valor);
        }
        return nodo;
    }

    public void imprimirEnOrden() {
        imprimirEnOrden(raiz);
    }

    private void imprimirEnOrden(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            imprimirEnOrden(nodo.derecha);
        }
    }

    public int calcularAltura(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            int alturaIzquierda = calcularAltura(raiz.izquierda);
            int alturaDeracha = calcularAltura(raiz.derecha);
            return Math.max(alturaIzquierda, alturaDeracha) + 1;
        }
    }

    public int contarNodos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int cantidadIzquierda = calcularAltura(nodo.izquierda);
            int cantidadDeracha = calcularAltura(nodo.derecha);
            return cantidadIzquierda + cantidadDeracha + 1;
        }
    }
    public Nodo encontrarMaximo(Nodo nodo){
        if (nodo==null){
            return null;
        }
        while (nodo.derecha!=null){
            nodo=nodo.derecha;
        }
        return nodo;
    }
    public Nodo encontrarMinimo(Nodo nodo) {
        if (nodo == null) {
            return null;
        }
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }
}