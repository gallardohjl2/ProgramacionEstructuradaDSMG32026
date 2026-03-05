public class LanzarExceptionThrow {
    public static void main(String[] args) {
        int edad = 5;
        if(edad<0){
            throw new IllegalArgumentException
                    ("La edad no puede ser Negativa");
        }
        System.out.println("Edad Valida");
    }
}