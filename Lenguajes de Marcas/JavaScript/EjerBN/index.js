let img = document.getElementById("color");
while (true) {
    let msg = prompt("Escribe BN o color: ")
    if (msg === "BN") {
        img.src = "img/imagenBN.jpg"
        img.alt="Imagen a color"
        break;
    } else if (msg === "color" || msg === "COLOR"){
        img.src = "img/imagenColor.jpg"
        break;
    }
}