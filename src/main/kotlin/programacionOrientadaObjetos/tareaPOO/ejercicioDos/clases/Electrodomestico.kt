package programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases

import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.ColorElectrodomestico
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.TipoElectrodomestico
import java.math.BigDecimal

abstract class Electrodomestico(
    var numeroSerie: String,
    var tipo: TipoElectrodomestico,
    var color: ColorElectrodomestico,
    var peso: Double,
    var precio: BigDecimal
) {
    init {
        contadorFabricados++
    }

    override fun toString(): String {
        return "Número de Serie: $numeroSerie - Tipo: $tipo - Color: $color - Peso: $peso kg - Precio: $$precio"
    }

    companion object {
        var contadorFabricados = 0
    }

}

/**
 * Esta será nuestra super clase, llamada Electrodomestico y se nos solicita agregarla como clase abstracta
 * Las demás clases que creemos van a heredar de esta super clase
 * Agregamos las "propiedades" en el "constructor" e importamos los datos que se requieran
 *
 * Se nos solicita crear una propiedad estática que permita contabilizar el total de
electrodomésticos fabricados (instanciados a partir de la clase), que aumentará cada vez
que se cree una instancia de la clase...

 * Esto se resuelve con el "companion object" agregando una variable de clase inicializada en "0"
 * Cada que se llame al -init- de la clase, aumentaremos contadorFabricados++ (en 1) para almacenar ese valor
 *
 * Sobreescribimos el método .toString para dar y mostrar todos los valores y hacemos lo mismo en las clases que heredan de esta super clase
 * */


