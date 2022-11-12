package programacionOrientadaObjetos.herencia.clasesParaHerencia

import tareaDosKotlin.descuentoPorcentaje

class Administrador (
    nombreEmpleado: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    salario: Double,
    var porcentajeBono: Double
) : Empleado(nombreEmpleado, apellidos, direccion, telefono, fechaNacimientoTexto, salario) {

    fun obtenerSalarioFinal() : Double {
        return salario + ( (salario/100) * porcentajeBono)      //Operación para calcular el salario final con bono para administrador

    }

    override fun toString(): String {
        return super.toString() + ", Porcentaje de bono: $porcentajeBono%, Salario final: ${obtenerSalarioFinal()}"      //Llamo a la var porcentajeBono
    }
}