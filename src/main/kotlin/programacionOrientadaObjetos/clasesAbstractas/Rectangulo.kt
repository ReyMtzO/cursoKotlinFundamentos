package programacionOrientadaObjetos.clasesAbstractas

import kotlin.math.roundToInt
/**
 * Esta clase Rectangulo está basada en la clase abstracta Poligono, y esta clase Poligono nos obliga a utilizar sus métodos (obtenerArea y obtenerPerimetro).
 *
 * Para implementar la funcionalidad de esta clase, vamos a declarar las variables base y altura, en el "constructor" de Rectangulo, y serán de tipo de dato Double en este caso.
 * Al agregar el return base * altura y return (2 * base)+(2 * altura), dejamos implementados nuestros métodos.
 * */

class Rectangulo(var base: Double, var altura: Double) : Poligono() {           //Esta clase llamada Rectangulo va a "heredar" de la clase abstracta Poligono
                                                                                //Agregamos los paréntesis () para crear su instancia
    override fun obtenerArea(): Double {
        return base * altura
    }

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    fun obtenerAreaPulgadas(): Double {
        return centimetrosAPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulgadas(): Double {
        val perimetro = obtenerPerimetro()
        val perimetroPulgadas = centimetrosAPulgadas(perimetro)
        return perimetroPulgadas
    }

    override fun dibujar() {
        for(i in 1..altura.roundToInt()){
            println(" * ".repeat(base.toInt()))
        }
    }
}

// Nuestro método abstracto "fun dibujar" ya está implementado en esta clase, y para simular la creación del rectángulo como en una interfaz gráfica
// utilizaremos un ciclo for con un rango desde 1 hasta la "altura", y agragamos el método .roundToInt porque no podríamos hacer un rango con un
// tipo de dato Double... y después lo que hacemos es iterar todos los valores que tiene la altura y cada vez que llegue a la altura, vamos a imprimir un
// * con espacios y agregamos el método (" * ".repeat()) y esto lo vamos a repetir cuántas veces? ... El valor de la base.toInt()

// Para comprobar que funcione vamos a mandar a llamar a la función "dibujar" con rectangulo.dibujar() en nuestro file: ejercicioClasesAbstractas.kt

/**
 * Tenemos que la clase Poligono debe implementar a fuerzas el método dibujar, por lo tanto, cualquier otra clase que HEREDE de
 * Poligono, también debe implementar esta función de dibujar.
 * */