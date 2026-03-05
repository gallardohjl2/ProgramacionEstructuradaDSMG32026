import javax.swing.*;


public class MultiplesCatch {
    public static void main(String[] args) {
        int numero, resultado;

        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce un número"));
            resultado = 10/numero;

            JOptionPane.showMessageDialog(null,
                    resultado);
        }catch(NumberFormatException e){
            System.out.println("Error: No ingresaste numero valido" );
        }catch (ArithmeticException e){
            System.out.println("Error: no se puede dividir entre cero");
        }

    }
}