package exercicio5

class Peixe (nome: String, responsavel: String, raca: String): Animal ("Peixe",nome, responsavel, raca) {
    override fun movimentar() {
        println("Nadando")
    }
    override fun comer() {
        println("Comendo ração molhada")
    }
    override fun dormir() {
        println("Dormindo de olho aberto")
    }
}