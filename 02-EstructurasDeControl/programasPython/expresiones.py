""" En esta parte del código se van a
declarar varios tipos de variables
"""

# Expresiones Aritmeticas
suma = 3 + 5
resta = 10 - 12
multi = 34 * 23
div = 10 / 2
divEntera = 12 // 5 # Division entera
mod = 10 % 2
potencia = 4**2 # potencia

"""
salida = "Hola soy la suma: " + str(suma)
print(salida)
salida = 'Hola soy la suma: '
print(salida, suma)
salida = 'Hola soy la "suma": ' + str(suma)
print(salida)
salida = "Hola soy la 'suma': " + str(suma)
print(salida)
"""
# Interpolación de Strings

salida  = f"""
           ===== Expresiones Aritméticas =====
           La suma es: {suma}
           La resta es: { resta }
           La Multiplicación es: { multi }
           La División es: { div }
           La División Entera es: { divEntera }
           El modulo es: { mod }  
           La potencia es: { potencia }  
          """ 
print(salida)


