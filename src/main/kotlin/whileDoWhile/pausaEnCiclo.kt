package whileDoWhile

// Es importante saber evitar que nuestros ciclos se ejecuten de manera infinita si así lo requerimos, para evitar la sobre carga de memoria


fun main(){

    while (true) {

        readLine()       // El ciclo se ejecutará de forma indefinida, pero no va a imprimir el "Hola" hasta que se le agregue un valor por el readLine()

        println("Hola")    // Si sólo usamos el println(), la palabra "Hola" se ejecutará de manera infinita al ser "true" hasta llenar la memoria
    }

}
