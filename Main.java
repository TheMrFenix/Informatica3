import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int op;
        String input;
        do {
            input = JOptionPane.showInputDialog("          -MENU CENTRAL-        \n " +
                    "1.- PERSONA\n" +
                    "0.- SALIR");
            if (input == null) {
                op = 0;
                JOptionPane.showMessageDialog(null, "Hasta luego");
            } else {
                op = Integer.parseInt(input);
            }
            switch (op) {
                case 1:
                    menuPersona();
            }
        } while (op != 0);
    }
    public static void menuPersona() {
        String input;
        int op;
        do {
            input = JOptionPane.showInputDialog("      -MENU PERSONA-        \n" +
                    "1.- Registrar Persona\n" +
                    "2.- Actualizar Persona\n" +
                    "3.- Eliminar Persona\n" +
                    "4.- Mostrar Persona\n" +
                    "5.- Buscar Persona\n" +
                    "0.- Salir");
            if (input == null) {
                op = 0;
            } else {
                op = Integer.parseInt(input);
            }
            switch (op) {
                case 1:
                    Persona p = new Persona();
                    p.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
                    p.setPapellido(JOptionPane.showInputDialog("Ingrese su primer apellido"));
                    p.setSapellido(JOptionPane.showInputDialog("Ingrese su segundo apellido"));
                    JOptionPane.showMessageDialog(null, p.registrarPersona());
                    break;
                case 2:
                    Persona a = new Persona();
                    ArrayList<Persona> lista2 = new ArrayList<>();
                    lista2 = a.listarDatos();
                    String resp = "";
                    String r = "";
                    for (Persona persona : lista2) {
                        resp += persona.toString() + "\n";
                    }
                    r = JOptionPane.showInputDialog("INGRESE EL ID DE LA PERSONA A MODIFICAR\n" +
                            resp);
                    if (r == null) {
                        JOptionPane.showMessageDialog(null, "Accion cancelada");
                    } else {
                        a.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
                        a.setPapellido(JOptionPane.showInputDialog("Ingrese su primer apellido"));
                        a.setSapellido(JOptionPane.showInputDialog("Ingrese su segundo apellido"));
                        a.setId(Integer.parseInt(r));
                        JOptionPane.showMessageDialog(null, a.actualizarPersona());
                    }
                    break;
                case 3:
                    Persona b = new Persona();
                    ArrayList<Persona> lista3 = new ArrayList<>();
                    lista3 = b.listarDatos();
                    String resp3 = "";
                    String r2 = "";
                    for (Persona persona : lista3) {
                        resp3 += persona.toString() + "\n";
                    }
                    r2 = JOptionPane.showInputDialog("INGRESE EL ID DE LA PERSONA A ELIMINAR\n" +
                            resp3);
                    if (r2 == null) {
                        JOptionPane.showMessageDialog(null, "Accion cancelada");
                    } else {
                        b.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, b.eliminarPersona());
                    }
                    break;
                case 4:
                    Persona l = new Persona();
                    ArrayList<Persona> lista = new ArrayList<>();
                    lista = l.listarDatos();
                    String resp2 = "";
                    for (Persona persona : lista) {
                        resp2 += persona.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, resp2);
                    break;
            }
        } while (op != 0);
    }
}