package arraysCicloFor

// El tamaño de un "arrayList" es variable y dinámico, ya que podemos ir agregando o quitando elementos según se requiera
// Puede comenzar con un tamaño fijo, o incluso con cero elementos, entonces la propiedad .size se irá adecuado al código
/*
fun main() {

    val empleados = arrayListOf("Jesus", "Alberto", "Claudia")

    println(empleados.size)             // Imprime el tamaño del arreglo con 3 elementos

    empleados.add("Alejandro")          // empleados.add agrega un nuevo elemento al arreglo

    println(empleados.size)             // Imprime el nuevo tamaño agregando un elemento más al arreglo

}


// También podemos ordenar nuestro arreglo:

fun main() {

    val empleados = arrayListOf("Jesus", "Alberto", "Claudia")

    for (empleado in empleados) println(empleado)   // Usamos un ciclo for que al ser una instrucción se puede poner sin llaves
    println("-------------------")                  // Agregamos una pequeña separación

    empleados.add("Alejandro")                      // Igual que en el otro ejemplo, empleados.add agrega un nuevo elemento

    for (empleado in empleados) println(empleado)
    println("-------------------")                  // Ahora imprimirá el nuevo elemento y se verá una separación entre los nombres
                                                    // Imprime Jesus, Alberto, Claudia y Alejandro (en ese orden)
}


fun main() {

    val empleados = arrayListOf("Jesus", "Alberto", "Claudia")

    empleados.add("Alejandro")

    empleados.sort()       // Este método .sort() del arrayList nos ayuda a imprimir los elementos en "orden alfabético"

    for (empleado in empleados) println(empleado)
    println("-------------------")

}


fun main() {

    val empleados = arrayListOf("Jesus", "Alberto", "Claudia")

    empleados.add("Alejandro")

    empleados.sort()

    for (empleado in empleados) println(empleado)
    println("-------------------")

    empleados.removeAt(3)     // Este método .removeAt() del arrayList nos ayuda a "remover" por su index elementos de la lista

    for (empleado in empleados) println(empleado)
    println("-------------------")
}*/


fun main() {

    val empleados = arrayListOf("Jesus", "Alberto", "Claudia")

    empleados.add("Alejandro")

    empleados.sort()

    for (empleado in empleados) println(empleado)
    println("-------------------")

    empleados[3] = "Maria"     // Re asignamos valores: el índice 3 era Jesus, ahora lo reemplazamos con Maria

    for (empleado in empleados) println(empleado)
    println("-------------------")
}







