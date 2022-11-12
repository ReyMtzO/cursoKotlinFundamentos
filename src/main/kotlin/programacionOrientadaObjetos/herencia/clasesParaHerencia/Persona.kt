package programacionOrientadaObjetos.herencia.clasesParaHerencia

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona(                     // Para permitir la herencia, ponemos la keyword "open" a la clase PADRE.
    var nombreEmpleado: String,
    var apellidos: String,
    var direccion: String,
    var telefono: String?,
    var fechaNacimientoTexto: String
) {

    var fechaNacimientoDate: LocalDate = LocalDate.parse(fechaNacimientoTexto, DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun obtenerEdad(): Int{
        return Period.between(fechaNacimientoDate, LocalDate.now()).years
    }

    override fun toString(): String {
        return "Nombre: $nombreEmpleado $apellidos, Dirección: $direccion, Teléfono: ${telefono ?: "N/D"}, Fecha de nacimiento: $fechaNacimientoTexto, Edad:${obtenerEdad()}"

    // return super.toString()             // La keyword "super" se utiliza para llamar a la clase PADRE (super clase)... public open class Any
                                           // Esto va a sobrescribir el valor que nos dé
    }

    companion object{
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }
}

/**
 * En este caso ya tenemos nuestra clase y estamos calculando la fecha de nacimiento de la persona en un "objeto" con el que ya podemos
 * hacer operaciones (companion object {} ).
 *
 * Creamos también una "fun" para que nos regrese la edad de la persona:
 * */

/**
 * La var fechaNacimientoDate: será de tipo "LocalDate"
 * Con LocalDate.parse(fechaNacimientoTexto)... le estamos diciendo al programa que convierta el "Texto" que le dimos a una fecha.
 * Y en DateTimeFormatter.ofPattern()... le estamos dando el formato en el que viene nuestra fecha: (pattern: "dd/MM/yyyy")... (día, mes y año).
 * */


/**
 * En el caso de "telefono" lo pondremos como tipo de dato String, pero que pueda ser Null, porque es probable que alguna persona no tenga
 * número telefónico, entonces lo dejamos como opcional y en caso de no tener, se queda como Null... (String?)
 *
 * En el caso de "fechaNacimiento"... es importante que al trabajar con edades, la recomendación dentro de una base de datos es poner la fecha
 * de nacimiento, porque de esta manera podemos calcular la edad en cualquier momento con la fecha actual.
 *
 * Para "fechaNacimiento" vamos a agregarle "Texto" (fechaNacimientoTexto), porque también la vamos a almacenar en un tipo Date(), para poder
 * hacer posteriormente los cálculos.
 * */