package programacionOrientadaObjetos.clasesAbstractas

/**
 * Las clases abstractas nos ayudan a representar una entidad que no puede ser instanciada... es decir, nos sirve para que otras clases hereden de esta clase.
 * Una clase abstracta nos sirve para definir un esqueleto que deben llevar las otras clases, por ejemplo: definiremos algunos métodos, y las clases que hereden
 * tendrán que implementarlos (estos métodos) a fuerza.
 * */

/**
 * La sintaxis para declarar una clase abstracta es la siguiente:
 *
 * Pondremos la keyword "abstract", seguido de esto la keyword "class", después tendremos el "nombre de nuestra clase", y también puede llevar un "constructor"
 * y estará delimitada por un bloque de código.
 * - abstract class Ejemplo {}
 *
 * Dentro de este bloque de código tendremos atributos y propiedades abstractos:
 * - abstract val numero: Int           ... Los declaramos como "abstract", con su val o var, su identificador en este caso numero: y su tipo de dato en este caso Int
 * - abstract fun metodo()              ... También los métodos podemos agregarlos con abstract
 *
 * Y también podremos tener atributos y propiedades que no sean abstractos, como:
 * - val valor = 0
 * - fun mostrarMensaje() {
 *       println("Kotlin")
 *   }
 *
 *   La diferencia entre los atributos y propiedades "abstractos" y "normales" es la siguiente:
 *   - En los marcados como abstractos, las clases que hereden de "Ejemplo" se tienen que implementar a fuerzas, entonces se tienen que sobreescribir con la keyword override.
 *   - Por otro lado, los "normales" no se tienen que sobreescribir en la clase heredada y los podemos usar desde la clase base.
 * */


// Si una clase está marcada como abstract, no puedo declarar un objeto o instancia de esa clase... a fuerzas tengo que "heredar"
// A partir de la HERENCIA ya podemos hacer la implementación de esa clase.

fun main() {

    val rectangulo = Rectangulo(10.0, 5.0)     // Agregamos un "objeto" llamado rectangulo que será de la clase "Rectangulo"
                                                          // Agregamos los parámetros o datos dentro de paréntesis para crear la "instancia"
    //println(rectangulo.obtenerArea())
    //println(rectangulo.obtenerPerimetro())                // println() para acceder a sus métodos:  .obtenerArea y .obtenerPerimetro, por ejemplo.
    //println(rectangulo.obtenerAreaPulgadas())
    //println(rectangulo.obtenerPerimetroPulgadas())
    rectangulo.dibujar()
}











