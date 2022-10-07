package operadoresAritmeticos

     // Los operadores de ASIGNACION: sirven para re-asignarle un valor a un numero en base a una operacion
fun main() {
    var numero = 25
    numero += 5

    //                      (+=)                         (-=)                        (*=)
    //Forma larga:     numero = numero + 5          numero = numero - 5          numero = numero * 5
    //Forma corta:     numero += 5 = 30             numero -= 5 =20              numero *= 5 = 125

    //                      (/=)                        (%=)
    //Forma larga:     numero = numero / 5          numero = numero % 5
    //Forma corta:     numero /= 5 = 5              numero %= 5 = 0

    println(numero)
}

    /*Los operadores de INCREMENTO y DECREMENTO: (++, --), aumentan una unidad (1) a la variable
     y disminuyen una unidad (1) a la variable respectivamente */

    /* Pueden ser utilizados como "Prefijo" (primero incremeta el valor de la variable y luego la utiliza)
    y "Posfijo" (primero usa la variable y luego la incrementa) segun lo requiera la operacion */