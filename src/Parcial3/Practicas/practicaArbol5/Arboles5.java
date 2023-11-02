package Parcial3.Practicas.practicaArbol5;

public class Arboles5 {
    public static void main(String[] args) {
        ArbolBinario arbol1=new ArbolBinario();
        arbol1.insertar(50);
        arbol1.insertar(30);
        arbol1.insertar(20);
        arbol1.insertar(40);
        arbol1.insertar(70);
        arbol1.insertar(60);
        arbol1.insertar(80);
        ArbolBinario arbol2=new ArbolBinario();
        arbol2.insertar(50);
        arbol2.insertar(30);
        arbol2.insertar(20);
        arbol2.insertar(40);
        arbol2.insertar(70);
        arbol2.insertar(60);
        arbol2.insertar(80);
        arbol2.insertar(90);

        System.out.println("Arbol en orden:");
        arbol1.imprimirEnOrden();
        System.out.println("Arbol en orden: ");
        arbol2.imprimirEnOrden();
        System.out.println();
        System.out.println("Altura del arbol: "+arbol1.calcularAltura(arbol1.raiz));
        System.out.println("La cantidad de nodos del arbol es: "+(arbol1.contarNodos(arbol1.raiz)+2));
        Nodo valorMinimo = arbol1.encontrarMinimo(arbol1.raiz);
        System.out.println("El valor minimo del valor del arbol es: " + valorMinimo.valor);
        boolean identicos = arbol1.sonArbolesIdenticos(arbol1.raiz,arbol2.raiz);
        System.out.println("Los arboles son identicos? " + identicos);
        double promedio = arbol1.calcularNivelPromedio(arbol1.raiz);
        System.out.println("El promedio del arbol es: " + promedio);
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
    public int contarNodos(Nodo raiz){
        if (raiz==null){
            return 0;
        } else {
            int cantidadIzquierda=calcularAltura(raiz.izquierda);
            int cantidadDeracha=calcularAltura(raiz.derecha);
            return cantidadIzquierda+cantidadDeracha+1;
        }
    }
    public Nodo encontrarMinimo(Nodo nodo) {
        if (nodo == null){
            return null;
        }
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }
    public boolean sonArbolesIdenticos (Nodo nodo1, Nodo nodo2){
        if (nodo1 == null && nodo2 == null){
            return true;
        }
        if (nodo1 == null || nodo2 == null){
            return false;
        }
        return (nodo1.valor == nodo2.valor)
                && sonArbolesIdenticos(nodo1.izquierda, nodo2.izquierda)
                && sonArbolesIdenticos(nodo1.derecha,  nodo2.derecha);
    }
    public double calcularNivelPromedio(Nodo raiz){
        int altura = calcularAltura(raiz);
        int cantidadNodos = contarNodos(raiz);
        return (double) cantidadNodos / altura;
    }
}
