package programacionOrientadaObjetos.interfases

/**
 * Dentro de la programación orientada a objetos...
 * Las "interfases" son parecidas a las clases abstractas, porque nos permiten definir algunos métodos y propiedades que se deben implementar dentro de
 * las clases que la hereden y también comparten algunas características, como el caso de que no pueden ser instanciadas. Pero cabe recalcar que también
 * tienen diferencias que hay que hacer notar, como son:
 *
 * - NO PUEDEN TENER CONSTRUCTOR
 * - NO PUEDEN TENER ESTADO
 * - PERMITEN SIMULAR HERENCIA MÚLTIPLE (CON LIMITACIONES)
 * */

/**
 * La sintaxis para declarar las interfases es la siguiente:
 * Agregamos la keyword "interface", posteriormente ponemos el nombre de la interfaz "Ejemplo", sin constructor, y lo delimitamos por un bloque de código.
 * - interface Ejemplo {}
 *
 * Dentro de este bloque de código, tendremos los atributos y propiedades abstractos.
 * En este caso no hay que agregar la keyword abstract, ya que estos van a ser abstractos de manera predeterminada, debido a que están dentro de una interfaz.
 * - val valor: Int
 * - fun mostrarMensaje()
 * */


fun main() {

    val rectanguloDos = RectanguloDos(30.5, 10.0)

    rectanguloDos.dibujar()

}
