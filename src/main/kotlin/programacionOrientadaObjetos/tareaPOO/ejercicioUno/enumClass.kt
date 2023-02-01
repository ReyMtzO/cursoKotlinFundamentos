package programacionOrientadaObjetos.tareaPOO

enum class Accion {
    DEPOSITAR {
        override fun toString(): String {
            return "Depósito de dinero"
        }
    },
                                               //Se escriben en "mayúsculas" al ser CONSTANTES y separadas por coma (,)
    RETIRAR {
        override fun toString(): String {
            return "Retiro de dinero"
        }
    },
}

/**
 * Las Enum Classes nos ayudan para representar un grupo de constantes
 * También nos ayudan a limitar la creación de los objetos a los especificados explícitamente en la implementación de la clase
 * Nos permite definir constantes dentro de la clase y crear propiedades en otro tipo de clases que dependan de esas constantes
 * */