package tareaDosKotlin

fun main() {

    println("Lista de alumnos:")
    val alumnos = arrayListOf("Jose", "Alberto", "Laura", "Noel", "Erika", "Daniel")

    for (i in 0 until alumnos.size) {
        println(alumnos[i])
    }
    println("\nCalificaciones:")
    val calificaciones = arrayListOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    for (i in 0 until calificaciones.size) {
        println(calificaciones[i])
    }

    var sumatoria = 0

    println(sumatoria)
    
}