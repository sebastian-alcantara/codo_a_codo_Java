console.log("Script Promedio");

var nombre_alumno = window.prompt("Ingresá el nombre del alumno:");
var nota_1 = parseInt(window.prompt("Ingresá la nota 1:"));
var nota_2 = parseInt(window.prompt("Ingresá la nota 2:"));
var nota_3 = parseInt(window.prompt("Ingresá la nota 3:"));

var promedio = ((nota_1 + nota_2 + nota_3) / 3).toFixed(2);

window.alert(`El promedio de ${nombre_alumno} es ${promedio}`);