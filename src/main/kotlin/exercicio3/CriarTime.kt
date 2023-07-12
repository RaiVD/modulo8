package exercicio3
class CriarTime {
    companion object {
        val times = arrayListOf<TimeEsportivo>()
        fun criarTime() {
            println("Quantos times deseja criar?")
            val quantidadeTimes = readlnOrNull()?.toIntOrNull() ?: 0

            for (i in 1..quantidadeTimes) {
                println("Digite o nome do time:")
                val nome = readlnOrNull() ?: ""
                println("Digite o número de jogadores:")
                val numeroJogadores = readlnOrNull()?.toIntOrNull() ?: 0
                println("Digite o número de vitórias em 2022:")
                val vitorias = readlnOrNull()?.toIntOrNull() ?: 0
                println("Digite o esporte do time (Futebol ou Vôlei):")
                val esporte = readlnOrNull() ?: ""

                when {
                    esporte.equals("Futebol", ignoreCase = true) -> {
                        times.add(Futebol(nome, numeroJogadores, vitorias))
                        println("Time adicionado com sucesso!")
                    }
                    esporte.equals("Vôlei", ignoreCase = true) -> {
                        times.add(Volei(nome, numeroJogadores, vitorias))
                        println("Time adicionado com sucesso!")
                    }
                    else -> {
                        println("Opção invalida, digite (Futebol ou Vôlei)")
                    }
                }
                println()
            }
        }
        fun listarTimes() {
            println("Informações dos times criados:")
            for (time in times) {
                time.exibirInformacoes()
            }
        }
    }
}