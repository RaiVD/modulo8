package exercicio2

class Quadrado(val lado: Float, val altura: Float) : Forma(){
    override fun calcularArea(): String {
        return "Área Quadrado - ${lado * altura}"
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Quadrado ${2 * (lado + altura)}"
    }
}
