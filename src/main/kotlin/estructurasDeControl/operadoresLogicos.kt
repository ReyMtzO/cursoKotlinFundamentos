package estructurasDeControl

fun main() {

    val edad = 20        // Int
    val aval = true      // Boolean

    if (edad >= 18 && aval == true) {           // Usamos "&&" para unir las dos comparaciones
        println("Otorgar préstamo")             // Deben cumplirse ambas condiciones para imprimir el mensaje
    }
}


/*
                    // Otro ejemplo:

    if (edad >= 18 || aval == false) {      // Usamos "||" para hacer la division de condiciones
        println("Otorgar préstamo")         // Basta con que se cumpla una u otra condicion para imprimir el mensaje
    }

}









fun main() {

    val sesionIniciada = true
                                            // En este ejemplo tenemos un operador de negacion y en este caso el mensaje no se imprime
    if(sesionIniciada == !true)             // ya que estamos diciendo que NO es true (!true), por tanto es un false y no se cumple la condicion
        println("Bienvenido")
}


fun main() {
                            // Podemos simplificar nuestro código de esta manera...
    val edad = 18

    val mensajeResultado = if (edad >= 18) "Es mayor de edad" else "Es menor de edad"

    println(mensajeResultado)
}

                            // Y también podemos simplificar nuestro código aún más si no queremos agregar una variable...

fun main() {
    val edad = 18
    println(if (edad >= 18) "Es mayor de edad" else "Es menor de edad")

}

*/