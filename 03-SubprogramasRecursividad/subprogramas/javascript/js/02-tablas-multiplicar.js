const solicitarValor = () => {
  let sentinel = true;
  let valor;
  let numero;

  do {

    valor = prompt("Ingresa el valor:");
    numero = Number(valor);

    if (!isNaN(numero) && Number.isInteger(numero) && numero>0) {
      sentinel = false;
    } else {
      alert("No es un número entero o positivo, introduce otra vez");
    }
  } while (sentinel);

  return numero;

};

const generarTablas = (numeroTabla) => {
    let tabla = '';
    
    for (let i = 0; i <=10; i++) {
        tabla+= `${numeroTabla} * ${i} = ${numeroTabla * i} \n`;        
    }

    return tabla;
}

const valor = solicitarValor();
const salida = generarTablas(valor);
alert(salida);
