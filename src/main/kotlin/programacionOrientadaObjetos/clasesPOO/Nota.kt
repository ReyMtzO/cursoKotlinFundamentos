package programacionOrientadaObjetos.clasesPOO

import java.util.*
/*
// Clase para ejemplo de metodos.totalCaracteres, en donde declararemos un método
class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date) {          // Tenemos la keyword "var" para poder acceder a estas propiedades

    fun imprimirTotalCaracterContenido() {            // "Método" que se declara igual que una función
        println(contenido.length)     // Para saber la cantidad de letras en mi nota1, que son: ::328 letras::
    }
    /**
     * Se encarga de contar y regresar el total de palabras del contenido de la nota
     * @return Total de palabras
     * */
    fun contarPalabrasContenido(): Int {       // Para saber el total de palabras en mi nota1 y retornaremos un tipo de dato Int

        val palabras = contenido.split(" ")   // Este es el algoritmo o procedimiento para contar las palabras
        // "split" es un método de la clase String, y nos permite dividir el contenido de la nota1 por un delimitador
        // en este caso, le pasamos un espacio en blanco""
        // "palabras" en este momento va a ser un arrayList o lista
        return palabras.size      // Para retornar el total de palabras, que son: ::53 palabras::
    }

    /**
     * Se encarga de buscar una [palabra] y contar el número de veces que aparece el contenido
     * @return Total de palabras
     * */
    fun contarPalabrasContenido(palabra: String): Int {            // Creamos este nuevo método para ahora contar una palabra en específico...

        val palabras = contenido.split(" ")

        var contador = 0

        palabras.forEach{               // Para poder hacer una iteración sobre las palabras
            if (it.uppercase() == palabra.uppercase()) contador++
        }
        return contador                              // Agregar return es necesario
    }                                                   // Al tener la misma firma que el método de arriba, me marca un error, pero le agregaremos...
}                                             // un parámetro dentro del paréntesis que será de tipo String, y ahora ya nos deja compilar sin problemas

// Ponemos la keyword "fun", seguido del nombre del método: imprimirTotalCaracterContenido, agregamos "()" y "{}"
// y tod0 esto lo ponemos dentro de la clase para llamarla dentro de mi objeto, en este caso, nota1 ya sería una instancia de la clase Nota


/*
class Nota {
    var nombre: String = ""
    var contenido: String = ""
    var fechaCreacion: Date = Date()
}
*/

/*
// Clase con el constructor primario:
class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date){
// Este constructor principal también puede tener un bloque de inicialización, poniendo la keyword: init {}
    init {
       // nombre = nombre.uppercase()    ... Comentamos este bloque para que esta acción se ejecute solamente en el constuctor secundario
    }
// Este bloque de init se va a ejecutar siempre que creemos una instancia de la clase Nota


// Constructor secundario con bloque de inicialización:
    constructor(nombre: String, contenido: String) : this(nombre, contenido, Date()) {
        println("Se instanció la clase con el constructor secundario")                    // Bloque de inicialización
        this.nombre = nombre.uppercase()    // Agregamos this. Porque nombre no se puede reasignar, y de esta forma hace referencia a
                                            // la variable de la clase del constructor primario
}
}
*/

// El constructor secundario nos permite realizar acciones cuando se crea la instancia de la clase
// El bloque de inicialización es algo que se va a ejecutar cuando creamos una instancia, en este caso es el println entre {} del constructor secundario

 */