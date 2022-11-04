package programacionOrientadaObjetos.companionObject.constantesGenerales

object ConstantesReserv {

    const val LONGITUD_MAXIMA_NOMBRE = 10

}

/**
 * En este "object" podemos guardar las constantes para poder accederlas desde aquí cuando las necesitemos.
 *
 * De esta forma podemos crear "singletons" independientes que no pertenezcan a una clase.
 *
 * Tod0 lo que guardemos aquí solo tendrá una instancia, entonces podemos guardar aquí las constantes generales para cuando
 * queramos hacer cambios en nuestro programa, poder accederlas desde aquí.
 * */

// Ejemplo:

// En lugar de hacer esto:  if (nombre.length > LONGITUD_MAXIMA_NOMBRE) throw Exception("El nombre no puede tener más de 10 caracteres")

// Hacemos este:  if (nombre.length > ConstantesReserv.LONGITUD_MAXIMA_NOMBRE) throw Exception("El nombre no puede tener más de 10 caracteres")