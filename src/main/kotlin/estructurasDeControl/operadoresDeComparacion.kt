package estructurasDeControl

fun main() {

    print("\nINGRESA TU EDAD:\n")                           // Mensaje para entrada de datos
    val edad = readLine()!!.toInt()                         // .toInt() para convertir a enteros

    if (edad < 18){
        println("El usuario es menor de edad")
    } else if (edad < 60) {
        println("El usuario es mayor de edad")
    } else {
        println("El usuario es de la tercera edad")
    }

   //main()                  // Utilizamos el main() para que el programa se repita indefinidamente en consola (recursividad)

}

/*
fun main() {
    val valor =16

    if(valor >= 10) {                       // Utilizamos un operador de comparación >= (mayor o igual que)
        println("Entra la condición")       // Se cumple el if mientras la variable contenga un numero 10 o mayor a 10
    }
}
*/