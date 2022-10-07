package tareaDosKotlin

// *** Programa que lee una cantidad indefinida de números (uno por uno) hasta que el usuario ingrese un 0, en ese momento imprime
// la sumatoria de los números y el promedio ***

fun main() {

    println("Ingresa números uno por uno. Para ver el resultado ingresa 0\n")

    var numerosIngresados = 0             // Para contar los números que el ususario va ingresando
    var sumatoria = 0.0                   // De tipo Double, para ir sumando los datos que se agreguen
    var datosEntrada: Double              // De tipo Double, se almacenan aquí los valores que el usuario va ingresando

         // * Utilizamos el ciclo "do while" para realizar las operaciones *
    do {
        datosEntrada = readLine()!!.toDouble()                 // Va leyendo cada valor que se asigna
        if (datosEntrada != 0.0) numerosIngresados++           // Incrementa el valor de numerosIngresados mientras la entrada sea diferente de 0
        sumatoria += datosEntrada                              // Suma el valor actual más el número de entrada
    } while (datosEntrada != 0.0)                              // Repetimos tod0 el ciclo hasta que el usuario ingrese un 0 para mostrar el resultado

    // Results
    println("Suma: $sumatoria")                                 // La suma ya está asignada a una variable
    println("Promedio: ${sumatoria / numerosIngresados}\n")     // "StringTemplate {}" Hace la operación de dividir el valor almacenado en
                                                                // la var sumatoria / el valor almacenado en la var numerosIngresados
    //main()    // Recursividad

}
