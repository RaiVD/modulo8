package exercicio3

class Volei(nome: String, quantidadeJogadores: Int, vitorias: Int):TimeEsportivo(nome,quantidadeJogadores,vitorias, "Vôlei") {
    override fun exibirInformacoes() {
        println("========== Time de Vôlei ==========")
        super.exibirInformacoes()
    }
}
