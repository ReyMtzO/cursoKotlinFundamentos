package programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases

import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.ColorElectrodomestico
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.TipoElectrodomestico
import java.math.BigDecimal

class Lavadora (
    numeroSerie: String,
    color: ColorElectrodomestico,
    peso: Double,
    precio: BigDecimal,
    var capacidad: Double
        ) : Electrodomestico(numeroSerie, TipoElectrodomestico.LAVADORA, color, peso, precio) {

    override fun toString(): String {
        return super.toString() + " - Capacidad: $capacidad kg"
    }

        }

/**
 * La clase -Lavadora- va a heredar de la clase -Electrodomestico-
 * Agregamos a la clase Lavadora los mismos valores requeridos en la clase Electrodomestico con excepción del dato
 * TipoElectrodomestico, porque sabemos que en este caso siempre será una LAVADORA
 * Agregamos la propiedad específica para esta clase, que en este caso es -capacidad- en kg
 *
 * A la super clase -Electrodomestico- le pasamos los demás datos que requiere para su construcción:
 * : Electrodomestico(numeroSerie, TipoElectrodomestico.LAVADORA, color, peso, precio)
 * */