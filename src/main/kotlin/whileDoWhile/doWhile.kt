package whileDoWhile
// El ciclo "do while" nos garantiza que el código que tenemos dentro del bloque, se va a ejecutar al menos una vez
// Tendremos la palabra reservada "do", el bloque de código, la pal res "while" y dentro de paréntesis le pasamos nuestra condición
// Con esto le decimos al programa: ejecuta estas líneas de código, luego evalúa la condición. Si se cumple, vuelve al "do" y ejecuta de nuevo el código
// Si la condición ya no se cumple, el programa salta al siguiente bloque de código

// Haremos el mismo ejemplo que con el ciclo while, pero con algunas variaciones:

fun main() {

    println("Ingresa los nombres uno por uno. Para finalizar e imprimir presiona ENTER\n")        // Instrucciones al usuario

    val listaEmpleados = arrayListOf<String>()      // Declaramos la variable listaEmpleados que va a ser igual a un arrayListOf de tipo string

    do {                                        // Con el "do" garantizamos que el bloque se va a ejecutar al menos una vez

        print("Nombre: ")                       // Por tanto no es necesario volver a poner estas líneas de código duplicadas como en el ejemplo anterior
        val nombre = readLine().toString()
        if(nombre != "") listaEmpleados.add(nombre)

    } while (nombre != "")

    println("\n----Resultado----\n")
    println("Total: ${listaEmpleados.size}")      // El programa imprime el número total de elementos al finalizar la operación
    for(empleado in listaEmpleados) println(empleado)

}