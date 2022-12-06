package calculator


fun main() {
    val numero = 20

    val resultadoSuma = numero + 10
    val resta = numero - 15
    val multiplicacion = numero * 3
    val division = numero / 2
    val residuo = numero % 6


    val multiplicacion2 : Int = numero
    println("Esta es la multiplicación con el método times: " + multiplicacion2.times(2))


    println(resultadoSuma)
    println(resta)
    println(multiplicacion)
    println(division)
    println(residuo)
}
