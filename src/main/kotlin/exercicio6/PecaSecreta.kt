package exercicio6

class PecaConcreta(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Peça retirada: $modelo - $marca")
    }
}