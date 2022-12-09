package programacionOrientadaObjetos.dataClass

import funciones.nombre

/**
 * Las data class nos permiten almacenar solo el estado, es decir, un conjunto de atributos y valores de los objetos
 * Por lo general no realizan ninguna operación, sin embargo, nos proporcionan algunos métodos útiles que no tenemos que estar reescribiendo
 *
 * Las data class sirven para almacenar los casos en donde solo necesitamos almacenar información de algo
 *
 * Ej: Tenemos una clase denominada Persona, y solo queremos guardar sus datos como nombre, apellidos, teléfono, dirección... y no realizaremos operaciones,
 * entonces podemos usar una data class, ya que es mucho más práctico usarlas en lugar de un array, por ejemplo
 *
 * En resumen: Una data class no es más que una clase que solo contiene estado y no realiza ninguna operación.
 * La ventaja de utilizar data classes en vez de clases normales es que Kotlin nos aporta una cantidad inmensa de código autogenerado
 * */


fun main() {

    val personaA = PersonaA("José", "2287365524")
    val personaB = PersonaB("Alberto", "2261207754")

    val personaC = personaB.copy(nombre = "Nepomusénico")    // Aquí realizamos una copia y cambiamos algunas propiedades... (el nombre)

    println(personaC)

    // val personaC = PersonaA(personaA.nombre, "2264372619") ... Esta es la forma de hacer una copia de manera manual, pero se complica si hay muchas propiedades

    // println(personaA.toString())
    // println(personaB.toString())

    // var nombre = personaB.nombre
    // var telefono = personaB.telefono    // Una forma de desestructurar...

    val (nombre, telefono) = personaB       // Otra forma de desestructurar más sencilla...
    println("$nombre, $telefono")

    println(personaC.obtenerLargoNombre())
}


// Aquí arriba ya tenemos una instancia u objeto de cada una de nuestras clases
// Con un println(persona.toString()) vamos a comparar los resultados que nos arroje cada una de nuestras clases

// La data class nos proporciona el método .copy, el cual nos ayuda a hacer una "copia" de una manera muy sencilla, y este nos genera una copia en un nuevo objeto
// y le va a agregar todos los atributos que tiene

// Otra característica que tienen las data class es que nos permiten "desestructurar" un objeto y con esto podríamos almacenar los datos de un objeto en variables independientes
// Esto lo que hace es pasar los valores del objeto a estas variables independientes


/**
 * En la class "normal" PersonaA, solo nos da un identificador de la persona cuando lo convertimos a toString: programacionOrientadaObjetos.dataClass.PersonaA@34c45dca

 * En la data class PersonaB, ya no tenemos que sobreescribir el método toString, ya que automáticamente nos da los valores
 * separados por coma: PersonaB(nombre=Alberto, telefono=2261207754)
 * En la data class el método toString ya está definido y al acceder a él, nos brinda información más precisa de los valores que contiene
 * porque su objetivo es simplemente almacenar valores y su contenido
 * */

class PersonaA(var nombre: String, var telefono: String)   //Agregamos var para poder usar después estas propiedades

// Cuando estas clases no tienen contenido o cuerpo, no es necesario agregar {}

data class PersonaB(var nombre: String, var telefono: String) {   //En las data class es obligatorio poner var o val


    fun obtenerLargoNombre(): Int {
        return nombre.length
    }

}

/**
 * El objetivo principal de la data class es almacenar el estado de los objetos (valores y propiedades),
 * sin embargo, nosotros también podemos implementar "métodos", por ejemplo al crear la fun obtenerLargoNombre(): Int
 * */