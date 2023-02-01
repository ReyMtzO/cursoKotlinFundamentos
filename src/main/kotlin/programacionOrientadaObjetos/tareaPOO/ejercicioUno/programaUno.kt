package programacionOrientadaObjetos.tareaPOO

import programacionOrientadaObjetos.tareaPOO.ejercicioUno.Cuenta
import java.math.BigDecimal
                                // Inicializamos este objeto de la clase Cuenta con los datos e importamos BigDecimal

val objetoCuenta = Cuenta ("01-8547-9", "Alberto Palma", BigDecimal("5000.00"))

fun main() {
    print(              // Le damos estructura a nuestro menú con el método .trimIndent
        """
            Menú                
            1 - Depositar
            2 - Retirar
            
            Ingresa la acción a realizar:
        """.trimIndent()
    )
                                        // Agregamos un readLine() a esta variable llamada accion
    val accion = when(readLine()) {     // Con esta expresión when asignada a la variable, evaluaremos las 3 condiciones disponibles en la ejecución del programa
        "1" -> Accion.DEPOSITAR
        "2" -> Accion.RETIRAR
        else -> return println("Saliendo del programa...")
    }

    print("Ingresa el monto: ")
    val monto = readLine()?.toBigDecimalOrNull()            // Esto es para asegurarnos de que el valor sea válido. Que sea un BigDecimal o si no que sea Null
    if (monto == null || monto <= BigDecimal("0")) {
        println("Monto incorrecto\n")                       // En caso de que sea una entrada incorrecta o valor 0, el programa muestra este mensaje
        return main()                   // Regresa a ejecutar la fun main()
    }                                   // El objetoCuenta está fuera del main (arriba), para evitar que se vuelva a instanciar cuando el programa se vuelva a ejecutar

    val resultado = if (accion == Accion.DEPOSITAR) {
    objetoCuenta.depositar(monto)
    } else {                                        // Realiza la acción y reasigna el resultado a la variable con el valor
    objetoCuenta.retirar(monto)
    }

    if (!resultado) {           // Si el resultado es == false, o !resultado, se muestra el siguiente mensaje
       println("No se pudo realizar la acción solicitada\n")
       return main()            // También nos regresa a main para realizar otras operaciones del menú de opciones
    }

    println(                                // Imprime un recibo
    """
    ---------------Recibo---------------

    ${objetoCuenta.obtenerDatosCuenta()}        

    Acción: $accion                             
    Monto: $$monto
    Saldo anterior: $${objetoCuenta.saldoAnterior}      
    Nuevo Saldo: $${objetoCuenta.saldo}                 

    -----------------------------------
    """.trimIndent()
    )

    main()

}

// ${objetoCuenta.obtenerDatosCuenta()}       Método para obtener los datos de la cuenta
// Acción: $accion y Monto: $monto            Muestra la acción que se realizó y el monto solicitado
// Saldo anterior: $${objetoCuenta.saldoAnterior}      Muestra el saldo anterior que se obtiene con la operación en la variable auxiliar saldoAnterior
// Nuevo Saldo: $${objetoCuenta.saldo}             Muestra el nuevo saldo con la propiedad saldo de nuestro objeto
