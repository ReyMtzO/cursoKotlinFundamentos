package whenExpresion
/*
fun main() {

    println("\n*INGRESA EL VALOR REQUERIDO:")                   // Mensaje opcional que aparecerá en consola
    val valor = readLine()!!.toInt()                                // Para convertir datos a entero

    when (valor) {                          // Entre paréntesis podemos poner lo que estaremos trabajando: (texto, variable, número, etc...)
        1 -> {
            println("Valor es 1")           // El 1, 2 y else, en este caso, se denominan "ramas"
        }
        2 -> println("Valor es 2")                  // (->) es un separador para el valor que estamos comparando con las instrucciones que realicemos
        else -> println("Valor no es ni 1 ni 2")
    }

    main()                      // Recursividad

}
 */

/*
fun main() {

    val combustible = "gasolina"

    when (combustible) {
        "gasolina", "diesel" -> println("utiliza gasolina o diesel")           // Ponemos "coma" para separar las opciones a elegir en esta parte
        else -> println("utiliza otro combustible")                            // Utilizamos else para respuestas que no tengamos como opciones
    }

}

 */

fun main() {

    print("\nINGRESA TU EDAD:\n")                           // Mensaje para entrada de datos
    val edad = readLine()!!.toInt()                         // .toInt() para convertir a enteros

    /* if (edad < 18) {
         println("El usuario es menor de edad")
     } else if (edad < 60) {
         println("El usuario es mayor de edad")     // Comentamos este código para tomar como ejemplo y usar "when" en lugar de "if"
     } else {
         println("El usuario es de la tercera edad")
     }*/

    when {
        edad < 18 -> println("Es menor de edad")
        edad < 60 -> println("Es mayor de edad")    // El código se simplifica bastante y funciona igual que el ejemplo con if
        else -> println("Es de la tercera edad")
    }

    //main()   // Recursividad
}