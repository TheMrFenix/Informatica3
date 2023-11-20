package proyecto;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        int op;
        String input;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Vienbenido a Fenix World Games®╣░░░░░\n" +
                    "1» Cliente\n"+"2» Empleado\n"+"0» Salir");
            if (input==null){
                op=0;
                JOptionPane.showMessageDialog(null,"Gracias por visitarnos");
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    menuCliente();
                case 2:
                    menuEmpleado();
            }
        }while (op!=0);
    }
    public static void menuCliente(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu cliente╣░░░░░\n" +
                    "1» Registrar Cliente\n"+"2» Actualizar Cliente\n"+"3» Eliminar Cliente\n"+"4» Mostrar Cliente\n"+"5» Ingresar a la Tienda\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Cliente cli1=new Cliente();
                    cli1.setApodo(JOptionPane.showInputDialog("Ingrese un apodo:"));
                    cli1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
                    cli1.setApellido_paterno(JOptionPane.showInputDialog("Ingrese su apellido paterno:"));
                    cli1.setApellido_materno(JOptionPane.showInputDialog("Ingrese su apellido materno:"));
                    cli1.setPais(JOptionPane.showInputDialog("Ingrese su pais:"));
                    cli1.setDireccion_email(JOptionPane.showInputDialog("Ingrese una direccion email:"));
                    int tel= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono:"));
                    cli1.setTelefono(tel);
                    cli1.setContraseña(JOptionPane.showInputDialog("Ingrese una contraseña:"));
                    JOptionPane.showMessageDialog(null, cli1.registrarCliente());
                    break;
                case 2:
                    Cliente cli2=new Cliente();
                    ArrayList<Cliente> listaC1=new ArrayList<>();
                    listaC1=cli2.listarCliente();
                    String resp="";
                    String r="";
                    for (Cliente cliente:listaC1){
                        resp+=cliente.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del cliente a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        cli2.setApodo(JOptionPane.showInputDialog("Ingrese un apodo:"));
                        cli2.setNombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
                        cli2.setApellido_paterno(JOptionPane.showInputDialog("Ingrese su apellido paterno:"));
                        cli2.setApellido_materno(JOptionPane.showInputDialog("Ingrese su apellido materno:"));
                        cli2.setPais(JOptionPane.showInputDialog("Ingrese su pais:"));
                        cli2.setDireccion_email(JOptionPane.showInputDialog("Ingrese una direccion email:"));
                        int tel2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono:"));
                        cli2.setTelefono(tel2);
                        cli2.setContraseña(JOptionPane.showInputDialog("Ingrese una contraseña:"));
                        cli2.setId(Integer.parseInt(r));
                        JOptionPane.showMessageDialog(null, cli2.actualizarCliente());
                    }
                    break;
                case 3:
                    Cliente cli3=new Cliente();
                    ArrayList<Cliente> lista2=new ArrayList<>();
                    lista2=cli3.listarCliente();
                    String resp2="";
                    String r2="";
                    for (Cliente cliente:lista2){
                        resp2+=cliente.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del cliente a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        cli3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, cli3.eliminarCliente());
                    }
                    break;
                case 4:
                    Cliente cli4=new Cliente();
                    ArrayList<Cliente> lista3=new ArrayList<>();
                    lista3=cli4.listarCliente();
                    String resp3="";
                    for (Cliente cliente:lista3){
                        resp3+=cliente.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuTiendaJC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuTiendaJC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu tienda de juegos╣░░░░░\n" +
                    "1» Mostrar tienda\n"+"2» Ingresar a catalogo principàl\n"+"3» Ingresar a lista de generos\n"+"4» Ingresar a juegos propios\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Tienda_de_juegos tdj1=new Tienda_de_juegos();
                    ArrayList<Tienda_de_juegos> lista1=new ArrayList<>();
                    lista1=tdj1.listarTiendaJ();
                    String resp1="";
                    for (Tienda_de_juegos tienda_de_juegos:lista1){
                        resp1+=tienda_de_juegos.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCatalogoPC();
                    break;
                case 3:
                    menuListaGC();
                    break;
                case 4:
                    menuJuegosPC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuCatalogoPC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu catalogo principal╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a lista de generos\n"+"3» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Catalogo_principal ctp1=new Catalogo_principal();
                    ArrayList<Catalogo_principal> lista1=new ArrayList<>();
                    lista1=ctp1.listaCatalogoP();
                    String resp1="";
                    for (Catalogo_principal catalogo_principal:lista1){
                        resp1+=catalogo_principal.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuListaGC();
                    break;
                case 3:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuListaGC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu lista de generos╣░░░░░\n" +
                    "1» Mostrar juegos\n"+"2» ingresar a accion\n"+"3» ingresar a aventura\n"+"4» ingresar a estrategia\n"+"5» ingresar a rol\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Lista_de_generos ldg1=new Lista_de_generos();
                    ArrayList<Lista_de_generos> lista1=new ArrayList<>();
                    lista1=ldg1.listarListaG();
                    String resp1="";
                    for (Lista_de_generos lista_de_generos:lista1){
                        resp1+=lista_de_generos.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuAccionC();
                    break;
                case 3:
                    menuAventuraC();
                    break;
                case 4:
                    menuEstrategiaC();
                    break;
                case 5:
                    menuRolC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuJuegosPC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu juegos propios╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a lista de generos\n"+"3» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Juegos_propios jgp1=new Juegos_propios();
                    ArrayList<Juegos_propios> lista1=new ArrayList<>();
                    lista1=jgp1.listarJuegosP();
                    String resp1="";
                    for (Juegos_propios juegos_propios:lista1){
                        resp1+=juegos_propios.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuListaGC();
                    break;
                case 3:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuAccionC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu accion╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Accion acc1=new Accion();
                    ArrayList<Accion> lista1=new ArrayList<>();
                    lista1=acc1.listarAccion();
                    String resp1="";
                    for (Accion accion:lista1){
                        resp1+=accion.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuAventuraC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu aventura╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Aventura ave1=new Aventura();
                    ArrayList<Aventura> lista1=new ArrayList<>();
                    lista1=ave1.listarAventura();
                    String resp1="";
                    for (Aventura aventura:lista1){
                        resp1+=aventura.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuEstrategiaC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu estrategia╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Estrategia est1=new Estrategia();
                    ArrayList<Estrategia> lista1=new ArrayList<>();
                    lista1=est1.listarEstrategia();
                    String resp1="";
                    for (Estrategia estrategia:lista1){
                        resp1+=estrategia.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuRolC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu rol╣░░░░░\n" +
                    "1» Mostrar Juegos\n"+"2» ingresar a compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Rol rol1=new Rol();
                    ArrayList<Rol> lista1=new ArrayList<>();
                    lista1=rol1.listarRol();
                    String resp1="";
                    for (Rol rol:lista1){
                        resp1+=rol.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuCompraC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu compra╣░░░░░\n" +
                    "1» ingresar compra\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Compra com1=new Compra();
                    com1.setTitulo_de_juego(JOptionPane.showInputDialog("Ingrese el titulo que quiere comprar:"));
                    Double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del juego:"));
                    com1.setPrecio_de_compra(precio);
                    com1.setCodigo_de_tarjeta();
                    JOptionPane.showMessageDialog(null, resp1);
                    break;
                case 2:
                    menuCompraC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuEmpleado(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu empleado╣░░░░░\n" +
                    "1» Registrar Empleado\n"+"2» Actualizar Empleado\n"+"3» Eliminar Empleado\n"+"4» Mostrar Empleado\n"+"5» Ingresar a personal de tienda\n"+"6» Ingresar al personal de desarrollo\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Empleado emp1=new Empleado();
                    emp1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
                    emp1.setApellido_paterno(JOptionPane.showInputDialog("Ingrese su apellido paterno:"));
                    emp1.setApellido_materno(JOptionPane.showInputDialog("Ingrese su apellido materno:"));
                    emp1.setContraseña(JOptionPane.showInputDialog("Ingrese una contraseña:"));
                    emp1.setArea_de_trabajo(JOptionPane.showInputDialog("Ingrese su area de trabajo:"));
                    JOptionPane.showMessageDialog(null, emp1.registrarEmpleado());
                    break;
                case 2:
                    Empleado emp2=new Empleado();
                    ArrayList<Empleado> listaE1=new ArrayList<>();
                    listaE1=emp2.listarEmpleado();
                    String resp="";
                    String r="";
                    for (Empleado empleado:listaE1){
                        resp+=empleado.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del empleado a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        emp2.setNombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
                        emp2.setApellido_paterno(JOptionPane.showInputDialog("Ingrese su apellido paterno:"));
                        emp2.setApellido_materno(JOptionPane.showInputDialog("Ingrese su apellido materno:"));
                        emp2.setContraseña(JOptionPane.showInputDialog("Ingrese una contraseña:"));
                        emp2.setArea_de_trabajo(JOptionPane.showInputDialog("Ingrese su area de trabajo:"));
                        emp2.setId(Integer.parseInt(r));
                        JOptionPane.showMessageDialog(null, emp2.actualizarEmpleado());
                    }
                    break;
                case 3:
                    Empleado emp3=new Empleado();
                    ArrayList<Empleado> lista2=new ArrayList<>();
                    lista2=emp3.listarEmpleado();
                    String resp2="";
                    String r2="";
                    for (Empleado empleado:lista2){
                        resp2+=empleado.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del empleado a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        emp3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, emp3.eliminarEmpleado());
                    }
                    break;
                case 4:
                    Empleado emp4=new Empleado();
                    ArrayList<Empleado> lista3=new ArrayList<>();
                    lista3=emp4.listarEmpleado();
                    String resp3="";
                    for (Empleado empleado:lista3){
                        resp3+=empleado.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuPersonalT();
                    break;
                case 6:
                    menuPersonalD();
                    break;
            }
        }while (op!=0);
    }
    public static void menuPersonalT(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu personal de tienda╣░░░░░\n" +
                    "1» Registrar Personal\n"+"2» Actualizar Personal\n"+"3» Eliminar Personal\n"+"4» Mostrar Personal\n"+"5» Ingresar a tienda de juegos\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Personal_de_tienda pdt1=new Personal_de_tienda();
                    int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo:"));
                    pdt1.setHoras_de_trabajo(horas);
                    Double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo semanal:"));
                    pdt1.setSueldo_semanal(sueldo);
                    String fechaC=JOptionPane.showInputDialog("Ingrese la fecha de contracion:");
                    int d=Integer.parseInt(fechaC.substring(0,2));
                    int m=Integer.parseInt(fechaC.substring(3,5));
                    int a=Integer.parseInt(fechaC.substring(6));
                    Calendar cal=Calendar.getInstance();
                    cal.set(a,m-1,d);
                    Date date=cal.getTime();
                    pdt1.setFecha_de_contratacion(date);
                    String fechaF=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion del contrato:");
                    int d2=Integer.parseInt(fechaF.substring(0,2));
                    int m2=Integer.parseInt(fechaF.substring(3,5));
                    int a2=Integer.parseInt(fechaF.substring(6));
                    Calendar cal2=Calendar.getInstance();
                    cal2.set(a2,m2-1,d2);
                    Date date2=cal2.getTime();
                    pdt1.setFecha_de_finalizacion(date2);
                    JOptionPane.showMessageDialog(null, pdt1.registrarPersonalT());
                    break;
                case 2:
                    Personal_de_tienda pdt2=new Personal_de_tienda();
                    ArrayList<Personal_de_tienda> lista1=new ArrayList<>();
                    lista1=pdt2.listarPersonalT();
                    String resp="";
                    String r="";
                    for (Personal_de_tienda personal_de_tienda:lista1){
                        resp+=personal_de_tienda.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del personal a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        int horas2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo:"));
                        pdt2.setHoras_de_trabajo(horas2);
                        Double sueldo2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo semanal:"));
                        pdt2.setSueldo_semanal(sueldo2);
                        String fechaC2=JOptionPane.showInputDialog("Ingrese la fecha de contracion:");
                        int d3=Integer.parseInt(fechaC2.substring(0,2));
                        int m3=Integer.parseInt(fechaC2.substring(3,5));
                        int a3=Integer.parseInt(fechaC2.substring(6));
                        Calendar cal3=Calendar.getInstance();
                        cal3.set(a3,m3-1,d3);
                        Date date3=cal3.getTime();
                        pdt2.setFecha_de_contratacion(date3);
                        String fechaF4=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion del contrato:");
                        int d4=Integer.parseInt(fechaF4.substring(0,2));
                        int m4=Integer.parseInt(fechaF4.substring(3,5));
                        int a4=Integer.parseInt(fechaF4.substring(6));
                        Calendar cal4=Calendar.getInstance();
                        cal4.set(a4,m4-1,d4);
                        Date date4=cal4.getTime();
                        pdt2.setFecha_de_finalizacion(date4);
                        JOptionPane.showMessageDialog(null, pdt2.actualizarPersonalT());
                    }
                    break;
                case 3:
                    Personal_de_tienda pdt3=new Personal_de_tienda();
                    ArrayList<Personal_de_tienda> lista2=new ArrayList<>();
                    lista2=pdt3.listarPersonalT();
                    String resp2="";
                    String r2="";
                    for (Personal_de_tienda personal_de_tienda:lista2){
                        resp2+=personal_de_tienda.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del personal a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        pdt3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, pdt3.eliminarPersonalT());
                    }
                    break;
                case 4:
                    Personal_de_tienda pdt4=new Personal_de_tienda();
                    ArrayList<Personal_de_tienda> lista3=new ArrayList<>();
                    lista3=pdt4.listarPersonalT();
                    String resp3="";
                    for (Personal_de_tienda personal_de_tienda:lista3){
                        resp3+=personal_de_tienda.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuTiendaJE();
                    break;
            }
        }while (op!=0);
    }
    public static void menuPersonalD(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu personal de desarrollo╣░░░░░\n" +
                    "1» Registrar Personal\n"+"2» Actualizar Personal\n"+"3» Eliminar Personal\n"+"4» Mostrar Personal\n"+"5» Ingresar a departamentos de trabajo\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Personal_de_desarrollo pdd1=new Personal_de_desarrollo();
                    int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo:"));
                    pdd1.setHoras_de_trabajo(horas);
                    Double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo semanal:"));
                    pdd1.setSueldo_semanal(sueldo);
                    String fechaC=JOptionPane.showInputDialog("Ingrese la fecha de contracion:");
                    int d=Integer.parseInt(fechaC.substring(0,2));
                    int m=Integer.parseInt(fechaC.substring(3,5));
                    int a=Integer.parseInt(fechaC.substring(6));
                    Calendar cal=Calendar.getInstance();
                    cal.set(a,m-1,d);
                    Date date=cal.getTime();
                    pdd1.setFecha_de_contratacion(date);
                    String fechaF=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion del contrato:");
                    int d2=Integer.parseInt(fechaF.substring(0,2));
                    int m2=Integer.parseInt(fechaF.substring(3,5));
                    int a2=Integer.parseInt(fechaF.substring(6));
                    Calendar cal2=Calendar.getInstance();
                    cal2.set(a2,m2-1,d2);
                    Date date2=cal2.getTime();
                    pdd1.setFecha_de_finalizacion(date2);
                    pdd1.setEspecializacion(JOptionPane.showInputDialog("ingrese su especializacion:"));
                    JOptionPane.showMessageDialog(null, pdd1.registrarPersonalD());
                    break;
                case 2:
                    Personal_de_desarrollo pdd2=new Personal_de_desarrollo();
                    ArrayList<Personal_de_desarrollo> lista1=new ArrayList<>();
                    lista1=pdd2.listarPersonalD();
                    String resp="";
                    String r="";
                    for (Personal_de_desarrollo personal_de_desarrollo:lista1){
                        resp+=personal_de_desarrollo.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del personal a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        int horas2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de trabajo:"));
                        pdd2.setHoras_de_trabajo(horas2);
                        Double sueldo2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo semanal:"));
                        pdd2.setSueldo_semanal(sueldo2);
                        String fechaC2=JOptionPane.showInputDialog("Ingrese la fecha de contracion:");
                        int d3=Integer.parseInt(fechaC2.substring(0,2));
                        int m3=Integer.parseInt(fechaC2.substring(3,5));
                        int a3=Integer.parseInt(fechaC2.substring(6));
                        Calendar cal3=Calendar.getInstance();
                        cal3.set(a3,m3-1,d3);
                        Date date3=cal3.getTime();
                        pdd2.setFecha_de_contratacion(date3);
                        String fechaF4=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion del contrato:");
                        int d4=Integer.parseInt(fechaF4.substring(0,2));
                        int m4=Integer.parseInt(fechaF4.substring(3,5));
                        int a4=Integer.parseInt(fechaF4.substring(6));
                        Calendar cal4=Calendar.getInstance();
                        cal4.set(a4,m4-1,d4);
                        Date date4=cal4.getTime();
                        pdd2.setFecha_de_finalizacion(date4);
                        pdd2.setEspecializacion(JOptionPane.showInputDialog("ingrese su especializacion:"));
                        JOptionPane.showMessageDialog(null, pdd2.actualizarPersonalD());
                    }
                    break;
                case 3:
                    Personal_de_desarrollo pdd3=new Personal_de_desarrollo();
                    ArrayList<Personal_de_desarrollo> lista2=new ArrayList<>();
                    lista2=pdd3.listarPersonalD();
                    String resp2="";
                    String r2="";
                    for (Personal_de_desarrollo personal_de_desarrollo:lista2){
                        resp2+=personal_de_desarrollo.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del personal a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        pdd3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, pdd3.eliminarPersonalD());
                    }
                    break;
                case 4:
                    Personal_de_desarrollo pdd4=new Personal_de_desarrollo();
                    ArrayList<Personal_de_desarrollo> lista3=new ArrayList<>();
                    lista3=pdd4.listarPersonalD();
                    String resp3="";
                    for (Personal_de_desarrollo personal_de_desarrollo:lista3){
                        resp3+=personal_de_desarrollo.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuDepartamentoT();
                    break;
            }
        }while (op!=0);
    }
    public static void menuDepartamentoT(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu departamentos de trabajo╣░░░░░\n" +
                    "1» Registrar Departamento\n"+"2» Actualizar Departamento\n"+"3» Eliminar Departamento\n"+"4» Mostrar Departamento\n"+"5» Ingresar a proyectos actuales\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Departamentos_de_trabajo ddt1=new Departamentos_de_trabajo();
                    ddt1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del departamento:"));
                    Double pres=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto asignado:"));
                    ddt1.setPresupuesto_asignado(pres);
                    Double gastos=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los gastos:"));
                    ddt1.setGastos(gastos);
                    JOptionPane.showMessageDialog(null, ddt1.registrarDepartamentos());
                    break;
                case 2:
                    Departamentos_de_trabajo ddt2=new Departamentos_de_trabajo();
                    ArrayList<Departamentos_de_trabajo> listaE1=new ArrayList<>();
                    listaE1=ddt2.listarDepartamentoT();
                    String resp="";
                    String r="";
                    for (Departamentos_de_trabajo departamentos_de_trabajo:listaE1){
                        resp+=departamentos_de_trabajo.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del departamento a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        ddt2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del departamento:"));
                        Double pres2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto asignado:"));
                        ddt2.setPresupuesto_asignado(pres2);
                        Double gastos2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los gastos:"));
                        ddt2.setGastos(gastos2);
                        JOptionPane.showMessageDialog(null, ddt2.actualizarDepartamentos());
                    }
                    break;
                case 3:
                    Departamentos_de_trabajo ddt3=new Departamentos_de_trabajo();
                    ArrayList<Departamentos_de_trabajo> lista2=new ArrayList<>();
                    lista2=ddt3.listarDepartamentoT();
                    String resp2="";
                    String r2="";
                    for (Departamentos_de_trabajo departamentos_de_trabajo:lista2){
                        resp2+=departamentos_de_trabajo.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del departameno a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        ddt3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, ddt3.eliminarDepartamentos());
                    }
                    break;
                case 4:
                    Departamentos_de_trabajo ddt4=new Departamentos_de_trabajo();
                    ArrayList<Departamentos_de_trabajo> lista3=new ArrayList<>();
                    lista3=ddt4.listarDepartamentoT();
                    String resp3="";
                    for (Departamentos_de_trabajo departamentos_de_trabajo:lista3){
                        resp3+=departamentos_de_trabajo.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuProyectosA();
                    break;
            }
        }while (op!=0);
    }
    public static void menuProyectosA(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu proyectos actuales╣░░░░░\n" +
                    "1» Registrar Protecto\n"+"2» Actualizar Proyecto\n"+"3» Eliminar Proyecto\n"+"4» Mostrar Proyecto\n"+"5» Ingresar a proyectos concluidos\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Proyectos_actuales pya1=new Proyectos_actuales();
                    pya1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del proyecto:"));
                    Double pres=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto asignado:"));
                    pya1.setPresupuesto_asignado(pres);
                    Double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo estimado:"));
                    pya1.setTiempo_estimado(tiempo);
                    JOptionPane.showMessageDialog(null, pya1.registrarProyectosA());
                    break;
                case 2:
                    Proyectos_actuales pya2=new Proyectos_actuales();
                    ArrayList<Proyectos_actuales> listaE1=new ArrayList<>();
                    listaE1=pya2.listarProyectosA();
                    String resp="";
                    String r="";
                    for (Proyectos_actuales proyectos_actuales:listaE1){
                        resp+=proyectos_actuales.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del proyecto a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        pya2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del proyecto:"));
                        Double pres2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto asignado:"));
                        pya2.setPresupuesto_asignado(pres2);
                        Double tiempo2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo estimado:"));
                        pya2.setTiempo_estimado(tiempo2);
                        JOptionPane.showMessageDialog(null, pya2.actualizarProyectosA());
                    }
                    break;
                case 3:
                    Proyectos_actuales pya3=new Proyectos_actuales();
                    ArrayList<Proyectos_actuales> lista2=new ArrayList<>();
                    lista2=pya3.listarProyectosA();
                    String resp2="";
                    String r2="";
                    for (Proyectos_actuales proyectos_actuales:lista2){
                        resp2+=proyectos_actuales.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del proyecto a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        pya3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, pya3.eliminarProyectosA());
                    }
                    break;
                case 4:
                    Proyectos_actuales pya4=new Proyectos_actuales();
                    ArrayList<Proyectos_actuales> lista3=new ArrayList<>();
                    lista3=pya4.listarProyectosA();
                    String resp3="";
                    for (Proyectos_actuales proyectos_actuales:lista3){
                        resp3+=proyectos_actuales.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menuProyectosC();
                    break;
            }
        }while (op!=0);
    }
    public static void menuProyectosC(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu proyectos concluidos╣░░░░░\n" +
                    "1» Registrar Protecto\n"+"2» Actualizar Proyecto\n"+"3» Eliminar Proyecto\n"+"4» Mostrar Proyecto\n"+"5» Ingresar a juegos propios\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Proyectos_concluidos pyc1=new Proyectos_concluidos();
                    pyc1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del proyecto:"));
                    pyc1.setTitulo_comercial(JOptionPane.showInputDialog("Ingrese el titulo comercial del proyecto:"));
                    String fechaF=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion:");
                    int d=Integer.parseInt(fechaF.substring(0,2));
                    int m=Integer.parseInt(fechaF.substring(3,5));
                    int a=Integer.parseInt(fechaF.substring(6));
                    Calendar cal=Calendar.getInstance();
                    cal.set(a,m-1,d);
                    Date date=cal.getTime();
                    pyc1.setFecha_de_finalizacion(date);
                    String fechaL=JOptionPane.showInputDialog("Ingrese la fecha de lanzamiento del proyecto:");
                    int d2=Integer.parseInt(fechaL.substring(0,2));
                    int m2=Integer.parseInt(fechaL.substring(3,5));
                    int a2=Integer.parseInt(fechaL.substring(6));
                    Calendar cal2=Calendar.getInstance();
                    cal2.set(a2,m2-1,d2);
                    Date date2=cal2.getTime();
                    pyc1.setFecha_de_lanzamiento(date2);
                    Double pres=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto invertido:"));
                    pyc1.setPresupuesto_invertido(pres);
                    Double ganacia=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ganancias totales:"));
                    pyc1.setGanacias_totales(ganacia);
                    JOptionPane.showMessageDialog(null, pyc1.registrarProyectosC());
                    break;
                case 2:
                    Proyectos_concluidos pyc2=new Proyectos_concluidos();
                    ArrayList<Proyectos_concluidos> listaE1=new ArrayList<>();
                    listaE1=pyc2.listarProyectosC();
                    String resp="";
                    String r="";
                    for (Proyectos_concluidos proyectos_concluidos:listaE1){
                        resp+=proyectos_concluidos.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del proyecto a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        pyc2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del proyecto:"));
                        pyc2.setTitulo_comercial(JOptionPane.showInputDialog("Ingrese el titulo comercial del proyecto:"));
                        String fechaF2=JOptionPane.showInputDialog("Ingrese la fecha de finalizacion:");
                        int d3=Integer.parseInt(fechaF2.substring(0,2));
                        int m3=Integer.parseInt(fechaF2.substring(3,5));
                        int a3=Integer.parseInt(fechaF2.substring(6));
                        Calendar cal3=Calendar.getInstance();
                        cal3.set(a3,m3-1,d3);
                        Date date3=cal3.getTime();
                        pyc2.setFecha_de_finalizacion(date3);
                        String fechaL2=JOptionPane.showInputDialog("Ingrese la fecha de lanzamiento del proyecto:");
                        int d4=Integer.parseInt(fechaL2.substring(0,2));
                        int m4=Integer.parseInt(fechaL2.substring(3,5));
                        int a4=Integer.parseInt(fechaL2.substring(6));
                        Calendar cal4=Calendar.getInstance();
                        cal4.set(a4,m4-1,d4);
                        Date date4=cal4.getTime();
                        pyc2.setFecha_de_lanzamiento(date4);
                        Double pres2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto invertido:"));
                        pyc2.setPresupuesto_invertido(pres2);
                        Double ganancia2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ganancias totales:"));
                        pyc2.setGanacias_totales(ganancia2);
                        JOptionPane.showMessageDialog(null, pyc2.actualizarProyectosC());
                    }
                    break;
                case 3:
                    Proyectos_concluidos pyc3=new Proyectos_concluidos();
                    ArrayList<Proyectos_concluidos> lista2=new ArrayList<>();
                    lista2=pyc3.listarProyectosC();
                    String resp2="";
                    String r2="";
                    for (Proyectos_concluidos proyectos_concluidos:lista2){
                        resp2+=proyectos_concluidos.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del proyecto a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        pyc3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, pyc3.eliminarProyectosC());
                    }
                    break;
                case 4:
                    Proyectos_concluidos pyc4=new Proyectos_concluidos();
                    ArrayList<Proyectos_concluidos> lista3=new ArrayList<>();
                    lista3=pyc4.listarProyectosC();
                    String resp3="";
                    for (Proyectos_concluidos proyectos_concluidos:lista3){
                        resp3+=proyectos_concluidos.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
                case 5:
                    menujuegosPP();
                    break;
            }
        }while (op!=0);
    }
    public static void menujuegosPP(){
        String input;
        int op;
        do {
            input=JOptionPane.showInputDialog("░░░░░╠Bienvenido al menu juegos propios╣░░░░░\n" +
                    "1» Registrar Juegos\n"+"2» Actualizar Juegos\n"+"3» Eliminar Juegos\n"+"4» Mostrar Juegos\n"+"0» Salir");
            if (input==null){
                op=0;
            }else {
                op=Integer.parseInt(input);
            }
            switch (op){
                case 1:
                    Juegos_propios jgp1=new Juegos_propios();
                    jgp1.setTitulo(JOptionPane.showInputDialog("Ingrese el titulo del juego:"));
                    jgp1.setGenero(JOptionPane.showInputDialog("Ingrese el genero del jeugo:"));
                    String fechaF=JOptionPane.showInputDialog("Ingrese la fecha de lanzamiento:");
                    int d=Integer.parseInt(fechaF.substring(0,2));
                    int m=Integer.parseInt(fechaF.substring(3,5));
                    int a=Integer.parseInt(fechaF.substring(6));
                    Calendar cal=Calendar.getInstance();
                    cal.set(a,m-1,d);
                    Date date=cal.getTime();
                    jgp1.setFecha_de_lanzamiento(date);
                    jgp1.setDesarrollador(JOptionPane.showInputDialog("Ingrese el nombre del desarrollador:"));
                    jgp1.setEditor(JOptionPane.showInputDialog("Ingrese el nombre del editor:"));
                    Double pres=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra:"));
                    jgp1.setPrecio_de_compra(pres);
                    JOptionPane.showMessageDialog(null, jgp1.registrarJuegosP());
                    break;
                case 2:
                    Juegos_propios jgp2=new Juegos_propios();
                    ArrayList<Juegos_propios> listaE1=new ArrayList<>();
                    listaE1=jgp2.listarJuegosP();
                    String resp="";
                    String r="";
                    for (Juegos_propios juegos_propios:listaE1){
                        resp+=juegos_propios.toString()+"\n";
                    }
                    r=JOptionPane.showInputDialog("Ingrese el id del juego a modificar\n"+resp);
                    if (r==null){
                        JOptionPane.showInputDialog(null, "La modificacion se cancelo");
                    }else {
                        jgp2.setTitulo(JOptionPane.showInputDialog("Ingrese el titulo del juego:"));
                        jgp2.setGenero(JOptionPane.showInputDialog("Ingrese el genero del jeugo:"));
                        String fechaF2=JOptionPane.showInputDialog("Ingrese la fecha de lanzamiento:");
                        int d2=Integer.parseInt(fechaF2.substring(0,2));
                        int m2=Integer.parseInt(fechaF2.substring(3,5));
                        int a2=Integer.parseInt(fechaF2.substring(6));
                        Calendar cal2=Calendar.getInstance();
                        cal2.set(a2,m2-1,d2);
                        Date date2=cal2.getTime();
                        jgp2.setFecha_de_lanzamiento(date2);
                        jgp2.setDesarrollador(JOptionPane.showInputDialog("Ingrese el nombre del desarrollador:"));
                        jgp2.setEditor(JOptionPane.showInputDialog("Ingrese el nombre del editor:"));
                        Double pres2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra:"));
                        jgp2.setPrecio_de_compra(pres2);
                        JOptionPane.showMessageDialog(null, jgp2.actualizarJuegosP());
                    }
                    break;
                case 3:
                    Juegos_propios jgp3=new Juegos_propios();
                    ArrayList<Juegos_propios> lista2=new ArrayList<>();
                    lista2=jgp3.listarJuegosP();
                    String resp2="";
                    String r2="";
                    for (Juegos_propios juegos_propios:lista2){
                        resp2+=juegos_propios.toString()+"\n";
                    }
                    r2=JOptionPane.showInputDialog("Ingrese el id del juego a eliminar\n"+resp2);
                    if (r2==null){
                        JOptionPane.showMessageDialog(null, "la eliminacion se a cancelado");
                    }else {
                        jgp3.setId(Integer.parseInt(r2));
                        JOptionPane.showMessageDialog(null, jgp3.eliminarJuegosP());
                    }
                    break;
                case 4:
                    Juegos_propios jgp4=new Juegos_propios();
                    ArrayList<Juegos_propios> lista3=new ArrayList<>();
                    lista3=jgp4.listarJuegosP();
                    String resp3="";
                    for (Juegos_propios juegos_propios:lista3){
                        resp3+=juegos_propios.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, resp3);
                    break;
            }
        }while (op!=0);
    }
}
