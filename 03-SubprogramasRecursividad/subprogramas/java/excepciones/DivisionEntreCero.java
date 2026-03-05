import javax.swing.*;


public class DivisionEntreCero {
    public static void main(String[] args) {
        int num1, num2, resultado;

        try {
            num1 = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Introduce el número 1"));
            num2 = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Introduce el número 2"));
            resultado = num1 / num2;
            System.out.println("El resultado es: "
                    + resultado);

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println
                    ("No se puede realizar una division entre cero");
        }
        System.out.println("Fin del Programa");
    }
}