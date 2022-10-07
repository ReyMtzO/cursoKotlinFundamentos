package tareaDosKotlin

// *** Programa para calcular los costos de trayecto y tarifas con descuento para una empresa de transporte ***
// *** Ejercicio de "ESTRUCTURAS" ***


val costoKilometro = 2.25                  // variable global que contiene el costo por Km de trayecto
val descuentoPorcentaje = 45               // variable global que contiene el % de descuento en caso de ser persona de la tercera edad (con identificación)

fun main() {

    print("Kilómetros del trayecto: ")
    val kilometros = readLine()!!          // El usuario ingresa la cantidad de Km que viaja el pasajero

    if(kilometros.isBlank()) {
        println("Se deben ingresar los kilómetros del trayecto\n")      // Ingresar los Km a recorrer es OBLIGATORIO

        return //main()          // En caso de que no se escriban los Km a recorrer ".isBlank()" se imprime este mensaje y se genera una recursividad
    }

    print("Aplicar descuento de la tercera edad? (identificación necesaria): ")
    val descuentoTerceraEdad = readLine().toString()        // Creamos variable para alamacenar si "aplica o no" el descuento de la tercera edad

    val tarifaGeneral = costoKilometro * kilometros.toDouble() // Variable global con "costo por Km" multiplicada por la "cantidad de Km" en variable local

    when (descuentoTerceraEdad){            // Aplicamos la variable local para saber si aplica o no el descuento: al ingresar "si" o "1" ... aplica
        "si", "1" -> {
            val totalConDescuento = (tarifaGeneral / 100) * (100 - descuentoPorcentaje)
            println("Total a cobrar: $${Math.round(totalConDescuento)}\n")   // Cuando se aplique el descuento, se realiza una op. matemática
        }                                                                    // y se imprime el total a cobrar
        else -> {
            println("Total a cobrar: $${Math.round(tarifaGeneral)}\n")       // Cuando NO aplique el descuento, se imprime el costo de tarifa general
        }
                                            // Math.round() se utiliza para imprimir los datos "redondeados"
    }

   // main()                                  // Recursividad del programa completo


}

            // val totalConDescuento = (tarifaGeneral / 100) * (100 - descuentoPorcentaje) ...

            // La operación matemática que se realiza para darnos el cálculo con descuento es la siguiente:
            // Divide la tarifa general entre 100, y después a 100 le resta el porcentaje de descuento
            // Al ser la tarifa de descuento 45 %, indicamos que a 100 le restamos descuentoPorcentaje y nos da 55

            // Ej: Km del trayecto: 145. Aplicar descuento: si.
            // tarifaGeneral = (costoKilometro * kilometro) / 100. Multiplicado por 100 - descuentoPorcentaje... que es igual a 45

            // totalConDescuento = 2.25 * 145 = 326.25 / 100 = 3.2625 * 55 = 179.4375
            // El número 55 es el resultado de 100 - 45 (descuentoPorcentaje)