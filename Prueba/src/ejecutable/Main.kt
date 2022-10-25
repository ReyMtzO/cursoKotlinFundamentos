package ejecutable

import clases.Auto                  // Importamos Auto y de esta manera no nos marca error y el código funcionará como esperamos

fun main() {

    var auto = Auto("Ford")
    println(auto.marca)
}


//... Continuamos comentando el ejercicio sobre el modificador de acceso "internal" del archivo "internal.kt" dentro del package "modificadoresDeAcceso":
// El modificador internal será accesible en este caso solo desde la carpeta "src" donde se encuentra, el cual se encuentra dentro del módulo Prueba


