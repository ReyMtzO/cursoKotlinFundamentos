package seccionUno.datosUno

fun main() {

    var numero = 10 // La variable tipo "var" es mutable, por tanto su valor puede cambiar
                    // Dato primitivo "entero"
    println(numero)

    numero = 2_000_000

    println(numero)

    /* Para poder leer mejor los datos largos al escribir codigo
    podemos usar separaciones con guion bajo para separar las cifras */

    val pi = 3.1415927f  /* Al escribir una "f" al final de la cifra, se toma como
                                dato de tipo "Float" y el valor total se redondea*/

    println(pi)

    val mensaje = 'c' // Tipo de dato "Char". Esto lo indicamos al compilador por las comillas simples

    println(mensaje)

     val mensajes = "Strings" // Tipo de dato "String". Se utilizan comillas dobles

    println(mensajes)

    val condition = false // Tipo de dato "Boolean", solo puede tener dos estados: true or false

    println(condition) // Se utilizan para condicionar

    // Buscar asignar nombres descriptivos al declarar variables
}
