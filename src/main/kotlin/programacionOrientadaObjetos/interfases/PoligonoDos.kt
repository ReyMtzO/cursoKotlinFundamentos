package programacionOrientadaObjetos.interfases

interface PoligonoDos {                 // La interface no puede tener un constructor

    fun obtenerArea() : Double
    fun obtenerPerimetro(): Double      // Poner la keyword "abstract" en estos casos es redundante porque por defecto sabe que es una interfaz debe ser abstract y no podemos declararlo de otra manera

    fun centimetrosAPulgadas(valor : Double) : Double {     // Los métodos que estén dentro de las interfaces, solo pueden ser "public" (por defecto) y "private"
        return (1/2.54) * valor
    }
}

interface Graficos {
    fun dibujar()
}

/***
* Agregamos otra interface, la llamamos Graficos y ponemos {} para delimitar su cuerpo
* Pasamos la fun dibujar a esta nueva interface
 *
* En la clase RectanguloDos vamos a implementar la interface Graficos aparte de la clase PoligonoDos agregándola seguida de una coma (,) y queda de la siguiente manera:
* class RectanguloDos(var base: Double, var altura: Double) : PoligonoDos, Graficos {}
*/
