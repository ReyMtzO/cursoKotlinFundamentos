package programacionOrientadaObjetos.objetosPropiedadesInstacias

import programacionOrientadaObjetos.clases.Nota

// Una "clase" se declara de la siguiente manera: tenemos la palabra reservada class, después el nombre de la clase iniciado con mayúscula (CamelCase)
// Se recomienda no separar por guiones bajos ni puntos, etc... Y pondremos llaves para delimitar el cuerpo de la clase


// Las "propiedades" se declaran de la sig manera: dentro del cuerpo de la clase delimitado por llaves, declaramos las propiedades o atributos que tendrá
// Como ejemplo pondremos una de las formas más básicas para realizar este proceso:

/*
* class Nota {
*     var nombre: String = ""
*     var contenido: String = ""
*     var fechaCreacion: Date = Date()
* }
*/

// Estas propiedades las asignamos como tipo var para poder reasignar los valores en caso de ser necesario
// Posteriormente tenemos el tipo de dato: String o Date (en este caso), y agregamos "" o () para dar un valor de iniciación
// Date nos aparecerá en color rojo, así que seleccionamos y damos Alt + Enter, para importar java.util.Date
// El primer Date es para declarar el objeto, y al segundo le agregamos paréntesis () para crear su "Instancia"
// Date es una clase que nos proporciona java, para poder trabajar con las fechas ... public Date()


fun main() {

    val nota1 = Nota()
    nota1.nombre = "Prueba 1"
    nota1.contenido = "Contenido de prueba"

    val nota2 = Nota()
    nota2.nombre = "Prueba 2"
    nota2.contenido = "Contenido de prueba 2"
                                                // Hacemos un arreglo de nuestra clase Nota, que contendrá notas con información
    val listaNotas = arrayListOf<Nota>()
                                                // Con .add hacemos que el arreglo almacene estas notas y su información contenida
    listaNotas.add(nota1)
    listaNotas.add(nota2)
                                                // Hacemos el .forEach para acceder a todos valores de la nota
                                                // Agregamos (""" """) Raw string y un .trimIndent() para darle formato
    listaNotas.forEach {
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
            -------------------------
        """.trimIndent())
    }

}

/*

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)
                                            // Comentamos este bloque de código con ejemplo... para hacer un arreglo de notas arriba
    nota1.nombre = "Nota actualizada"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)
}
*/

