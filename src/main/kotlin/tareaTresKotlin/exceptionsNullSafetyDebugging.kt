package tareaTresKotlin

val PEDIDO_MINIMO_DONAS = 20

val cantidadIngrediente = arrayOf(
    20.0, // Harina
    1.0,  // Levadura
    7.5,  // Azúcar
    3.75,  // Leche
    1.5,  // Mantequilla
    0.15,  // Huevo
    0.05,  // Sal
    12.0  // Aceite
)

var nombrePrograma: String? = null

fun main() {

    nombrePrograma = "\n## Ingredientes y costo de pedidos de donas ##"
    println(nombrePrograma!!)

    print("\nTotal de donas a elaborar: ")
    val total = readLine()!!.toIntOrNull()

    if (total == null) {
        println("Se debe ingresar un número entero. Intenta nuevamente")
        return main()
    }

    if (total < PEDIDO_MINIMO_DONAS){
        println("El pedido debe ser de mínimo $PEDIDO_MINIMO_DONAS donas")
        return main()
    }

    val costo = if (total < 100) {
        total * 6.0
    } else {
        total * 5.55
    }

    println(
        """
        ***********************************
        Ingredientes para $total donas

        Harina       | ${Math.round(cantidadIngrediente[0] * total)} gramos
        Levadura     | ${Math.round(cantidadIngrediente[1] * total)} gramos
        Azúcar       | ${Math.round(cantidadIngrediente[2] * total)} gramos
        Leche        | ${Math.round(cantidadIngrediente[3] * total)} mililitros          
        Mantequilla  | ${Math.round(cantidadIngrediente[4] * total)} gramos
        Huevo        | ${Math.round(cantidadIngrediente[5] * total)} huevos
        Sal          | ${Math.round(cantidadIngrediente[6] * total)} gramos
        Aceite       | ${Math.round(cantidadIngrediente[7] * total)} mililitros
        ***********************************
        Total a cobrar: $${Math.round(costo)}
        ***********************************
    """.trimIndent()
    )

    main()

}