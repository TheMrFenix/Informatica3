package Parcial3.Practicas;
public class Practica3 {
        public static double calcularPotencia(double base, int exp) {
            if (exp==0) {
                return 1.0;
            } else if (exp>0) {
                return base*calcularPotencia(base,exp-1);
            } else {
                return 1.0/(base * calcularPotencia(base,-exp-1));
            }
        }
        public static void main(String[] args) {
            double base=2.0;
            int exp=3;
            double resultado=calcularPotencia(base,exp);
            System.out.println(base+" elevado a la "+exp+" es igual a "+resultado);
        }
}
