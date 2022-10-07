package tareaUno

fun main() {

    println("\n** INGRESA TU DIRECCIÓN **\n")          // Se muestra este mensaje al usuario antes de que ingrese sus datos

    print("Calle: ")                                 // Mandamos imprimir los ("datos de entrada: ")
    val calle = readLine()                           // Declaramos las variables (val) que almacenarán los datos que el usuario escriba

    print("Ciudad: ")
    val ciudad = readLine()                          // Con los readLine() solicitamos los datos al usuario

    print("Estado: ")
    val estado = readLine()

    print("País: ")
    val pais = readLine()

    print("Código postal: ")
    val codigoPostal = readLine()

    println("\nDIRECCIÓN COMPLETA: $calle, $ciudad, $estado, $pais, $codigoPostal")    // Concatenamos las variables

}
