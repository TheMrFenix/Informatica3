package Parcial3.Practicas;

public class Arboles1 {
    public static void main(String[] args) {
        ArbolBinario arbol=new ArbolBinario();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Arbol en orden:");
        arbol.imprimirEnOrden();
        System.out.print("Altura del arbol:");

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
class ArbolBinario{
    Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    public void insertar(int valor){
        raiz=insertarNodo(raiz, valor);
    }
    private Nodo insertarNodo(Nodo nodo, int valor){
        if (nodo==null){
            nodo=new Nodo(valor);
            return nodo;
        }
        if (valor<nodo.valor){
            nodo.izquierda=insertarNodo(nodo.izquierda, valor);
        } else if (valor>nodo.valor) {
            nodo.derecha=insertarNodo(nodo.derecha, valor);
        }
        return nodo;
    }
    public void imprimirEnOrden(){
        imprimirEnOrden(raiz);
    }
    private void imprimirEnOrden(Nodo nodo){
        if (nodo!=null){
            imprimirEnOrden(nodo.izquierda);
            System.out.print(nodo.valor +" ");
            imprimirEnOrden(nodo.derecha);
        }
    }
    public int calcularAltura(Nodo nodo){
        if (nodo==null){
            return 0;
        } else {
            int alturaIzquierda=calcularAltura(nodo.izquierda);
            int alturaDeracha=calcularAltura(nodo.derecha);
            return Math.max(alturaIzquierda,alturaDeracha)+1;
        }
    }
}
