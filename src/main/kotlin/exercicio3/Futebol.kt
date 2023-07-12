package exercicio3

class Futebol(nome: String, quantidadeJogadores: Int, vitorias: Int):TimeEsportivo(nome,quantidadeJogadores,vitorias, "Futebol") {
    override fun exibirInformacoes() {
        println("========== Time de Futebol ==========")
        super.exibirInformacoes()
    }
}