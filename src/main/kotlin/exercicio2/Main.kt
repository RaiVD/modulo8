package exercicio2

fun main() {
    var entrada = false
    while (!entrada) {
        println("====================================== Menu ======================================")
        println("Qual opção você deseja: ")
        println("1. Idade do Albert Einstein  |  2. Idade do Isaac Newton | 3. Sua idade | 4. Sair ")
        val option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> {
                CalcularIdade.idadeAlbert()
            }

            2 -> {
                CalcularIdade.idadeIssac()
            }

            3 -> {
                println("Qual seu nome?")
                val nome = readln()
                println("Qual o dia do seu aniversario?")
                val dia = readln().toInt()
                println("Qual o mês do seu aniversario?")
                val mes = readln().toInt()
                println("Qual o ano do seu aniversario?")
                val ano = readln().toInt()
                CalcularIdade.idadeUsuario(nome,dia,mes, ano)
            }

            4 -> {
                println("Saindo...")
                entrada = true
            }

            else -> {
                println("Opção invalida, tente novamente")
            }
        }
    }
}