package exercicio3

open class TimeEsportivo(val nome: String,val quantidadeJogadores: Int,val vitorias: Int, val esporte: String) {
    open fun exibirInformacoes() {
        println("Nome - $nome \nQuantidade de Jogadores - $quantidadeJogadores \nVitorias - $vitorias \nEsporte - $esporte")
    }
}