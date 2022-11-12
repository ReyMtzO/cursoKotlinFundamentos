package programacionOrientadaObjetos.herencia.clasesParaHerencia

open class Empleado(                        // open para permitir herencia hacia clase Administrador y otra
    nombreEmpleado: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    var salario: Double
) : Persona(nombreEmpleado, apellidos, direccion, telefono, fechaNacimientoTexto) {

    override fun toString(): String {
        return super.toString() + ", Salario $$salario"     // Llamo a la var salario
    }
}



/**
 * La clase "Empleado" es una clase que está heredando de la clase PADRE "Persona"
 * */