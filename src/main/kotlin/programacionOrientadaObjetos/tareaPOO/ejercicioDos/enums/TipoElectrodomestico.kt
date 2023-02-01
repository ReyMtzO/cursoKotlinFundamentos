package programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums

enum class TipoElectrodomestico {
    LAVADORA {
        override fun toString(): String {
            return "Lavadora"
        }
    },
    MICROONDAS {
        override fun toString(): String {
            return "Microondas"
        }
    },
    REFRIGERADOR {
        override fun toString(): String {
            return "Refrigerador"
        }
    }
}

/**
 * Creamos la clase enum TipoElectrodomestico para almacenar los tipos de electrodomésticos del con los que vamos a trabajar en el programa
 * LAVADORA, MICROONDAS Y REFRIGERADOR serán constantes, por eso los escribimos con mayúsculas
 * Separamos con "comas" cada elemento
 * En el override fun escribimos el valor como queremos que se muestre el producto
 * */