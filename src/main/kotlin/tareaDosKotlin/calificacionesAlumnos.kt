package tareaDosKotlin

// *** Programa para calcular el promedio de calificaciones de un listado de alumnos y definir si son aprobatorias o no ***

// Lista de alumnos:
val alumnos = arrayListOf ("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")

// Calificaciones en orden:
val calificaciones = arrayListOf (31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

val calificacionAprobatoria = 60.0        // El mínimo para aprobar

fun main() {

    calcularPromedio()          // Llamamos a la fun para calcular promedio
    calificacionMasAlta()       // Llamamos a la fun para obtener la calific más alta
    calificacionMasBaja()       // Llamamos a la fun para obtener la calif más baja
    alumnosReprobados()         // Llamamos a la fun para obtener a los alumnos reprobados

}

fun calcularPromedio() {

    var promedio = 0.0          // Declaramos una var para calcular el promedio

    for(calificacion in calificaciones) promedio += calificacion        // Antes de obtener el promedio haremos una sumatoria

    promedio = promedio / calificaciones.size           // Una vez teniendo la sumatoria, vamos a dividir entre el total de calificaciones del arreglo
    println("\nPromedio de calificaciones: $promedio\n")
}

fun calificacionMasAlta() {

    var resultado = 0.0

    for(calificacion in calificaciones){

        if(calificacion > resultado) resultado = calificacion       // Esta condicion va a iterar por el arreglo de calificaciones. Mientras que la
                                                                    // calificación sea mayor que el "resultado" actual, seguirá iterando hasta llegar
                                                                    // a obtener la calificación más alta. Vamos a ir reasignando los valores
}

    println("Calificación más alta: $resultado")

}
                                                                    // En la primer vuleta "resultado" cambia su valor de 0.0 a 31.0, en la siguiente
                                                                    // cambia de 31.0 a 94.0 y sigue hasta que calific no sea mayor que resultado

fun calificacionMasBaja() {

   val resultado = calificaciones.sorted()[0]               // El método .sorted() ordena el array de calificaciones de menor a mayor. Al ordenarlo
                                                            // de esta forma, nos va a dar la calificación más baja porque le pedimos la posición [0]
    println("Calificación más baja: $resultado")

}

fun alumnosReprobados() {

    println("\nAlumnos reprobados: ")

    for (i in 0 until calificaciones.size){          // Se hará el ciclo "hasta que" recorra el arreglo con el total de calificaciones
                                                           // desde el index 0 hasta el 5, en este caso

        if(calificaciones[i] < calificacionAprobatoria){      // Si calificaciones en la posición [i] es menor que la calificacionAprobatoria,
            println("${alumnos[i]}, ${calificaciones[i]}")    // mostrar reprobados
        }

    }
}

