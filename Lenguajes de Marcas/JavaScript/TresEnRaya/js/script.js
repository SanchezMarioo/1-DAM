let tablero = document.getElementsByClassName("tresRayaTablero");
let turno = "X";
let posiciones = ["", "", "", "", "", "", "", "", ""];
window.onload = function () {
  let turnoTitulo = document.getElementById("tituloTurno");
  jugar()
  let btn = document.getElementById("btn-reinciar")
  btn.addEventListener("click", limpiarTablero)


};

function jugar() {
  let turnoTitulo = document.getElementById("tituloTurno");
  turno = cambiarTurno(turno);
  turnoTitulo.textContent = "Turno de " + turno
  for (let i = 0; i < tablero.length; i++) {
    tablero[i].addEventListener("click", function () {
      if (!comprobarGanador() && tablero[i].textContent == "") {
        turnoTitulo.textContent = "Turno de " + turno
        turno = cambiarTurno(turno);
        tablero[i].textContent = turno;
        posiciones[i] = turno;
        comprobarEmpate();
        comprobarGanador(turnoTitulo);
      }

    });
  }

}

function cambiarTurno(turno) {
  if (turno === "X") {
    return "O";
  } else if (turno === "O") {
    return "X";
  }
}
function limpiarTablero() {
  for (let i = 0; i < tablero.length; i++) {
    // Limpiar el tablero de texto
    tablero[i].textContent = "";
    // Quitamos lo verde en  caso de haber ganado 
    tablero[i].classList.remove("verde")
    // Limpiamos el array
    posiciones = ["", "", "", "", "", "", "", "", ""]
  }
}
// En caso de estar lleno el tablero se da empate 
function comprobarEmpate() {
  let turnoEmpate = document.getElementById("tituloTurno");
  for (let i = 0; i < posiciones.length; i++) {
    if (posiciones[i] == "") {
      return true;
    }

  }
  turnoEmpate.textContent = "El juego ha quedado empate."
  return false;
}

function comprobarGanador(tituloGanador) {
  // Horizontales
  if ((posiciones[0] === "X" && posiciones[1] === "X" && posiciones[2] === "X") || (posiciones[0] === "O" && posiciones[1] === "O" && posiciones[2] === "O")) {
    let posiciones = [0, 1, 2];
    esGanador(posiciones, tituloGanador)
    return true;

  } else if ((posiciones[3] === "X" && posiciones[4] === "X" && posiciones[5] === "X") || (posiciones[3] === "O" && posiciones[4] === "O" && posiciones[5] === "O")) {
    let posiciones = [3, 4, 5];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  else if ((posiciones[6] === "X" && posiciones[7] === "X" && posiciones[8] === "X") ||
    (posiciones[6] === "O" && posiciones[7] === "O" && posiciones[8] === "O")) {
    let posiciones = [6, 7, 8];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  // Verticales
  else if ((posiciones[0] === "X" && posiciones[3] === "X" && posiciones[6] === "X") || posiciones[0] === "O" && posiciones[3] === "O" && posiciones[6] === "O") {
    let posiciones = [0, 3, 6];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  else if ((posiciones[2] === "X" && posiciones[5] === "X" && posiciones[8] === "X") || posiciones[2] === "O" && posiciones[5] === "O" && posiciones[8] === "O") {
    let posiciones = [2, 5, 8];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  else if ((posiciones[1] === "X" && posiciones[4] === "X" && posiciones[7] === "X") || posiciones[1] === "O" && posiciones[4] === "O" && posiciones[7] === "O") {
    let posiciones = [1, 4, 7];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  // Diagonales
  else if ((posiciones[0] === "X" && posiciones[4] === "X" && posiciones[8] === "X") ||
    (posiciones[0] === "O" && posiciones[4] === "O" && posiciones[8] === "O")) {
    let posiciones = [0, 4, 8];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  else if ((posiciones[2] === "X" && posiciones[4] === "X" && posiciones[6] === "X") ||
    (posiciones[2] === "O" && posiciones[4] === "O" && posiciones[6] === "O")) {
    let posiciones = [2, 4, 6];
    esGanador(posiciones, tituloGanador)
    return true;
  }
  return false;
}
function esGanador(posiciones, tituloGanador) {
  for (let i = 0; i < posiciones.length; i++) {
    tablero[posiciones[i]].classList.add("verde");

  }
  tituloGanador.textContent = "Ha ganado el jugador " + tablero[posiciones[0]].textContent
}
