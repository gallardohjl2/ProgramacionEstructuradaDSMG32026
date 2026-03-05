/*
 Crear un prograna que:
 1. pida el nombre del cliente
 2. pida la cantidad de productos comprados
 3. Pida el precio de cada producto
 4. Calcule el total
 5. Aplique descuentos:
    - 10% si el total >1000
    - 5% si el total >500
 6. Mostrar el total final

 Debe:

 1. validar que cantidades y precios sean positivos
 2. Repetir hasta que los datos sean correctos
 3. Usar métodos
* **/


import javax.swing.*;

public class SistemaVentas {

    public static void iniciar(){
       String nombre  = solicitarCliente();
       int cantidadProductos = validarNumeroPositivo
               ("Ingresar Cantidad de Productos");
       double total = calcularTotal(cantidadProductos);
       double totalConDescuento = aplicarDescuento(total);
       imprimir(total, nombre,totalConDescuento);
    }
    private static void imprimir
            (double total,
             String cliente,
             double totalDescuento) {

        String salida = "Nombre del Cliente: " + cliente
                        + "\nTotal sin Descuento: " + total
                        + "\nTotal con Descuento: " + totalDescuento;
        JOptionPane.showMessageDialog(null,
                salida);
    }



    private static String solicitarCliente(){
        String nombre = "";

        while(true){
        nombre = JOptionPane.showInputDialog("Ingresa el nombre");
            if(nombre!=null){
                nombre = nombre.trim();
                if(nombre.length() >0 && nombre.length() <=10 ){
                    if(validarContieneNumeros(nombre)){
                        return nombre;
                    }
                    JOptionPane.showMessageDialog(null,
                            "Nombre contiene números");

                }else{
                    JOptionPane.showMessageDialog(null,
                            "Nombre no valido por que no cumple el tamaño");
                }

            }else{
                JOptionPane.showMessageDialog(null,
                        "Nombre no valido por null");
            }


        }
    }

    private static boolean validarContieneNumeros (String nombre){
        for (int i = 0; i < nombre.length() ; i++) {
            if(Character.isDigit(nombre.charAt(i))){
                return false;
            }
        }
        return true; // Es que el nombre no tiene números
    }

    private static int validarNumeroPositivo (String mensaje) {
        // Validar que el número de productos sea positivo

        int numero = 0;
        while (true) {
            try {
                numero = Integer.parseInt
                        (JOptionPane.showInputDialog(mensaje));
                if (numero > 0) {
                    return numero;
                }
                JOptionPane.showMessageDialog(null,
                        "Debe ser mayor a cero");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Dato inválido");
            }
        }
    }
    private static double validarDoublePositivo (String mensaje) {
        double numero = 0.0;
        while (true) {
            try {
                numero = Double.parseDouble
                        (JOptionPane.showInputDialog(mensaje));
                if (numero > 0.0) {
                    return numero;
                }
                JOptionPane.showMessageDialog(null,
                        "Debe ser mayor a cero");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Dato inválido");
            }
        }

    }
        private static double calcularTotal (int cantidad) {
            double total = 0.0, precio = 0.0;

            for (int i = 1; i <=cantidad ; i++) {
                precio = validarDoublePositivo
                        ("Precio del Producto " + i);
                total+=precio;
            }

            return total;

        }

        private static double aplicarDescuento (double total) {
              //double totalDescuento = 0.0;
            return (total>1000)?total*0.90:
                    (total>500)?total*0.95: total;

//            if (total>1000) {
//                return total * 0.90;
//            }else if(total > 500) {
//                return total * 0.95;
//            }else {
//                return total;
//            }

//            if (total>1000) {
//                totalDescuento =total * 0.90;
//            }else if(total > 500) {
//                totalDescuento= total * 0.95;
//            }else {
//                totalDescuento= total;
//            }
//
//            return totalDescuento;
        }


    }