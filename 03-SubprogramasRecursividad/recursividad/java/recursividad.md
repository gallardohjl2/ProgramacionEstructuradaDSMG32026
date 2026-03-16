# Recursividad

1. ¿Qué es la recursividad?

La **recursividad** es una técnica donde un método se llama así mismo para resolver un problema.

>Nota: En lugar de utilizar ciclos (for, while, etc), el método se repite a sí mismo hasta que se cumple una condición que lo detiene.

2. Conceptos Clave

1. **Caso Base**

Es la condición que detiene la recursión.
Si no existe -> ❎ se produce un error (StackOverflowError).

2. **Caso General o Recursivo**

Es cuando el métodos se vuelve a llamar a sí misma, pero acercandose al caso base