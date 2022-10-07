package funciones

// Una variable "local" funciona sólo dentro del bloque de código que la delimita
// Una variable "global" se encuentra disponible en toddo el programa porque está declarada fuera de un bloque de código

val nombre = "Rey David"    // Aquí declaramos una variable global (fuera del bloque de código)

fun main() {

    println(nombre)

    val edad = 28          // Aquí declaramos una variable local

    println(edad)          // En este caso la variable local funciona adecuadamente por estar dentro del bloque y se imprime
    ejemplo()
}
fun ejemplo() {

    println(nombre)        // La variable global se imprime desde cualquier parte del programa

   // println(edad)          // Marca error pintado en rojo porque pedimos imprimir la variable local, fuera del bloque donde se declaró
}
