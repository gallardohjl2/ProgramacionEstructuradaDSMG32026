import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaración de variables
        double calif1 = 0.0, calif2=0.0, calif3=0.0;
        double promedio = 0.0;

        // Entrada de los datos
        calif1 = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce la calificación 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce la calificación 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce la calificación 3"));

        // Operación - Calcular el promedio
        promedio = (calif1 + calif2 + calif3) / 3.0;

        // Estructura de selección simple
        if(promedio>=7.0){
            JOptionPane.showMessageDialog(null,
                    "Aprobado");
        } // Cierra el if
    } // Cierra el main
} // Cierra la clase