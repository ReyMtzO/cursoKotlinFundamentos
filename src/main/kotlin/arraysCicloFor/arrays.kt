package arraysCicloFor

// Un array dentro de programación nos permite almacenar un "conjunto" de valores

// Para acceder a los arreglos, lo haremos mediante un índice (index)

// Estos índices comenzarán siempre en cero (0)... 0, 1, 2, 3, 4, 5, etc...

/* La manera en la que se "declara un arreglo" dentro de Kotlin es la siguiente: tendremos una "variable" de tipo var o val
y seguido de esto tendremos su "indentificador", por ejemplo: empleados, y seguido de esto pondremos "arrayOf()".
Dentro del paréntesis pondremos los elementos que contendrá nuestro arreglo, en este ejemplo asignamos 3 elementos
de tipo "String" y completa la línea de código queda así: val empleados = arrayOf("Jesús", "Alberto", "Claudia")
 */

// El tamaño de este ejemplo de arreglo sería de: Tamaño = 3

// Jesus estaría almacenado en la variable: empleados[0], Alberto en: empleados[1] y Claudia en: empleados[2]
/*
fun main() {

    val empleados = arrayOf("Jesus", "Alberto", "Claudia", 45, 38)   // Con arrayOf podemos obtener cualquier tipo de dato, pero
                                                                     // si queremos un arreglo con tipos de datos muy específicos
    println(empleados[3])                                            // podemos poner por ejemplo: intArrayOf para numeros enteros.
}
*/


// .size nos va a regresar el num total de elementos que tiene nuestro arreglo

// También podemos re asignar valores ...


fun main() {

    val valores = intArrayOf(1, 50, 45, 6, 9)

    println(valores[0])   // Se imprime 1, que está en el index 0

    valores[0] = 500     // Re asignamos el elemento de 1 a 500, por tanto también imprime 500

    println(valores[0])
}

// Si la variable en la que tenemos el arreglo es de tipo "val" no podemos re asignar, solo modificar los elementos que se encuentran dentro 1 * 1
// Con la variable de tipo var, sí podemos re asignar el tamaño del arreglo
