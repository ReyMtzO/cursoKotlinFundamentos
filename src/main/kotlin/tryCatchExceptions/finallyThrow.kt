package tryCatchExceptions

import java.lang.Exception

// Las excepciones también son una expresión dentro de Kotlin
/*
fun main() {

    println(esNumero(readLine()!!))

}

fun esNumero(valor: Any): Boolean{      // Boolean para regresar un false o un true

    val resultado = try {               // Asignamos el resultado de la ejecución de la evaluación de un bloque try catch
        valor.toString().toDouble()     // a una variable ya que este bloque también es una expresión dentro de Kotlin
        true
    } catch (e: Exception) {            // Primero convertimos a string y luego a double para ver si es un número y regresamos un true
        false
    }
                            // Le decimos al programa que lo que salga del "try" lo asigne a la val resultado
    return resultado        // Si se puede convertir, manda un true... si no, manda un false
}
*/


// Podemos hacer nuestras propias excepciones con la palabra reservada "throw"
// Hacemos un ejemplo en donde calculamos el interés de un préstamo para analizar esto


fun main() {

    println(calcularInteresesPrestamo(readLine()!!.toDouble()))

}

fun calcularInteresesPrestamo(valor : Double) : Double {  // Recibimos un valor de tipo de dato Double y regresamos un valor de tdd Double también

    if(valor > 100_000){     //Según la lógica del negocio no podemos hacer préstamos de más de 100 mil pesos

        throw Exception("El préstamo no puede ser mayor que 100,000.00 pesos")
    }

    return valor * 0.10     // Suponemos que el interés es del 10%

}
// Si la cantidad ingresada es menor a 100 mil pesos, no hay mayor inconveniente, pero si la cantidad ingresada supera esta cifra...
// mostraremos al usuario la excepción además del mensaje que le agregamos en el throw Exception


