class Vehiculo(
    val nombre: String,
    val marca: String,
    val modelo:String,
    val capacidadCombustible: Float,
    var combustibleActual: Float,
    var kilometrosActuales: Float
) {


    companion object{
        const val KILOMETROSPORLITRO = 10f
    }

    fun obtenerInformacion(): String{
        return "El vehiculo puede recorrer ${calcularAutonomia()} km."
    }
    fun calcularAutonomia(): Float{
        val autonomia = combustibleActual*KILOMETROSPORLITRO
        return autonomia
    }
    fun realizarViaje(distancia: Float): Float{
//        val distanciaRecorrible =
//            if (distancia > calcularAutonomia()) {
//                calcularAutonomia()
//            } else {
//                distancia
//            }
        val distanciaRecorrible = minOf(calcularAutonomia(), distancia)
        ajustarKilometros(distanciaRecorrible)
        ajustarCombustible(distanciaRecorrible)
        return distancia - distanciaRecorrible
    }

    private fun ajustarKilometros(distancia: Float) {
        kilometrosActuales += distancia
    }

    fun ajustarCombustible(distancia: Float) {
        combustibleActual -= distancia/KILOMETROSPORLITRO
    }

    fun repostar(cantidad:Float = 0f): Float {
        val cantidadARepostar =
            if (cantidad <= 0)
                capacidadCombustible - combustibleActual // Lleno
            else
                minOf(capacidadCombustible - combustibleActual, cantidad + combustibleActual)

        combustibleActual += cantidadARepostar
        return cantidadARepostar
    }
}