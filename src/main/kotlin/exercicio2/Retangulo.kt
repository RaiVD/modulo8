package exercicio2

class Retangulo(val lado: Float, val altura: Float) : Forma() {
    override fun calcularArea(): String {
        return "Área Retangulo - ${lado * altura}"
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Retangulo ${2 * (lado + altura)}"
    }
}
