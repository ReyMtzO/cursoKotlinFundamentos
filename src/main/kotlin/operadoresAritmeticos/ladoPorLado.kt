package operadoresAritmeticos

//CONVERSION ENTRE TIPO DE DATOS : podemos tomar un tipo de dato como otro para hacer diferentes operaciones al desarrollar

fun main() {                                                    //.toInt: Convertir a un tipo de dato "entero"
                                                                //.toDouble, .toString, .toBoolean. etc...
    println("Ingresa el valor del lado: ")             // Aplicando estos metodos, el IDE trata al dato de la forma en que
    val lado = readLine()!!.toDouble()                 // se le solicita... (lo "convierte")

    val resultado = lado * lado

    println("El area es: ")
    println(resultado)
}