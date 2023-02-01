package programacionOrientadaObjetos.tareaPOO.ejercicioDos.enums

enum class ColorElectrodomestico {
    BLANCO {
        override fun toString(): String {
            return "Blanco"
        }
    },
    NEGRO {
        override fun toString(): String {
            return "Negro"
        }
    },
    GRIS {
        override fun toString(): String {
            return "Gris"
        }
    }
}

/**
 * Creamos la clase enum ColorElectrodomestico para almacenar las opciones de colores que tendrán los electrodomésticos del programa
 * BLANCO, NEGRO Y GRIS, serán constantes, por eso los escribimos con mayúsculas
 * Separamos con "comas" cada elemento
 * En el override fun escribimos el valor como queremos que se muestre el producto
 * */