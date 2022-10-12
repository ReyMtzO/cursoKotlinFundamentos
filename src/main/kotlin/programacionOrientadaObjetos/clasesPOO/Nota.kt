package programacionOrientadaObjetos.clasesPOO

import java.util.*
/*
class Nota {
    var nombre: String = ""
    var contenido: String = ""
    var fechaCreacion: Date = Date()
}
*/

// Clase con el constructor primario:
class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date){
// Este constructor principal también puede tener un bloque de inicialización, poniendo la keyword: init {}
    init {
       // nombre = nombre.uppercase()     ... Comentamos este bloque para que esta acción se ejecute solamente en el constuctor secundario
    }
// Este bloque de init se va a ejecutar siempre que creemos una instancia de la clase Nota


// Constructor secundario con bloque de inicialización:
    constructor(nombre: String, contenido: String) : this(nombre, contenido, Date()) {
        println("Se instanció la clase con el constructor secundario")                    // Bloque de inicialización
        this.nombre = nombre.uppercase()    // Agregamos this. porque nombre no se puede reasignar, y de esta forma hace referencia a
                                            // la variable de la clase del constructor primario
}
}


// El constructor secundario nos permite realizar acciones cuando se crea la instancia de la clase
// El bloque de inicialización es algo que se va a ejecutar cuando creamos una instancia, en este caso es el println entre {} del constructor secundario