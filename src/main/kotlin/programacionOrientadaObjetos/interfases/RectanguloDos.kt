package programacionOrientadaObjetos.interfases

import kotlin.math.roundToInt

class RectanguloDos(var base: Double, var altura: Double) : PoligonoDos, Graficos {       // Aquí en PoligonoDos, no tenemos que poner paréntesis para HEREDAR ya que no requiere porque no se puede instanciar

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