package operadoresAritmeticos

                                                      //Operadores aritmeticos dentro de Kotlin:
                                                          //Suma, Resta, Multiplicacion, Division y Residuo (+, -, *, /, %)
// Ejercicios ordenados de manera simultanea
fun main() {                                              //El IDE sigue la jerarquia de las operaciones
    val numero = 20

    val resultadoSuma = numero + 10
    val resta = numero - 15
    val multiplicacion = numero * 3
    val division = numero / 2
    val residuo = numero % 6     //El residuo de esta operacion es "2" porque... 6 * 3 = 18, y nos faltan 2 para completar 20.
                                 //Este operador: (%), nos da la parte "sobrante" en la division entre 2 operandos
    println(resultadoSuma)
    println(resta)
    println(multiplicacion)
    println(division)
    println(residuo)
}









