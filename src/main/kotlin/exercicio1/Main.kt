package exercicio1

fun main() {
    var entrada = false
    while (!entrada) {
        println("================= Tela Inicial =================")
        println("Qual opção você deseja: ")
        println("1. Funcionario  |  2. Cliente | 3. Sair ")
        val option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> {
                Caixa.cadastrarProdutosEstoque()
            }
            2 -> {
                Caixa.cadastrarCompra()
            }
            3 -> {
                println("Saindo...")
                entrada = true
            }
            else -> {
                println("Opção invalida, tente novamente")
            }
        }
    }
}