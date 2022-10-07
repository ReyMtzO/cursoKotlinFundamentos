import tareaTresKotlin.PEDIDO_MINIMO_DONAS

// val PEDIDO_MINIMO_DONAS = 20  ... declaramos esta variable global para que lo mínimo que pueda comprarse sean 20 donas

val cantidadIngrediente = arrayOf(    // Este es el listado con las cantidades necesarias para hacer cada dona
    20.0, // Harina
    1.0,  // Levadura
    7.4,  // Azúcar ...    Modificamos este valor para que esté igual a los datos que se requieren
    3.75,  // Leche
    1.5,  // Mantequilla
    0.15,  // Huevo
    0.5,  // Sal ...       Modificamos este valor para que esté igual a los datos que se requieren
    12.0  // Aceite
)

var nombrePrograma: String? = null          // Esta variable almacena el nombre del programa y lo muestra...

fun main() {

    println(nombrePrograma!!)            // Ejecutamos el programa y el primer error que nos arroja es en esta línea. Nos muestra que estamos ingresando
    nombrePrograma = "\n## Ingredientes y costo de pedidos de donas ##"   // a la variable "nombrePrograma" pero aún no se ha inicializado
                                                     // Pasamos el código de la línea 18 a la 19 y viceversa
    print("\ntotal de donas a elaborar: ")
    val total = readLine()!!.toInt()          // Cambiamos el método a .toIntOrNull, para el caso de que en la entrada se agregue: 10 donas, por ejemplo

/*
    // Con este bloque de código, solicitamos que el valor de entrada sea exclusivamente un número entero
    if (total == null) {
        println("Se debe ingresar un número entero. Intenta nuevamente")
        return main()     // Recursividad que ayuda a que el programa vuelva a iniciar
    }
*/

/*
    // Con este bloque de código validamos que los pedidos sean no menores de 20 donas como lo requiere el cliente:

    if (total < PEDIDO_MINIMO_DONAS){
        println("El pedido debe ser de mínimo $PEDIDO_MINIMO_DONAS  donas")
        return main()     // Recursividad que ayuda a que el programa vuelva a iniciar
    }
*/

    val costo = if (total < 100) {        // Aquí se calcula el precio total según la cantidad que se quiera comprar
        total * 6.0               // Precio por dona para compra de menos de 100 unidades
    } else {
        total * 5.55              // Precio con descuento por compra de más de 100 unidades
    }

    println(
        """
        ***********************************
        Ingredientes para $total donas

        Harina       | ${Math.round(cantidadIngrediente[1] * total)} gramos
        Levadura     | ${Math.round(cantidadIngrediente[2] * total)} gramos
        Azúcar       | ${Math.round(cantidadIngrediente[3] * total)} gramos
        Leche        | ${Math.round(cantidadIngrediente[4] * total)} mililitros
        Mantequilla  | ${Math.round(cantidadIngrediente[5] * total)} gramos
        Huevo        | ${Math.round(cantidadIngrediente[6] * total)} huevos
        Sal          | ${Math.round(cantidadIngrediente[7] * total)} gramos
        Aceite       | ${Math.round(cantidadIngrediente[8] * total)} mililitros    // Corremos el programa y nos muestra otro error en la línea 42
        ***********************************                   // Recordemos que los index siempre inician en la posición cero, así que los modificaremos
        total a cobrar: $${Math.round(costo)}
        ***********************************
    """          // Aquí agregamos un .trimIndent() para que los resultados salgan alineados a la izquierda en consola
    )            // // ${Math.round} para números redondeados y enteros

    main()

}