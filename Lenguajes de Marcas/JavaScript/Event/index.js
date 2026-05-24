window.onload = function () {
  let btnContainer = document.getElementById("btn-container");

  btnContainer.addEventListener("click", targetBoton);
};

function targetBoton(event) {
  let titulo = document.getElementById("titulo");
  titulo.innerHTML = "Has pulsado el boton: " + event.target.innerHTML;
  return;
}
