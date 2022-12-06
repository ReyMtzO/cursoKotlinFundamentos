package programacionOrientadaObjetos.clasesAbstractas
/**
 * En este caso no es necesario agregar la keyword "open" class, ya que al ser abstract, el IDE detecta que se pueden heredar clases de ella.
 *
 * Damos Alt+Enter e implementar miembros, para implementar estos métodos abstractos desde la clase "Rectangulo" y nos agraga automáticamente el código que deben tener,
 * en este caso, como ejemplo serían: override fun obtenerArea(): Double {}, override fun obtenerPerimetro(): Double {}, etc.
 * */

abstract class Poligono {                   //Las llaves denotan el cuerpo de nuestra clase abstracta

    abstract fun obtenerArea() : Double             //Declaramos los métodos con la keyword "fun", y la clase que lo implemente deberá tener un método llamado obtenerArea (en este caso)
    abstract fun obtenerPerimetro(): Double         //y además estos métodos nos van a retornar un tipo de dato "Double"
    abstract fun dibujar()

    protected fun centimetrosAPulgadas(valor : Double) : Double {
        return (1/2.54) * valor
    }
}

// En nuestra clase Poligono también podemos agregar métodos y propiedades que no sean abstracts y que no tengan que implementar a fuerzas Rectangulo.
// centimetrosAPulgadas, por ejemplo, y ponemos el "protected" para que no la accedamos desde la instancia de un objeto, pero sí desde las "sub clases"

// Agregamos también un método abstracto llamado: "dibujar", y con este simulamos una interfaz gráfica para dibujar un rectángulo con * (asteriscos).
// Al ser este método abstract, el programa nos obliga a "implementar" en la clase Rectangulo, dando ctrl clic sobre esta seguido de Implement Members y OK.

/**
 * Tenemos nuestra clase Poligono
 * Esta define algunos métodos abstractos
 * Las clases que hereden de esta los van a tener que implementar
 * Algunos otros métodos ya no se tienen que implementar porque no son abstractos
 * Las clases heredadas pueden tener sus propios métodos
 */



