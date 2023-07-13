package exercicio5

class Gato (nome: String, responsavel: String, raca: String): Animal ("Gato",nome, responsavel, raca) {
    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }
    override fun comer() {
        println("Comendo whiskas sachê")
    }
    override fun dormir() {
        println("Dormindo na caixa")
    }
}