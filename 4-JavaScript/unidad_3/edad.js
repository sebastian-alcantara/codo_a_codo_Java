console.log("Script Edad");

var btn_enviar_1 = document.getElementById('id_btn_enviar_1');
var input_edad = document.getElementById('id_edad');

btn_enviar_1.onclick = () => {
  if (input_edad.value > 0 && input_edad.value < 18) {
    window.alert(`No es mayor de edad`);
  } else if (input_edad.value >= 18) {
    window.alert('Es mayor de edad');
  }
};

input_edad.onkeypress = (e) => {
  if(e.key === 'Enter') {
    btn_enviar_1.click();
  }
}

var input_edad_1 = document.getElementById('id_edad_1');
var input_edad_2 = document.getElementById('id_edad_2');
var input_edad_3 = document.getElementById('id_edad_3');

var btn_enviar_2 = document.getElementById('id_btn_enviar_2');

btn_enviar_2.onclick = () => {
  var edad_1 = parseInt(input_edad_1.value);
  var edad_2 = parseInt(input_edad_2.value);
  var edad_3 = parseInt(input_edad_3.value);
  console.log(edad_2);
  if (edad_1 > 0 && edad_2 > 0 && edad_3 > 0) {
    var edades = [edad_1, edad_2, edad_3];
    var edad_maxima = Math.max(...edades);
    var usuarios = [];
    console.log(edad_maxima);
    for (let paso = 0; paso < 3; paso++) {
      if (edades[paso] === edad_maxima) {
        usuarios.push(paso);
      }
      console.log(usuarios);
    }

    if (usuarios.length === 3) {
      window.alert('Los tres usuarios tienen la misma edad');
    } else if (usuarios.length === 2) {
      window.alert(`El Usuario ${usuarios[0] + 1} y el Usuario ${usuarios[1] + 1} son los de mayor edad`);
    } else {
      window.alert(`El Usuaro ${usuarios[0] + 1} es el de mayor edad`)
    }

  }
};