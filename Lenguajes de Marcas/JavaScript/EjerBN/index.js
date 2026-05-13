let img = document.getElementById("img");
console.log(img)
let msg;
while (msg !== "BN" && msg !== "color" && msg !== "COLOR") {
    msg = prompt("Escribe BN o color: ")
    console.log(msg)
    if (msg === "BN") {
        img.src = "img/imagenBN.jpg"
        img.alt="Imagen a color"
        break;
    } else if (msg === "color" || msg === "COLOR"){
        img.src = "img/imagenColor.jpg"
        break;
    } else{
        msg = prompt("Escribe BN o color: ") 
    }
}