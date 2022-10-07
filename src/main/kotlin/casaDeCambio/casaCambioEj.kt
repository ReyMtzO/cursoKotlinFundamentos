package casaDeCambio

import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0

fun main() {
                            //Estas 3 operaciones en código las dejo en la función main, porque sólo quiero ejecutarlo una vez
    print("Ingresa la tasa de cambio de dólar a pesos: $")
    tasaCambio = readLine()!!.toDouble()

    print("Ingresa la cantidad de pesos para la apertura de caja: $")
    pesosEnCaja = readLine()!!.toDouble()

    print("Ingresa la cantidad de dólares para la apertura de caja: $")
    dolaresEnCaja = readLine()!!.toDouble()

    controlOperaciones()
}
                                // Creamos otra función para resolver la parte del ciclo repetitivo de esta operación
fun controlOperaciones() {

    print("\nIngresa la cantidad de dólares a cambiar: $")
    val dolaresACambiar = readLine()!!.toDouble()

    dolaresEnCaja += dolaresACambiar

    val pesosAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    val formato = "#,###.00"  // Aquí utilizamos la clase de DecimalFormat, para darle formato más fácil de leer a los resultados
                              // Asignamos DecimalFormat a una variable porque lo vamos a utilizar en varias ocasiones

    println("""               
                              
        ** Recibo **
        Pesos mexicanos a entregar: $${DecimalFormat(formato).format(pesosAEntregar)}
        
        Pesos en caja:  $${DecimalFormat(formato).format(pesosEnCaja)}
        Dólares en caja: $${DecimalFormat(formato).format(dolaresEnCaja)}
    """.trimIndent())

    controlOperaciones()    // Al volver a poner esta función hacemos "recursividad" y el IDE lo marca en la linea de código
}                           // Es una función que puede llamarse a sí misma