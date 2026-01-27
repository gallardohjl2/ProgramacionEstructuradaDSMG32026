import javax.swing.JOptionPane;
public class Calificaciones2 {

    public static void main(String[] args) {
        // Declaración de variables
        double calif1, calif2, calif3, promedio;
        final int NUM_CALIF = 3;

        // Entrada de Datos

        calif1 = Double.parseDouble(
                JOptionPane.showInputDialog
                        ("Introduce la calificación 1"));
        calif2 = Double.parseDouble(
                JOptionPane.showInputDialog
                        ("Introduce la calificación 2"));
        calif3 = Double.parseDouble(
                JOptionPane.showInputDialog
                        ("Introduce la calificación 3"));

        // Proceso: Calculo del promedio

        promedio = (calif1 + calif2 + calif3) / NUM_CALIF;

        // Comparación con una estructura selectiva doble
        if(promedio >= 7.0){
            JOptionPane.showMessageDialog(null,
                    "Aprobado");
        }else{
            JOptionPane.showMessageDialog(null,
                    "No Aprobado");
        }

    }// Cierra el main

} // Cierra la clase