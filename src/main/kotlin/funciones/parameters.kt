package funciones

fun main() {

    mostrarDatos("Rey", 28)        // 3.- Llamamos a la funcion y ahora los argumentos que le escriba los va a procesar
    mostrarDatos("Jessica", 23)      // 4.- Esto sin necesidad de estar escribiendo la funcion en repetidas ocasiones
}

fun mostrarDatos(nombre: String, edad: Int){    // 1.- Creamos una funcion para mostrar datos de una persona (nombre, edad)
                                                // 2.- Solicito como parámetros su nombre (tipo de dato String) y su edad (t.d.d. Int)
    println("""
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}