package programacionOrientadaObjetos.modificadoresDeAcceso

/*
import programacionOrientadaObjetos.clasesPOO.Nota
import java.util.Date

// Los "modificadores de acceso" nos van a permitir determinar qué tan accesible es un elemento dentro de nuestra aplicación (Encapsulamiento)
// Nos permiten restringir el acceso a los elementos (variables, funciones, propiedades, métodos, etc...)
// En Kotlin existen 4 modificadores de acceso: public, private, internal y protected, de los cuales public es el predeterminado

// Iniciamos con un ejemplo del modificador de acceso "public"

/*
public class Nota(var nombre: String, var contenido: String, var fechaCreation: Date) {
}
*/

// En este caso el IDE nos dice que podríamos NO poner el "public" porque está implícito al ser el modificador de acceso que está por default

fun main() {

    val nota1 = Nota("nota1", "contenido", Date())
}

// Es accesible desde cualquier lugar porque está denotado con la keyword public de manera implícita

*/
