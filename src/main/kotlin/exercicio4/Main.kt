package exercicio4

fun main(){
    var entrada = false
    while (!entrada) {
        println("================== Controle de Funcionarios ==================")
        println("1. Cadastrar Funcionario")
        println("2. Listar Funcionarios")
        println("3. Sair")
        println("Digite a opção desejada:")
        val opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Controle.lancarFuncionarios()
            2 -> Controle.listarFuncionarios()
            3 -> {
                entrada = true
                println("Saindo do programa...")
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}