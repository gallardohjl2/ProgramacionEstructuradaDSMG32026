import javax.swing.*;

public class Banco {

    private static double saldo = 0.0;

    public static void iniciar(){
        menu();
    }

    private static double consultarSaldo(){
        return saldo;
    }

    private static double depositar (double monto){
        saldo+=monto;
        return saldo;
    }

    private static double retirar (double monto){
        saldo-=monto;
        return saldo;
    }

    private static boolean validarMontoPositivo (double monto){
        return (monto>0)?true:false;
    }

    private static boolean validarSaldoSuficiente(double montoRetirar){
        return (saldo>=montoRetirar)?true:false;
    }

    private static double solicitarMonto(){
        double monto = 0.0;

        while(true) {

            try {
                monto = Double.parseDouble
                        (JOptionPane.showInputDialog
                                ("Introduce el monto"));

                if(validarMontoPositivo(monto)){
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "El número debe ser positivo");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El saldo debe ser un número");
            }
        }

        return monto;
    }



    private static void menu (){
        String menu = "";
        String opcion = "";
        boolean salir = true;
        double monto = 0.0;


        menu = "====== MENU =========\n" +
                      "1. Consultar Saldo\n" +
                      "2. Depositar\n" +
                      "3. Retirar\n" +
                      "4. Salir\n" +
                      "Elegir opción";
        while(salir) {
            opcion = JOptionPane.showInputDialog(menu).toUpperCase();

            switch (opcion) {
                case "1":
                case "A":
                    JOptionPane.showMessageDialog(null,
                            "Tu saldo es: " + consultarSaldo());
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null,
                            depositar(solicitarMonto()));
                    break;
                case "3":
                case "C":
                    monto = solicitarMonto();
                    if(validarSaldoSuficiente(monto)){
                        JOptionPane.showMessageDialog(null,
                                "Retiro Satisfactorio, " +
                                        "tu nuevo saldo es: "
                                        +"$"+ retirar(monto));
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "No tienes saldo suficiente");
                    }
                    break;
                case "4":
                case "S":
                    salir = false;
                    break;
                default:
            }
        }
    }
}
