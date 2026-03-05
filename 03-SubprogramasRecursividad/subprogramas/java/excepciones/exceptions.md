# Manejo de Excepciones en Java

> Una excepción es un error que ocurre durante la ejecución del programa y que interrumpe el flujo normal

**Ejemplos Comunes:**

- Dividir entre cero
- Convertir un "Hola" número
- Acceder a una posición inexistente de un arreglo

## Estructura básica

```java
try{
    // Código que puede generar error
}catch( TipoDeException e){
    // Código que maneja el error
}finally{
    // Opcional: siempre se ejecuta
}
```
## Tipo de Excepciones

1. Checked (Obligatorias)

Java obliga a manejarlas. Ejemplos:

- IOException
- SQLException

2. Unckecked (RuntimeException)

- AritmeticException
- NullPointerException
- NumberFormatException

Ejemplo 1 **División entre cero**

```java
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
```
Ejemplo 2: **Manejo de Multiples Catch**

```java
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
```
Ejemplo 3: **Uso de Finally**

```java
public class ExcepcionConFinally {
    public static void main(String[] args) {
        int x = 10, y=0, z=0;
        try{
            z= x/y;
            System.out.println(z);
        }catch(ArithmeticException e){
            System.out.println("Error");
        }finally{
            System.out.println("Esto siempre se ejecuta");
        }
        System.out.println("Fin del Programa");
    }
}
```

Ejemplo 4: **Manejo de Throw**

```java
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
```
