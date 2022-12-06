package arraysCicloFor
/*
fun main() {

    val empleados = arrayListOf("Jesús", "Alberto", "Claudia")

      for(empleado in empleados){
          println(empleado)
          println("-------------")




      empleados.forEach { empleado ->        // Lambda, es una forma de representar una función y permite moderarla de una manera más sencilla
          println(empleado)                  // Cada elemento de "empleados" lo pasa como argumento y se recibe en "empleado" como un parámetro
          println("-------------")           // -> es un separador para los parámetros y argumentos que recibimos del cuerpo de la función
      }
  }
  */



    fun main() {

        val empleados = arrayListOf("Jesús", "Alberto", "Claudia")

        empleados.forEachIndexed { i, empleado ->    // Declaramos la variable i que será nuestro índice
            println("$i - $empleado")               // Imprime los elementos con un índice anexado
            println("-------------")
        }
    }

// El ciclo forEach nos sirve para recorrer todos los elementos dentro de una colección