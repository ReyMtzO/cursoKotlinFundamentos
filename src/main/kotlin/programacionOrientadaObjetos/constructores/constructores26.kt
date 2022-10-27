package programacionOrientadaObjetos

//import programacionOrientadaObjetos.clasesPOO.Nota
//import java.util.*

// El fin de un "constructor" es inicializar el objeto al crear la instancia, es decir, asignarle los valores iniciales
// Tenemos varios tipos de constructores y vamos a iniciar conociendo al constructor "primario"
// En este tendremos la palabra reservada "class", también el nombre de nuestra clase, por ej: Nota, y entre paréntesis recibe un conjunto de "propiedades"

/*
Clase con el constructor:

class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date){
}



fun main() {
                                // Al momento de inicializar la nota nos pedirá los valores que están dentro de nuestra clase Nota
    val nota1: Nota = Nota("Nota 1", "Contenido de la nota 1", Date())
                                // Si no pasamos esos 3 valores, no podremos crear la instancia
    val nota2: Nota = Nota("Nota 2", "Contenido de la nota 2", Date())
                                // Para saber las propiedades que necesitamos, nos situamos dentro de los () y tecleamos: ctrl + P, para no ir a la clase
    val listaNotas = arrayListOf<Nota>()

    listaNotas.add(nota1)

    listaNotas.add(nota2)

    listaNotas.forEach {
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
            -------------------------
        """.trimIndent())
    }
}

 */