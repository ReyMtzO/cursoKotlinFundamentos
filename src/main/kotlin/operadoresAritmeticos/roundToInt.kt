package operadoresAritmeticos

import kotlin.math.round

fun main() {

    val numero = 3.5

    println(round(numero).toInt())

}

// El metodo "round" redondea de la forma conocida como "normal" de 3.5 a 4 y de 3.4 a 3
// Con el metodo .toInt, el numero se redondea a entero
// El metodo "floor" redondea hacia abajo, por ejemplo: de 3.9 a 3,
// El metodo "ceil" redondea hacia arriba, por ejemplo: de 3.1 a 4

// println(DecimalFormat( pattern: "#.##").format(pi)) .- nos imprime la parte entera y la cantidad de decimales que le indiquemos
// Esto es para dar formato y precision