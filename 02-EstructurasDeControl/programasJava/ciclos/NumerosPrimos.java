import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        double numero = 5;
        int cont = 0;

        int i = 1;
        while (i <= numero){
            if(numero % 2 == 0){
                cont++;
            }
            i++;
        }

        if(cont>2){
            JOptionPane.showMessageDialog(null,
                    "No es Primo");
        }else{
            JOptionPane.showMessageDialog(null,
                    "Es primo");
        }
    }
}