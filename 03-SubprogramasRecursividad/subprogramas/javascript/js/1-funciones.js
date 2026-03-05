
// console.warn('Funciones Tradicionales');

// function saludar(){
//     console.log('Hola a todos');
// }

// function saludar2 ( nombre ){
//     console.log('Hola ' + nombre);
// }

// function sumar (a, b){
//     return a + b;
// }

// function multiplicar (a, b){
//     return 'La multiplicación de ' + a + ' * ' + b + " = " + (a*b);
// }

// function dividir (a, b){

//    if(b==0){
//     console.log('El denominador no puede ser cero');
//     return;
//    } 
//    return `La división de ${a} / ${b} = ${a/b}`;
// }
// saludar();
// saludar2('Arcadia');

// let suma = sumar(3,4);
// console.log({suma});

// const mensaje = multiplicar(5,6);
// console.log(mensaje); 

// const mensa2 = dividir(5,6);
// console.log(mensa2);

console.warn('Funciones anonimas');

const sumar = function (a , b){
    return a + b;
}

const saludar = function (){
    console.log("Hola");
}

const dividir = function (a, b){

    if(b==0){                   
        console.log('El denominador no puede ser cero');
        return;
    }
    return `La división de ${a} / ${b} = ${a/b}`;
    
}

let suma1 = sumar(9,8);
let saludar3 = saludar();
let dividir2 = dividir(10,3);



console.warn('Arrow Functions (Funciones de Flecha)');

const mensa3 = () => {
    return 'Hola Mundo Arrow';
}  

const saludar4 = (nombre) => {
    return `Hola como estas: ${nombre}`;
} 

const saludar5 = nombre => {
    return `Hola como estas: ${nombre}`;
} 

const saludar6 = nombre => `Hola como estas: ${nombre}`;
 

const dividir3 = (a,b) =>{
    return a/b;
}

console.log(mensa3());
console.log(saludar4('Floriberto'));
console.log(dividir3(10,20));
