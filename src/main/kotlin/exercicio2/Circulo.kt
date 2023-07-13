package exercicio2

import kotlin.math.PI
//access modifier
class Circulo(val raio: Float) : Forma() {
    override fun calcularArea(): String {
        return "Área do Circulo - ${PI.toFloat() * raio * raio}"//get e set implicit
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Circulo - ${2 * PI.toFloat() * raio}"//get e set implicit
    }
}