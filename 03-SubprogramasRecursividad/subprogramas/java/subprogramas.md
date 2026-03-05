# Subprogramas en Java

1. ¿Qué es una función en Java?

En java, una función se llama **método**

Un `método` es un bloque de código que:

- Realiza una tarea especifica
- Puede recibir datos (parametros)
- Puede devolver un resultado 
- Puede reutilizarse

2. Estructura de un método

```java 
 modificador static tipoRetorno nombreMetodo ( parametros ){
    // cuerpo
    return valor; // si aplica
 }
```

**Ejemplo:** 

```java 
 public static int sumar ( int a, int b ){
    // cuerpo
    return a + b; // si aplica
 }
```

3. ¿Por qué utilizar métodos estaticos?

Por qué el metodo `main` es estático:

Un método estático:

- Pertenece a la clase 
- No necesita crear un objeto
- Se invoca directamente



