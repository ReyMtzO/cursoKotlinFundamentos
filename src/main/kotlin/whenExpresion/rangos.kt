package whenExpresion
                        // Los rangos en Kotlin nos permiten determinar si un número o valor esta dentro de un rango determinado
                        // Ej: si la edad está dentro de un rango de 1 - 18, realiza cierta acción específica
/*
fun main() {

    val edad = readLine()!!.toInt()

    when (edad) {
        in 1..17 -> println("Es menor de edad")             // De esta manera hacemos rangos para acciones específicas dependiendo de donde queremos...
        in 18..59 -> println("Es mayor de edad")            // que entre nuestra condición
        in 60..120 -> println("Es de la tercera edad")
        else -> println("Edad incorrecta")
    }

    //main()
}


                                                        // También podemos hacer varias acciones dentro de cada "in"...
    when (edad) {                                       // cuando el valor esté entre 1 y 17, se van a imprimir ambos mensajes
        in 1..17 -> {
            println("Resultado")
            println("Es menor de edad")

        }
        in 18..59 -> println("Es mayor de edad")            // Mientras que estas líneas de código siguen funcionando igual
        in 60..120 -> println("Es de la tercera edad")
        else -> println("Edad incorrecta")
    }
}
*/

/*
fun main() {

    val edad = readLine()!!.toInt()

    val mensajeResultado = when (edad) {
        in 1..17 -> "Es menor de edad"
        in 18..59 -> "Es mayor de edad"           // Asignamos un valor a una variable y posteriormente lo mostramos
        in 60..120 -> "Es de la tercera edad"
        else -> "Edad incorrecta"
    }

    println(mensajeResultado)

    main()              // Recursividad
}

*/

// Tambien podemos comprobar con la expresión "when" qué tipo de dato es una variable... (String, Long, Int, etc...)

fun main() {

    val valor: Any = "Hola"             //Any puede contener cualquier valor (cualquier tipo de dato)

    when (valor) {
        is String -> println("Es string")
        is Int -> println("Es int")
        is Long -> println("Es long")
    }
}