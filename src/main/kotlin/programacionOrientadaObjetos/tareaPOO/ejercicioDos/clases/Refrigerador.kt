package programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases

import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.ColorElectrodomestico
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.TipoElectrodomestico
import java.math.BigDecimal

class Refrigerador (
    numeroSerie: String,
    color: ColorElectrodomestico,
    peso: Double,
    precio: BigDecimal,
    var capacidad: Double,
    var temperaturaMinimaConservador: Double,
    var temperaturaMinimaCongelador: Double
        ) : Electrodomestico(numeroSerie, TipoElectrodomestico.REFRIGERADOR, color, peso, precio) {

    override fun toString(): String {
        return super.toString() + " - Capacidad: $capacidad ft³ - Temperatura mínima: [$temperaturaMinimaConservador °C conservador][$temperaturaMinimaCongelador °C congelador]"
    }

}

/**
 * La clase -Refrigerador- va a heredar de la clase -Electrodomestico-
 * Agregamos a la clase Refrigerador los mismos valores requeridos en la clase Electrodomestico con excepción del dato
 * TipoElectrodomestico, porque sabemos que en este caso siempre será un REFRIGERADOR
 * Agregamos las propiedades específicas para esta clase, que en este caso son -capacidad- en ft³, -temperaturaMinimaConservador- y
* -TemperaturaMinimaCongelador- en °C
 *
 * A la super clase -Electrodomestico- le pasamos los demás datos que requiere para su construcción:
 * : Electrodomestico(numeroSerie, TipoElectrodomestico.REFRIGERADOR, color, peso, precio)
 * */