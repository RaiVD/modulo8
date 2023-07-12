package exercicio3

fun main(){
    var entrada = false
    while (!entrada) {
        println("================== MENU ==================")
        println("1. Registrar Time")
        println("2. Listar Time")
        println("3. Sair")
        println("Digite a opção desejada:")
        val opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> CriarTime.criarTime()
            2 -> CriarTime.listarTimes()
            3 -> {
                entrada = true
                println("Saindo do programa...")
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}