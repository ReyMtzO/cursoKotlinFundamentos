package nullEmptyNSafety

// Calculamos el área de un cuadrado...

/*
fun main() {

    val valor: Int? = null
    val resultado = valor * valor   // Con la característica de Kotlin de NullSafety, el compilador nos advierte cuando tengamos código
                                    // que pueda producir un NullPointerException
    println(resultado)

}




fun main() {

    var entrada = readLine()         // Aquí podría darnos un null, es por eso que en otras ocasiones utilizamos el !!.toDouble()
                                     // precisamente para forzar a nuestro programa para que nunca sea null y siempre lo convierta a un valor
    if(entrada != null){
        println("No es null")
    } else {
        println("Sí es null")
    }
}




fun main() {

    val entrada = readLine()

    val lado = if (entrada != null) entrada.toDouble() else 0.0     // Ya no hace falta agregar !! porque el IDE checa la verificación en el if()

    val resultado = lado * lado

    println(resultado)

}




// Una manera de reemplazar la condicional if - else, podemos utilizar el operador "elvis"
// El símbolo del operador Elvis es un signo de interrogación seguido de dos puntos ( ?: ).
// Es un operador binario que evaluará dos expresiones. Si la expresión de la izquierda no es nula,
// utilizará la referencia o el valor de esa expresión

// Utilizando este operador, el ejemplo se ve de la sig manera:


fun main() {

    try {
        val entrada = readLine()

        val lado = entrada?.toDouble() ?: 0.0

        val resultado = lado * lado

        println(resultado)
    }catch (e: Exception){
        println("Entrada no válida")
    }
    main()
}

// También utilizamos un bloque "try" - "catch" para que no nos arroje un error cuando agreguemos un valor de entrada no válido
// ya que estamos convirtiendo el valor a Double y tenemos que asegurarnos de que se pueda convertir a Double





// También podemos sustituir el bloque "try" "catch" por el método .toDoubleOrNull() y así tener menos código, de la sig. manera:

fun main() {

        val entrada = readLine()

        val lado = entrada?.toDoubleOrNull() ?: 0.0

        val resultado = lado * lado

        println(resultado)

}

// En este caso, entrada ya validó que no es null, de modo que ya podemos obtener un número o un texto.
// Y con .toDoubleOrNull(), si la entrada es un número, lo convierte a double y se le asigna a "lado", pero si es un texto o algo que no se puede
// convertir a double, entonces nos da el otro valor del operador "elvis" ?: que sería el 0.0





// ** Operador de llamada segura **     Nos permite usar una variable o realizar una acción siempre que no sea null

fun main() {

    var entrada = readLine()
    entrada = entrada?.toUpperCase()          // Si entrada no es null, va a ejecutar el method para convertir tod0 a mayúsculas
    println(entrada)                          // pero si es null, no ejecuta nada y lo deja tal y como está

}
*/




fun main() {

    var entrada = readLine()

    val lado = entrada?.toDoubleOrNull()

    lado?.let {             // Esto es un lambda y sustituye el poner if(lado != null), etc... y al poner .let se agregan las llaves automáticamente
       val resultado = it * it          // Este bloque de code se va a ejecutar solamente si el valor no es null
        println(resultado)
    }

    println("Finalizó")
}







