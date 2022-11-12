package programacionOrientadaObjetos.herencia

import programacionOrientadaObjetos.herencia.clasesParaHerencia.Administrador
import programacionOrientadaObjetos.herencia.clasesParaHerencia.Empleado
import programacionOrientadaObjetos.herencia.clasesParaHerencia.Persona

/**
 * La HERENCIA es la capacidad de crear nuevas clases a partir de otra clase, heredando sus propiedades, atributos y métodos. Esto nos permite
 * la reutilización de código, por tanto, escribir código no será repetitivo y nos ayudará a mantenerlo y modificarlo en un futuro si es necesario.
 *
 * Para comprender mejor este concepto, vamos a realizar un ejercicio como ejemplo:
 * Suponiendo que tuviéramos un punto de venta, vamos a almacenar al personal como distintos tipos de empleados, ya que estos tendrán atributos
 * en común, (nombre, apellido, dirección, fecha de nacimiento) entre otras cosas.
 * Entonces vamos a crear una clase llamada "Persona", y haremos HERENCIA para crear las dif. subclases, como empleados, clientes, entre otras.
 * */

fun main() {

    val persona = Persona("Jesús", "Moreno", "Conocida", null, "25/01/1990")

    println(persona.toString())        // Aquí llamo al método .toString para que me dé toda la información del "override fun" almacenada en la Clase "Persona"
    // println(persona.obtenerEdad())

    val empleado = Empleado("Alberto", "Martínez", "Conocida", "2284030042", "20/02/1985",5000.0)

    println(empleado)    // Imprime los datos de la clase Empleado, heredando las propiedades de la clase Persona + la var salario que llamamos en el override

    val administrador = Administrador("Luis", "Morales", "Conocida", "2224063422", "20/02/1980",10000.0, 10.0)

    println(administrador)
}
