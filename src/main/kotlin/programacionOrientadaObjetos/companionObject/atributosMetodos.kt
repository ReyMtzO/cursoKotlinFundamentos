package programacionOrientadaObjetos.companionObject

import java.util.*

/**
 * En este tema es importante diferenciar los atributos o propiedades y los métodos tanto de "CLASE" como de "INSTANCIA":
 * */

/**
 * Definiremos los atributos y métodos de CLASE como cosas que compartirán todos los objetos que se creen de esa instancia
 * Ej: Si pensamos en nuestra clase como un molde para hacer "galletas de jengibre", una propiedad o atributo puede ser la forma de la galleta.
 * Entonces todas las instancias (galletas) que creemos de esa clase tendrán la misma forma, entonces este atributo es propio de esta clase.
 * Si cambiamos la forma del molde (clase), todas las galletas (instancias) que salgan de ahí, van a tener esta nueva forma.
 * */

/**
 * Por otra parte, los atributos y métodos de INSTANCIA, son cosas propias del objeto... de la instancia.
 * Ej: Supongamos que los botones de la galleta son chispas de chocolate, y por tanto, cada chispa de chocolate va a pertenecer a una única
 * instancia, a una única galleta. No podríamos distribuir la misma chispa para todas las galletas, entonces es algo propio de ese objeto.
 * */
/*
fun main() {

    println(Nota2.numeroInstancias)

    val nota1 = Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())


    println(Nota2.numeroInstancias)
}

 */


/**
 * De esta manera es como se comportan las "propiedades de clase".
 *
 * Otra forma de obtener estos mismos resultados es: creando métodos dentro del "companion object" que van a ser métodos de la clase.
 * Así no tendremos que llamar al println() aquí para saber el número de instancias que se han creado en la nota.
 * */


fun main() {

    Nota2.mostrarNumeroInstancias()

    val nota1 = Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())
    Nota2("Ejemplo", "Ejemplo", Date())

    Nota2.mostrarNumeroInstancias()

}





