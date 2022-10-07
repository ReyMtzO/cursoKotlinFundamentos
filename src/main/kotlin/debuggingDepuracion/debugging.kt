package debuggingDepuracion

// La depuración o debugging nos permite detectar y corregir errores en los programas, por ejemplo detectar excepciones y errores lógicos
/*
fun main() {

    val entrada = readLine()
    val resultado = entrada!!.toDouble() * entrada.toDouble()
    print(resultado)

}

// Los "Puntos de interrupción" son marcadores temporales que se colocan en los programas para indicar al depurador que detenga el programa en ese punto
// Estos puntos se colocan dando clic en la barra de Gutter (de la izquierda) en la línea de código que queramos analizar
// Para depurar el código no daremos clic sobre el "run" o play, sino que va a ser en el "bichito" en verde de al lado
// Al ejecutar nuestro programa en modo de depuración, se conecta con la Java Virtual Machine para detectar lo que va sucediendo en el programa para control

*/

/*
// Ahora agregaremos un ejemplo que nos dará como resultado una excepción para ver cómo se comporta el debugger:

fun main() {

    val nombres = arrayOf("José", "Eduardo", "María")

    for(i in 0..10){
        println(nombres[i])
    }
}
// En este caso, la excepción se dará debido a que la variable nombres solo llega hasta el index 2... ([0], [1] y [2]):
// Ponemos un punto de interrupción en la línea de código 28, debuggueamos el programa, expandimos "nombres" y se mostrarán los index y qué valor tienen
// i en un principio vale: 0. Damos play y ahora i valdrá 1, y así sucesivamente mientras me va mostrando los valores en consola
// Al dar play cuando i ya vale 3, nos va a parpadear la pestaña de consola, en al cual se va a mostrar la excepción y de esta manera identificamos el error
// El error fue que intentamos acceder a una posición del array que no existía



// Ejercicio de factoriales (para identificar errores lógicos en nuestro programa):

// Este ejercicio intenta calcular el factorial de un número... pero contiene errores de lógica al momento de hacer la operación
fun main() {

    var numero = readLine()!!.toIntOrNull()     // Con esta variable, si la entrada es un número, lo convertirá a entero
    numero?.let{                           // Si el número de entrada No es null, se realiza la operación dentro del bloque de código del lambda
        var resultado = 0                   // Esta variable asigna el resultado
        for (i in 0..numero) {          // En esta línea se realiza una iteración por el ciclo for, desde 0 hasta el valor de número
            resultado *= numero             // Aquí va multiplicando el número
            numero--                         // En esta línea va reduciendo el valor de número
        }
        println(resultado)                 // Al final nos muestra el resultado
        main()                                  // y regresa a la fun main() para pedir otro número
    }
    main()

}
*/







// *** Ejercicio de factoriales (Corregido y funcionando) ***

fun main() {

    var numero = readLine()!!.toLongOrNull()
    numero?.let {
        if (numero < 0) {
            println("Solo se aceptan números positivos")
            main()
        }
        var resultado = 1L
        for (i in 1..numero) {
            resultado *= numero
            numero--
            if(resultado < 0) {
                println("El resultado es demasiado grande, no se puede calcular")
                return@let
            }
        }
        println(resultado)
        main()
    }
    main()

}

// ** Lista de modificaciones en comparación con el código inicial: **

// Cada una de las modificaciones que haremos se realizarán analizándolas en el Debugger:
// Cambiamos el valor de la var resultado = 1, porque si lo dejamos en 0 como estaba, siempre iba a multiplicar 0 * numero y tod0 nos daría = 0
// Después modificamos el rango del ciclo for de 0 a 1... por tanto nos queda: for (i in 1..numero), y con esto el programa funciona hasta el factorial 10
// Cuando numero = 6 e i vale 10, resultado arroja un número negativo (-1987615488) y esto se da porque lo estamos convirtiendo a un t d d .toIntOrNull()
// La multiplicación salió de los límites de Int... Para saber su valor escribimos Int debajo de fun main() y damos ctrl + clic para ir a la class Int
// Así podemos ver el MAX_VALUE de Int y notamos que está sucediendo un desborde aritmético y por tanto está fuera de su rango
// Para corregir esto, cambiamos el método de la var a .toLongOrNull() y de la misma forma el valor de var resultado = 1L para evitar que nos de una excepción
// De esta manera ya nos da el factorial correcto de 15, pero al llegar a 25, por ejemplo, el resultado es tan grande que incluso Long no puede abarcarlo
// Por tanto optamos por agregar un if(resultado < 0) y mostramos un mensaje al usuario diciendo que el resultado es demasiado grande
// Seguido de esto ponemos un return@let, para finalizar en el .let y finaliza ejecutando tod0 el programa
// Y ya por último, validamos que tampoco se hagan operaciones con num negativos con un if(numero < 0) para imprimir un mensaje: Solo acepta números positivos


