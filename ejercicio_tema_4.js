
// IF
numero = -1;
if(numero>0){
    console.log("Numero es positivo")
}else if(numero<0){
    console.log("Numero es negativo")
}else{
    console.log("Numero es igual a 0")
}

// WHILE
var numeroWhile = 0
while (numeroWhile < 3) {
    console.log(numeroWhile)
    numeroWhile++
}

// DO WHILE
numeroWhile = 1
do {
    console.log(numeroWhile)
    numeroWhile++
    break
} while (numeroWhile < 3)


// FOR
for (let numeroFor = 0; numeroFor <= 3; numeroFor++) {
    console.log(numeroFor)   
}


//SWITCH
var estacion = "No definido"
switch (estacion) {
    case "Verano":
        console.log("La estación es Verano")
        break;
    case "Otoño":
        console.log("La estación es Otoño")
        break;
    case "Invierno":
        console.log("La estación es Invierno")
        break;
    case "Primavera":
        console.log("La estación es Primavera")
        break;
    default:
        console.log("No corresponde a ninguna estación")
        break;
}