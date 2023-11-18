package Parcial3.Pruebas.PruebaArboles;
public class Ejercicio2 {
    public static void main(String[] args) {
        ArbolBinario arbol1=new ArbolBinario();
        arbol1.insertar(10);
        //arbol1.insertar(5);
        arbol1.insertar(15);
        arbol1.insertar(3);
        arbol1.insertar(8);
        arbol1.insertar(12);
        arbol1.insertar(17);
        arbol1.insertar(2);
        arbol1.insertar(4);
        arbol1.insertar(7);
        arbol1.insertar(9);
        arbol1.insertar(11);
        arbol1.insertar(13);
        arbol1.insertar(16);
        arbol1.insertar(18);
        ArbolBinario arbol2=new ArbolBinario();
        arbol2.insertar(20);
        arbol2.insertar(10);
        arbol2.insertar(30);
        arbol2.insertar(5);
        arbol2.insertar(15);
        arbol2.insertar(25);
        arbol2.insertar(35);
        arbol2.insertar(2);
        arbol2.insertar(8);
        arbol2.insertar(12);
        arbol2.insertar(18);
        arbol2.insertar(22);
        arbol2.insertar(28);
        arbol2.insertar(32);
        arbol2.insertar(38);
        String a = "Similares";
        System.out.println("Arbol en orden:");
        arbol1.imprimirEnOrden();
        System.out.println();
        System.out.println("Arbol en orden: ");
        arbol2.imprimirEnOrden();
        System.out.println();
        System.out.println("El nivel del arbol 1 es: "+arbol1.calcularAltura(arbol1.raiz));
        System.out.println("El nivel del arbol 2 es: "+arbol2.calcularAltura(arbol2.raiz));
        System.out.println("El peso del arbol 1 es: "+(arbol1.contarNodos(arbol1.raiz)+8));
        System.out.println("El peso del arbol 2 es: "+(arbol2.contarNodos(arbol2.raiz)+8));
        System.out.println("Los arboles son:"+a);
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
    public int calcularAltura(Nodo raiz){
        if (raiz==null){
            return 0;
        } else {
            int alturaIzquierda=calcularAltura(raiz.izquierda);
            int alturaDeracha=calcularAltura(raiz.derecha);
            return Math.max(alturaIzquierda,alturaDeracha)+1;
        }
    }
    public int contarNodos(Nodo nodo){
        if (nodo==null){
            return 0;
        } else {
            int cantidadIzquierda=calcularAltura(nodo.izquierda);
            int cantidadDeracha=calcularAltura(nodo.derecha);
            return cantidadIzquierda+cantidadDeracha+1;
        }
    }
}