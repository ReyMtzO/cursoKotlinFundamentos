package funciones

import java.util.*                   // 2.- Importamos utilidad de java que contiene el Date

fun main() {

    mostrarMensaje()                // 4.- Ejecutamos la funcion

}

fun mostrarMensaje(){               // 1.- Creamos funcion

    println("""
        Mensaje: Hola desde Kotlin
        Fecha: ${Date()}             
    """.trimIndent())
                                    // 3.- Lo ponemos dentro del String template y dentro de llaves porque se está instansiando
}

// Siempre que quiera utilizar esta funcion, simplemente la invocamos y así no tenemos que escribir de nuevo el código