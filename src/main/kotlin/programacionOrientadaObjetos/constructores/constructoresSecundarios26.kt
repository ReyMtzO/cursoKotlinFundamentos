package programacionOrientadaObjetos

import programacionOrientadaObjetos.clasesPOO.Nota
import java.util.*

// Otra característica de las clases en Kotlin, es que podemos tener "constructores secundarios" y estos los podemos declarar con la keyword "constructor"
// Seguido de esta, entre (), le pasamos las propiedades que va a recibir, y después ponemos : this() haciendo referencia a la clase que estamos creando
// Dentro de : this() agregamos los valores: nombre, contenido, Date(), por ejemplo y abrimos {} para poner el "bloque de inicialización"
// Este bloque nos permite realizar ciertas acciones cuando se crea la instancia de nuestra clase

fun main() {

    val nota1 = Nota("Nota 1", "Contenido 1")      // Si seleccionamos Nota y damos ctrl + clic, nos redirecciona al constructor secundario

    val nota2 = Nota("Nota 2", "Contenido 2", Date()) // Si hacemos lo mismo aquí, nos redirecciona al constructor primario

// Esto imprimirá el nombre de las notas en mayúsculas por el método de la clase String .uppercase que estamos usando en el init del constructor primario
// Estamos llamando al constructor secundario, pero este siempre llama a su vez al constructor primario. Si quisiéramos solo modificar el secundario...
// tendríamos que usar this.nombre = nombre.uppercase(), justo debajo del código del constructor secundario
    println(nota1.nombre)
    println(nota2.nombre)

}

// Entonces los constructores secundarios nos sirven para poder instanciar nuestra clase con diferentes valores o diferente número de propiedades
// En la primera val nota1, la fecha no nos interesa, por lo tanto toma la fecha del sistema
// En la segunda val nota2, sí nos interesa tener una fecha específica, entonces nos manda este dato mediante la clase con constructor primario
