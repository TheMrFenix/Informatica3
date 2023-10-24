package Parcial3.Practicas;
public class Practica5 {
        public static String invertir(String c) {
            if (c.isEmpty()||c.length()==1) {
                return c;
            } else {
                char primerCaracter=c.charAt(0);
                String subcadenaInvertida=invertir(c.substring(1));
                return subcadenaInvertida+primerCaracter;
            }
        }
        public static void main(String[] args) {
            String c="Hola, mundo";
            System.out.println("Cadena original: "+c);
            String cadenaInvertida=invertir(c);
            System.out.println("Cadena invertida: "+cadenaInvertida);
        }
}
