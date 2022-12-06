package arraysCicloFor

// El ciclo for es una secuencia que ejecuta de forma repetitiva un bloque de código hasta que se cumple la condición asignada
// Podremos ejecutar de manera automática un array con N cantidad de datos, N cantidad de veces

/*
"for" es la keyword, luego entre paréntesis ponemos una "variable" (i), seguida de la keyword "in" y después un rango en los "argumentos"
por ejemplo: 0...5. El ciclo comenzará en 0, se ejecuta el bloque de código y ahora repite la acción pero con el num 1, y así sucesivamente hasta
ejecutarse el argumento 5. En ese momento el ciclo for finaliza y se procede a ejecutar las líneas de código que siguen.
 */

/*
fun main() {

    val valores = intArrayOf(10, 15, 25, 45, 80, 120)

    for (i in 0 until valores.size){       // Utilizamos "until" para decir: de 0 "hasta" valores.size (tamaño del arreglo)
        println(valores[i])
    }

}*/







        // *** Si quiero saber la sumatoria del arreglo puedo hacer esto:

/*
fun main() {

    val valores =  intArrayOf(10, 15, 25, 45, 80, 60, 10)

    var sumatoria = 0             // Creamos la variable sumatoria de tipo var porque la vamos a reasignar y le damos un 0 de entrada

    for (i in 0 until valores.size) {
        sumatoria += valores[i]            // Es como decir: sumatoria == sumatoria + valores en la posición i, por tanto va a recorrer el bloque
    }                                      // de código y va a hacer la sumatoria del array

    println(sumatoria)                  // Para sumatoria
  //  println(sumatoria/valores.size)       // Para promedio

}*/








fun main() {

    val empleados = arrayOf("Jesús", "Alberto", "Claudia")

    for (i in 0 until empleados.size) {
        println(empleados[i])

        if(empleados[i] == "Alberto") {
            break                           // La palabra reservada "break" corta el ciclo hasta donde se lo solicitamos en el if
        }
    }
    println("\nFinalizó")          // Mensaje opcional
}

/*
     De esta manera podemos imprimir los nombres de los empleados con un index... con la función withIndex nos regresa 2 elementos

        for ( ( i, empleado) in empleados.withIndex()) {
            println("$empleado - $i")
        }
 */