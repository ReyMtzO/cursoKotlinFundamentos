package programacionOrientadaObjetos.companionObject

import java.util.Date

class Nota2(var nombre: String, var contenido: String, var fechaCreacion: Date) {   // nombre, contenido y fechaCreación son "Propiedades de la instancia"

    init {
        numeroInstancias++        // Cada vez que se cree una instancia de esta clase, se va a incrementar su propiedad de clase: "var numeroInstancias = 0"

        if (nombre.length > LONGITUD_MAXIMA_NOMBRE) throw Exception("El nombre no puede tener más de 10 caracteres")  // (Para ejercicio en file constantes.kt)
    }

    companion object {          // Utilizamos estas 2 keywords y {} para delimitar el bloque de código

        const val LONGITUD_MAXIMA_NOMBRE = 10     // (Para ejercicio en file constantes.kt)


        var numeroInstancias = 0        // Declaramos una "propiedad de clase" que va a inicializar en 0. Esto nos permite ir contando cuántas veces se ha
                                        // instanciado la clase Nota2, es decir, cuántas notas tengo en mi aplicación sin hacerlo de forma manual.


        // Creamos un método de la clase dentro del "companion object" para mostrar el número de instancias:

        fun mostrarNumeroInstancias() {
            println(numeroInstancias)
        }
    }

}