import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        // Declaración de Variables
        /*
        * En esta parte del código se van a
        * declarar varios tipos de variables
        * */

        int suma;
        int resta;
        int multi, div, mod, area;
        double resultado = 0.0, potencia;
        boolean valor = true, valor2 = false;
        float f1 = (float)8.9, f2 = 10.3f;
        double d1 = 12;

        // Definir una Constante
        final double PI = 3.1416;
        String salida = "";

        // Expresiones Aritmeticas
        suma = 3 + 5;
        resta = 10 - 12;
        multi = 34 * 23;
        div = 10 / 2;
        mod = 10 % 2;
        potencia = Math.pow(4, 2);

        salida = "===== Expresiones Aritméticas =====" +
                 "\nLa suma es: " + suma +
                 "\nLa resta es: " + resta +
                 "\nLa multiplicación es: " + multi
                 +"\nLa División es: " + div +
                  "\nEl modulo es: " + mod +
                  "\nLa potencia es: " + potencia;

JOptionPane.showMessageDialog(null, salida);


    }
}
