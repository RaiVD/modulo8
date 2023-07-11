package grupo3.exercicio4

class PesquisaSagaFilmes {
    private val votosMatrix = ArrayList<String>()
    private val votosSenhorDosAneis = ArrayList<String>()

    fun realizarPesquisa() {
        println("Pesquisa de Saga de Filmes")
        println("1. Matrix | 2. Senhor dos Anéis")

        var i = 1
        while (i <= 20) {
            println("Pessoa $i, qual seu voto: ")
            var opcao = readlnOrNull()?.toIntOrNull()

            while (opcao != 1 && opcao != 2) {
                println("Opção inválida, vote novamente.")
                println("Pessoa $i, qual seu voto: ")
                opcao = readlnOrNull()?.toIntOrNull()
            }

            if (opcao == 1) {
                votosMatrix.add("Pessoa $i")
            } else {
                votosSenhorDosAneis.add("Pessoa $i")
            }
            i++
        }
    }

    fun exibirResultados() {
        val totalVotosMatrix = votosMatrix.size
        val totalVotosSenhorDosAneis = votosSenhorDosAneis.size

        println("\n============Resultado da Pesquisa============")
        println("Total de votos para Matrix: $totalVotosMatrix")
        println("Total de votos para Senhor dos Anéis: $totalVotosSenhorDosAneis")
        println()

        when {
            totalVotosMatrix > totalVotosSenhorDosAneis -> println("Saga vencedora: Matrix!")
            totalVotosMatrix < totalVotosSenhorDosAneis -> println("Saga vencedora: Senhor dos Anéis!")
            else -> println("Houve um empate!")
        }
    }
}