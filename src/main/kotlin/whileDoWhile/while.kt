package whileDoWhile

// Ciclo while: (mientras)... nos permite ejecutar un bloque de código mientras se cumpla una condición
// Si la condición sigue vigente, el ciclo while se seguirá ejecutando en el código con instrucciones de manera repetitiva
// Si la condición ya se cumplió, el ciclo while deja de ejecutarse y el programa pasa al siguiente bloque de código

/*Tendremos la palabra reservada "while", después le pasamos como "argumento" la "condición" dentro de paréntesis...
  puede ser una o varias condiciones si las unimos con un operador lógico: (&&, ||). Como es de esperarse, tendremos delimitado
  nuestro bloque de código con llaves {}
 */

// En este ejemplo vamos a pedirle al usuario una cantidad indefinida de nombres de empleados y los iremos almacenando en una lista.
// Cuando el usuario deje de agregar nombres de empleados y presione "enter", se mostrará toda la lista.

fun main() {

    println("Ingresa los nombres uno por uno. Para finalizar e imprimir presiona ENTER\n")        // Instrucciones al usuario

    val listaEmpleados = arrayListOf<String>()      // Declaramos la variable listaEmpleados que va a ser igual a un arrayListOf de tipo string

    print("Nombre: ")                               // Pedimos al usuario el Nombre:
    var nombre = readLine().toString()              // Asignamos el "nombre" a una variable (var) que es igual a readLine().toString() y se va a almacenar

    while (nombre != "") {                          // El ciclo while dice: mientras nombre sea "diferente de" algo vacío, se ejecuta el bloque de código
        listaEmpleados.add(nombre)                  // A lista de empleados le agregamos el "nombre" para agregar todos los nombres en la lista
        print("Nombre: ")
        nombre = readLine().toString()              // Se repite la parte donde pedimos que agregue el nombre al usuario
    }

    println("\n----Resultado----\n")                // El programa le muestra al usuario el resultado, en este caso la lista

    for(empleado in listaEmpleados) println(empleado)    // Con el ciclo for vamos a imprimir toda la lista

}
