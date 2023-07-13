package exercicio2
//access modifier
class Retangulo(val lado: Float, val altura: Float) : Forma() {
    override fun calcularArea(): String {
        return "Área Retangulo - ${lado * altura}" //get e set implicit
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Retangulo ${2 * (lado + altura)}"// get e set implicit
    }
}
