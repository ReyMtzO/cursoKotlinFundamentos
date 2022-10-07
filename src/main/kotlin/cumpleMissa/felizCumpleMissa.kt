package cumpleMissa

fun main () {

    println("Ingresa el nombre del festejado: ")
    val nombre = readLine()
    println("Ingresa su edad: ")
    val edad = readLine()

    println("""
        *** Mensaje de felicitación ***
        Nombre: $nombre
        Edad:   $edad años
    """.trimIndent())

        println("\nFeliz cumple, Missa!! Te queremos!!")
}
