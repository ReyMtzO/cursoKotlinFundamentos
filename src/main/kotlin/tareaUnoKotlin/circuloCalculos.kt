package tareaUno

import java.text.DecimalFormat

val PI = 3.14159265359                       // Variable global

fun main() {

    println("\n** Calcular área y circunferencia de un círculo **\n")


    print("Ingresa el radio en centímetros: ")              // Datos de entrada
    val radio = readLine()!!.toDouble()

    val area = calcularAreaCirculo(radio)
    val circunferencia = calcularCircunferenciaCirculo(radio)

    val formato = "#.##"                   // Muestra los datos con un máximo de dos posiciones decimales


    println(                               // Imprime los resultados
        """

        * Centímetros *
        Área               | ${DecimalFormat(formato).format(area)}
        Circunferencia     | ${DecimalFormat(formato).format(circunferencia)}

        * Pulgadas *
        Área               | ${DecimalFormat(formato).format(convertirCm2aIn2(area))}
        Circunferencia     | ${DecimalFormat(formato).format(convertirCentimetrosAPulgadas(circunferencia))}


        """.trimIndent()
    )
    //main()
}

fun calcularAreaCirculo(radio: Double): Double {   // Calculamos el área del círculo multiplicando PI * radio al cuadrado
    return PI * (radio * radio)
}

fun calcularCircunferenciaCirculo(radio: Double): Double {   // El "diámetro" es 2 veces el radio... (radio * 2)
    return 2 * PI * radio             // La "circunferencia es igual a PI * diámetro"
}


fun convertirCentimetrosAPulgadas(centimetros: Double): Double {
    return (1 / 2.54) * centimetros     // 1 pulgada es igual a 2.54 cm
}

fun convertirCm2aIn2(centimetrosCuadrados: Double): Double {    // Convierte Cm2 a In2
    return 0.1550 * centimetrosCuadrados                        // 1 Cm2 = 0.15500031000062 In2
}
