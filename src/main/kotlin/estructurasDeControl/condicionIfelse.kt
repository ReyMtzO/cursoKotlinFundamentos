package estructurasDeControl

/* Las estructuras de control nos permiten decidir qué partes
de nuestro código se van a ejecutar y qué partes NO se van a
ejecutar */

/* Un "if" se utiliza para evaluar expresiones condicionales...
si se cumple la condición, ejecutará un bloque de código.
si NO se cumple, no se ejecuta nada o se ejecuta otra sentencia mediante un "else"
*/

var sesionIniciada = true           // Variable global

fun main() {

   // if(sesionIniciada == true){           // La condición se cumple, por lo tanto se imprime la frase "Bienvenido"
   //     println("\nBienvenido!\n")        // Si fuera == false, en este caso el programa se salta esta parte sin imprimir nada

   // if(sesionIniciada != true){          // Aquí utilizamos el "Diferente de (!=)" true, por tanto, tampoco imprime nada
   //    println("\nBienvenido!\n")

   if(sesionIniciada != true){              // En este caso no se cumple la condición, pero utilizamos un "else" para insertar otra
        println("\nBienvenido!\n")
    } else{
        println("\nPor favor, inicia sesión para ingresar\n")    // El programa lee que no se cumple el if y se pasa al else
    }
}

