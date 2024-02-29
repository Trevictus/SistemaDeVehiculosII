class Automovil(
    var esHibrido: Boolean, val condicionBritanica: Boolean,
    val nombre: String,
    val marca: String,
    val modelo:String,
    val capacidadCombustible: Float,
    var combustibleActual: Float,
    var kilometrosActuales: Float) {

    companion object{
        const val KILOMETROSPORLITROHIBRIDO = 15F
        const val KILOMETROSPORLITRO = 10f
        const val GASTODERRAPEHIBRIDO = 6.25F
        const val GASTODERRAPE = 7.5F
    }
    fun calcularAutonomia(): Float {
        if (esHibrido){
        val autonomiaHibrido = combustibleActual*KILOMETROSPORLITROHIBRIDO
        return autonomiaHibrido
        }
        else{
            val autonomia = combustibleActual*KILOMETROSPORLITRO
            return autonomia
        }
    }
    fun cambiarCondicionBritanica(nuevaCondicion: Boolean){

    }
    fun realizaDerrape(): Float {
        val derrape = combustibleActual - (GASTODERRAPE / 10)
        val derrapeHibrido = combustibleActual - (GASTODERRAPEHIBRIDO / 10)
        return derrape
    }
}
