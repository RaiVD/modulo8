package exercicio2
//access modifier
class Quadrado(val lado: Float, val altura: Float) : Forma(){
    override fun calcularArea(): String {
        return "Área Quadrado - ${lado * altura}"//get e set implicit
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Quadrado ${2 * (lado + altura)}"//get e set implicit
    }
}
