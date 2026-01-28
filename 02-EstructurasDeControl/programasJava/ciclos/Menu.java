import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args) {

        String menu = "", opcion="";
        boolean sentinel = true;

        // Crea la cadena de Texto para las opciones del Menú

        menu = "========== MENU ==========\n" +
                "1)Opción 1\n" +
                "2)Opción 2\n" +
                "3)Opción 3\n" +
                "4)Salir\n" +
                "Elegir Opción: ";

        do {
            // Mostrar el Menú
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    JOptionPane.showMessageDialog
                            (null, "Opción 1");
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog
                            (null, "Opción 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog
                            (null, "Opción 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null,
                            "El programa ha terminado");
                    sentinel = false;

                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción no valida");
            } // Cierra el switch

        }while(sentinel);

    } // Cierre del main
} // Cierre clase
