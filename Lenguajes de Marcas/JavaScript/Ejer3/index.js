let numero = Number(prompt("Introduce el numero: "));
for (let index = 1; index <= 10; index++) {
    if(!Number.isNaN(numero)){
        document.writeln(numero + " * "  + index +  " = " + (numero * index) + "<br>");
        
    }
    
    
}