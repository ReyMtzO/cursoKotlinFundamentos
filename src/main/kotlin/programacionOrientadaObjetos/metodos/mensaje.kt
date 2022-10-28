package programacionOrientadaObjetos.metodos

// Los "métodos" son acciones que pueden hacer los "objetos", lo cual puede pensarse como que es un algoritmo asociado al objeto
// Un "algoritmo" es una serie de pasos organizados, que describe el proceso que se debe seguir, para dar solución a un problema específico

// Los métodos se declaran de la misma forma que las funciones, con la keyword fun
// Pueden tener parámetros, valores de retorno, argumentos por defecto y es básicamente muy similar a una función, pero con 2 diferencias notables:

// 1.- A un método se le pasa implícitamente el objeto en el que se llamó
// 2.- Un método puede operar sobre datos contenidos dentro de la clase


fun main () {

    val mensaje = "Hola mundo"

    println(mensaje.uppercase())                  // String también es una clase dentro de Kotlin, entonces también tiene métodos, por ejemplo:
}                               // toString(), toBoolean(), toInt(), toIntOrNull(), toUpperCase()... y los identificaremos porque terminan con paréntesis...

// En este println(mensaje.uppercase()), no necesitamos poner dentro del paréntesis el mensaje como argumento, ya que al ser un método de la clase,
// este lo puede acceder de manera implícita





