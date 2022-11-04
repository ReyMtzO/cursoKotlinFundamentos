package programacionOrientadaObjetos.companionObject

import java.util.*

/**
 * En este tema veremos lo que es el "companion object", y trabajaremos también con "constantes".
 * Para iniciar, debemos conocer lo que es un "singleton" o "instancia única"...
 * Singleton: es un patrón de diseño que permite restringir la creación de objetos pertenecientes a la clase a un único objeto.
 **/

/**
 * Ejemplo: supongamos que tenemos nuestra clase "Nota". Si no la tenemos como singleton, podríamos crear una infinidad de instancias
 * a partir de ella, (tantas notas como nosotros queramos). En caso contrario, si tenemos una clase delimitada como singleton, solamente
 * vamos a poder crear una instancia de esa clase, solamente un objeto perteneciente a esa clase.
 * */

/**
 * También podríamos hacerlo de manera parcial, en el caso de tener una nota y dentro de esta un singleton que será una parte única de esa clase
 * durante la ejecución de un programa
 * */



       //   const val LONGITUD_MAXIMA_NOMBRE = 10
         // keywords   // identificador    // valor

/**
 * A las constantes declaradas con la keyword "const", debemos darles el valor antes de compilar nuestro programa, a diferencia de las declaradas solo con "val".
 * Para declarar las constantes entonces ponemos primero las keywords "const val" y seguido de esto el identificador en mayúsculas y cada palabra separada
 * por _ (guión bajo), seguido de un valor establecido.
 *
 * Revisando las modificaciones y comentarios en nuestra clase Nota2, podemos ver la manera de definir constantes dentro de nuestras clases.
 * */


fun main() {

    val nota1 = Nota2("Ejemploejemploso", "Ejemplo", Date())  // Esto nos arrojará una exception al tener "nombre" más de 10 caracteres

}

/**
 * Estas constantes dentro de las clases nos son útiles para poder agregar restricciones o excepciones en nuestros programas.
 * También podemos utilizarlas cuando hacemos una aplicación que se conecta a algún servidor o a una Base de datos, podemos poner la IP
 * de nuestro servidor en una constante y accederla en cualquier parte del programa desde la constante y así no tenemos variables en cada clase
 * y tener que estarlas cambiando si cambia la IP de nuestro servidor.
 * */

/**
 * IP significa “protocolo de Internet”, que es el conjunto de reglas que rigen el formato de los datos enviados a través de Internet o la red local.
 * En esencia, las direcciones IP son el identificador que permite el envío de información entre dispositivos en una red.
 * */


/**
 * En nuestra clase Nota2, el "companion object" es un objeto de tipo "singleton" que pertenece a la clase.
 * */
