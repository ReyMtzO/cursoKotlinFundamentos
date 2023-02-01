package programacionOrientadaObjetos.tareaPOO.ejercicioUno

import java.math.BigDecimal
// Utilizamos la clase BigDecimal que nos permite realizar cálculos 100 % exactos. Los valores se le dan con tipo de dato String " "

/**
 * El algoritmo dice que la clase debe tener 3 propiedades que se inicializan en el constructor:
 * -Clabe- y -titular- se inicializan como val, ya que estos valores no serán modificables, y serán de tipo de dato String
 * Por otra parte, -saldo- se inicializa como var, porque este valor sí se irá modificando según se realicen las transacciones
 * y será de tipo de dato BigDecimal para que sea más preciso a la hora de trabajar con valores monetarios exactos (en lugar de usar tipos de dato float o double)
 */
class Cuenta constructor (val clabe: String, val titular: String, var saldo: BigDecimal) {

    var saldoAnterior: BigDecimal = saldo           // Variable auxiliar para mostrar el saldo anterior cada vez que realicemos una operación

    fun depositar(valor: BigDecimal): Boolean {     // Método para realizar la operación de depositar. Su parámetro es el valor a depositar y le pedimos que nos regrese un boolean para saber si se realizó la operación correctamente o no

        return if (valor > BigDecimal("0")){    // Verificamos que el valor sea mayor que cero,
            saldoAnterior = saldo                   // Asignamos el saldo anterior al saldo
            saldo += valor                      // Esto es para agregar el valor al saldo actual de la cuenta al ser un depósito
            true                            // Si se realiza la operación...
        } else {
            false                           // Si la operación es incorrecta...
        }
    }

    fun retirar(valor: BigDecimal): Boolean {       // Mismo proceso que con el método depositar
        val valorFinal = valor.abs()            // .abs() nos da el valor absoluto (evita que hayan valores negativos)
        return if (valorFinal > saldo) {            // Return con base a la condición de que exista más dinero en la cuenta del que queremos retirar
            println("El monto a retirar ($valorFinal) no puede ser mayor que el saldo ($${saldo})")
            false
        } else {
            saldoAnterior = saldo               // Asignamos el saldo anterior al saldo
            saldo -= valorFinal                 // Esto es para restar el valor al saldo actual de la cuenta al ser un retiro
            true

        }
    }

    fun obtenerDatosCuenta(): String {              // Auxiliar para obtener los datos de la cuenta
        return "Clabe: $clabe - Titular: $titular"      // Creamos este método para acceder a la clabe y el titular de manera más práctica
    }
}