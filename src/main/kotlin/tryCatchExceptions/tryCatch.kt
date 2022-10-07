package tryCatchExceptions

import java.io.File
import java.io.FileNotFoundException
import java.lang.NumberFormatException

/*
fun main() {

    try {
        val valor = readLine()!!.toDouble()                            // El programa Sólo aceptará ingresar datos de tipo número
        println(valor)
} catch (e: Exception){                       // De esta manera podemos controlar los datos que aparecen en consola en caso de haber una "excepction"
        println("Entrada incorrecta, el valor debe ser un número")     // En lugar de aparecer los mensajes en color rojo al usuario, mostramos un mensaje
                                                                       //  más claro con una indicación
       // main()              // Hacemos recursivo el programa
    }
}

*/

/*
// Lo ideal sería "atrapar" excepciones "específicas" para poder hacer algo en el caso determinado de que ocurran y evitar "catchar" la excepción general

fun main() {

    val mensaje = File("C:\\Users\\Dell\\Documents\\mensaje.txt").readLines()[0] // Con este "File" cargamos el archivo en memoria
    // Debemos poner doble diagonal al ser una ruta dentro del sistema operativo para que pueda leer el archivo y no marque error
    // El método .readLines() lee todas las líneas del archivo y lo manda a un arrayList, por eso ponemos [0], para obtener la primer línea de texto
    println(mensaje)

}               // Si el archivo no existiera, se mostraría en consola una excepción en lugar del mensaje

*/

/*
fun main() {

    try {
        val mensaje = File("C:\\Users\\Dell\\Documents\\mensaje.txtdd").readLines()[0]       // Agregamos a la dirección la dos "dd" para error
        println(mensaje)
    }catch (e: Exception){
        println("Error: ${e.message}")   // Nos mostrará este mensaje: (The system cannot find the file specified)
      //println("Error: ${e.localizedMessage}"), trata de mostrar el mensaje en el lenguaje que está usando el usuario
      //e.printStackTrace(), imprime en consola una lista de excepciones en rojo para que podamos manejarlas. (De preferencia no mostrar a usuario)
    }

}
*/



// Para manejar múltiples excepciones:

fun main() {

    try {

        val repeticiones = readLine()!!.toInt()

        val mensaje = File("C:\\Users\\Dell\\Documents\\mensaje.txt").readLines()[0] // Agregamos a la dirección: \\mensaje.txtdd para mostrar que
                                                                                              // el archivo no existe, y después quitamos las "dd" para
        for(i in 0 until repeticiones) println(mensaje)                                 // mostrar los resultados correctos
    } catch (e: FileNotFoundException) {
        println("El archivo no existe")
    } catch (e: NumberFormatException){
        println("El valor de repeticiones debe ser un número")
    } catch (e: Exception){
        println("Error: ${e.localizedMessage}")
    } finally {

        println("\nEntró al finally")
    }

}



