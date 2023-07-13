package exercicio5

class Cachorro (nome: String, responsavel: String, raca: String): Animal ("Cachorro",nome, responsavel, raca) {
    override fun movimentar() {
        println("Andando em 4 patas")
    }
    override fun comer() {
        println("Comendo bife")
    }
    override fun dormir() {
        println("Dormindo na cama do $responsavel")
    }
}
