class Vehiculo(
    val marca: String,
    val modelo:String,
    val capacidadCombustible: Float,
    var combustibleActual: Float,
    var kilometrosActuales: Float
) {

    fun obtenerInformacion(): String{
        return "El vehiculo puede recorrer ${calcularAutonomia()} km."
    }
    fun calcularAutonomia(): Float{
        val autonomia = combustibleActual*10
        return autonomia
    }
    fun realizarViaje(distancia: Float): Float{
        if (distancia > calcularAutonomia()){
            return calcularAutonomia()
        }
        else if (distancia <= calcularAutonomia()){
            return calcularAutonomia()- distancia
        }
    return distancia
    }
    fun ajustarCombustible(distancia: Float): Float{
        if (realizarViaje(distancia) > combustibleActual) {
            return 0.0F
        }
        else if (realizarViaje(distancia) < combustibleActual){
            combustibleActual - distancia/kilometrosActuales
        }
        return combustibleActual
    }
    fun repostar(cantidad:Float): Float{
        val combustibleRepostado= capacidadCombustible-combustibleActual
        if (cantidad <= combustibleRepostado){
            combustibleActual = capacidadCombustible

        }
        else if (cantidad >)
    }
}