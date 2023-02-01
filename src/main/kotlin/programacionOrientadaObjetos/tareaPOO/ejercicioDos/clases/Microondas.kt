package programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases

import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.ColorElectrodomestico
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.TipoElectrodomestico
import java.math.BigDecimal

class Microondas (
    numeroSerie: String,
    color: ColorElectrodomestico,
    peso: Double,
    precio: BigDecimal,
    var potencia: Double
        ) : Electrodomestico(numeroSerie, TipoElectrodomestico.MICROONDAS, color, peso, precio) {

    override fun toString(): String {
        return super.toString() + " - Potencia: $potencia watts"
    }

        }


/**
 * La clase -Microondas- va a heredar de la clase -Electrodomestico-
 * Agregamos a la clase Microondas los mismos valores requeridos en la clase Electrodomestico con excepción del dato
 * TipoElectrodomestico, porque sabemos que en este caso siempre será un MICROONDAS
 * Agregamos la propiedad específica para esta clase, que en este caso es -potencia- en watts
 *
 * A la super clase -Electrodomestico- le pasamos los demás datos que requiere para su construcción:
 * : Electrodomestico(numeroSerie, TipoElectrodomestico.MICROONDAS, color, peso, precio)
 * */