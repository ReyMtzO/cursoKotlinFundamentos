package programacionOrientadaObjetos.modificadoresDeAcceso

// Para poder mostrar el modificador de acceso "protected" es necesario crear herencia

fun main() {

    Avion()

}
// Para poder crear herencia tenemos que poner la keyword "open"
open class Aeronave(private var numeroPasajero: Int) {             // No la agregamos a otro archivo porque es solo para ejemplificar

// Cuando usamos la keyword "private" (modificador de acceso) solo será accesible dentro del bloque de código que lo delimite
// Cuando usamos la keyword "protected" (otro modificador de acceso), podremos accederlo en la clase "principal" y en las clases "heredadas"
// Esto quiere decir que protected es de la clase, pero también es accesible desde sus sub clases, distinto a "private" que solo está accesible en ...
// la clase principal, también diferente de "public", ya que esta es accesible desde cualquie lugar del código
    init {
        println(numeroPasajero)
    }

}

class Avion : Aeronave(50) {                 // Esta clase Avion va a heredar de Aeronave

    init {
        //println(numeroPasajero)               // Arriba tenemos que poner var para poder accederlo aquí
    }

}

// Nuestros modificadores de acceso nos permiten controlar el nivel de accesibilidad o alcance del que podremos acceder a los datos
// Y estos modificadores también se pueden agregar a variables y funciones, y cuando no los podamos aplicar, el IDE nos avisará