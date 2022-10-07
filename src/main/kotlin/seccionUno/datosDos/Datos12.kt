package seccionUno.datosDos

fun main() {

    println("Ingresa tu nombre: ")
    val nombre = readLine()
    println("Ingresa tu edad")
    val edad = readLine()

    println("""
        *** Datos ***
        Nombre: $nombre
        Edad:   $edad años
    """.trimIndent())
}


// readLine() ... Sirve para solicitar datos al usuario
// println() ...  Sirve para imprimir datos en consola
// Concatenar es unir varios datos en uno solo
// La manera mas facil de concatenar en Kotlin es utilizando "String Template" ($)
/* Una secuencia de escape (\n) sirve para dar un salto de linea en la impresion
   de consola y de esta manera se da un formato que mejora la lectura del texto */
/* Raw String sirve para simular una salida como la que se le va a mostrar al
   usuario y se escribe de la siguiente manera: println("""  """.trimIdent()) */

