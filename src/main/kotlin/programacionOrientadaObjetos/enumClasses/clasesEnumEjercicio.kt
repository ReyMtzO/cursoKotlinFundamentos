package programacionOrientadaObjetos.enumClasses

/**
 * Las Enum Classes son un tipo de clase especial que nos proporciona Kotlin que nos ayuda para representar un grupo de constantes
 * También nos ayudan a limitar la creación de los objetos a los especificados explícitamente en la implementación de la clase
 * Este tipo de clase nos permite definir constantes dentro de la clase y crear propiedades en otro tipo de clases que dependan de esas constantes
 * */

fun main() {

    val listaTareas =
        arrayListOf(
            Tarea("Lavar ropa", EstadoTarea.REALIZADA),
            Tarea("Comprar medicamentos", EstadoTarea.PENDIENTE),
            Tarea("Checar video curso",EstadoTarea.EN_PROCESO))

    var tareasPendientes = 0            //Agregamos un forEach porque surge la necesidad de saber cuántas tareas tengo "Pendientes" de la lista

    listaTareas.forEach {
        if (it.estado == EstadoTarea.PENDIENTE) tareasPendientes++
    }

    println(listaTareas[1].estado)      //Muestra el estado de la tarea en la posición 0, en este caso... REALIZADA

}

class Tarea(var nombre: String, var estado: EstadoTarea){   //Esta clase es una lista de tareas y solo tiene 2 propiedades:
                                                            //El nombre de la tarea que va a realizar y su estado, que puede ser Pendiente, En proceso y Realizada
}

enum class EstadoTarea {
    PENDIENTE{                                  //Definimos que este estado de tarea tiene una propiedad toString override dentro de {}
        override fun toString(): String {
            return "\n** La tarea aún no se ha realizado **"    //En lugar de regresar el super.toString, le ponemos que regrese un mensaje
        }
             },
    EN_PROCESO,
    REALIZADA                   //Se escriben en "mayúsculas" al ser CONSTANTES y separadas por coma (,)
}

/**
 * El agregar los estados de tarea como PENDIENTE, EN_PROCESO Y REALIZADA, nos evita problemas en la implementación de algunas funciones de la clase,
 * de lo contrario, si almacenamos estos tipos de datos como String, por ejemplo, puede que cuando alguien cree una tarea, en lugar de poner el estado: PENDIENTE
 * ponga Estado: "por hacer" o "Iniciado", y esto generaría conflictos si yo quisiera revisar todos los estados que se encuentran "Pendientes", por las diferencias
 * entre mayúsculas y minúsculas o simplemente las diferencias de nombre
 *
 * Para esto surgen las clases "Enum", que nos van a permitir almacenar estados específicos constantes de los valores, y a su vez, esto obliga a que si
 * alguien crea una clase de mi tipo Tarea, me pase uno de estos 3 valores mencionados arriba, y no me pase algún otro valor que después podría
 * generar conflictos al realizar operaciones dentro de la clase
 * */
