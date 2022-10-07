package tareaUno

import java.text.DecimalFormat

fun main() {

    println("\n** INGRESA LOS SIGUIENTES DATOS SOBRE TU SALARIO **\n")


    print("Salario mensual bruto: ")
    val salarioMensualBruto = readLine()!!.toDouble()

    print("Impuesto mensual (porcentaje): ")
    val impuestoMensualPorcentaje = readLine()!!.toDouble()


    // Datos al mes (cálculos)
    val impuestoMensualCantidad = (salarioMensualBruto / 100) * impuestoMensualPorcentaje
    val salarioMensualNeto = salarioMensualBruto - impuestoMensualCantidad

    // Datos al año (cálculos)
    val impuestoAnualCantidad = impuestoMensualCantidad * 12
    val salarioAnualNeto = salarioMensualNeto * 12


    val formato = "#.##"         //Máximo de dos posiciones decimales


                                // Resultados
    println(
        """

        Salario mensual neto: $${DecimalFormat(formato).format(salarioMensualNeto)}
        Impuestos a pagar por mes: $${DecimalFormat(formato).format(impuestoMensualCantidad)}

        Salario anual neto: $${DecimalFormat(formato).format(salarioAnualNeto)}
        Impuestos a pagar por año: $${DecimalFormat(formato).format(impuestoAnualCantidad)}

    """.trimIndent()
    )

}
