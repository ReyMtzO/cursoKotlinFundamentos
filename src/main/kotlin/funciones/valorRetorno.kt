package funciones

fun main(){
    println(calcularImpuestos(10_000.00, 16.0))
}

fun calcularImpuestos(salario: Double, porcentajeImpuestos: Double): Double {

    val totalImpuestos = (salario / 100 ) * porcentajeImpuestos

    return totalImpuestos
}

// La instruccion "return" puede o no ir al final de nuestro bloque de codigo
// Lo que hay despues del return no se ejecuta
// La funcion calcularImpuestos se va a ejecutar de acuerdo a los argumentos que le mandemos
// Los parametros pueden tener un valor predeterminado, ejemplo: funcion ejemplo (datoUno: String = "Hola")

// Al nombrar variables, es importante usar camelCase cuando son palabras compuestas o frases