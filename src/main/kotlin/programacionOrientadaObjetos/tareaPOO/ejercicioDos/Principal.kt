package programacionOrientadaObjetos.tareaPOO.ejercicioDos

import programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases.Electrodomestico
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases.Lavadora
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases.Microondas
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.clases.Refrigerador
import programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums.ColorElectrodomestico
import java.math.BigDecimal

fun main() {

    println("\n## Fabricación de Electrodomésticos ##\n")

    val lavadora1 = Lavadora("SD5S84DRTR", ColorElectrodomestico.BLANCO, 25.00, BigDecimal("9500.99"), 18.00)
    val microondas1 = Microondas("AOS87DPSOR", ColorElectrodomestico.NEGRO, 8.50, BigDecimal("2100.00"), 1350.00)
    val refrigerador1 = Refrigerador("SPDO8756SR", ColorElectrodomestico.GRIS, 47.0, BigDecimal("7899.00"), 10.00, 00.00, -15.00)

    val listaElectrodomesticos = arrayOf(lavadora1, microondas1, refrigerador1)

    listaElectrodomesticos.forEach {
        println(it.toString())
    }

    println("\nTotal de productos fabricados: ${Electrodomestico.contadorFabricados}")
}

/**
 * Al principio imprimimos el mensaje de electrodomésticos fabricados y creamos las instancias de cada objeto de clase

 *  En la función principal creamos un -objeto- de cada clase (lavadora1, microondas1 y refrigerador1), después los agregamos a un -arreglo-(listaElectrodomesticos=arrayOf()),
 * después iteramos el arreglo con el -.forEach- e imprimimos los datos de los objetos (println(it.toString()) como en el ejemplo a seguir
 *
 * Se nos recomienda sobreescribir el método .toString en cada clase
 *
 * Por último se nos pide imprimir el -total de productos fabricados-
 * En esta parte importamos la clase -Electrodomestico- que aunque no podemos crear instancias al ser abstracta, sí tiene propiedades
 * y es gracias a esto que podemos agregar el contador
 *
 * */