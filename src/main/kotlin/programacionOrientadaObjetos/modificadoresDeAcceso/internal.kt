package programacionOrientadaObjetos.modificadoresDeAcceso

//import clases.Auto      ... comentamos para ver funcionalidad del código dentro del nuevo módulo Prueba
import java.util.*

// El modificador de acceso "internal" nos permite acceder a los elementos que lo tengan, solamente dentro del módulo que tienen
// Para poder ejemplificar este modificador vamos a crear un módulo, el cual es una parte independiente del proyecto y será como una biblioteca...
// de funciones que ya vamos a tener listas para utilizar


fun main() {

    //var auto = Auto("Honda")    ... comentamos para ver funcionalidad del código dentro del nuevo módulo Prueba
    //println(auto.marca)         ... comentamos para ver funcionalidad del código dentro del nuevo módulo Prueba
}


// Damos clic derecho sobre el proyecto - New - Module - Module name: Prueba ... finalizar. Como resultado tendremos un módulo independiente creado
// Creamos dentro de este nuevo proyecto un package llamado "clases" y dentro de este una clase llamada: Auto
// Esta clase contendrá class Auto(var marca: String) {} para inicializarla, la cual es public por defecto. Ahora necesitamos referenciar el módulo
// Para esto damos clic derecho a "Sources root kotlin" - Open Module Settings - En el módulo "main" vamos a Dependencies - damos en "+" - Module Dependency...
// Seleccionamos Prueba - Apply - ok, y de esta manera ya estamos haciendo referencia de este nuevo módulo dentro del principal


// El modificador internal hace referencia de que va a ser accesible solo desde el módulo en donde se encuentra
// Para continuar con el proceso de ejemplificación del modificador de acceso "internal", nos movemos al módulo recién creado "Prueba", después...
// al package "ejecutable" y a la clase "Main", para continuar comentando este ejercicio.