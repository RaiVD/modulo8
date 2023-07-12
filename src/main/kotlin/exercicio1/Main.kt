package exercicio1
fun main() {
    var entrada = false
    while (!entrada) {
        println("===================== Supermercado =====================")
        println("\t\t================ MENU ================")
        println("1. Adicionar itens ao carrinho | 2. Ver lista do carrino | 3. Sair")
        val option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> {
                Supermercado.cadastrarProduto()
            }

            2 -> {
                Supermercado.exibirProdutosCadastrados()
            }

            3 -> {
                println("Saindo...")
                entrada = true
            }

            else -> {
                println("Opção invaida, tente novamente!")
            }
        }
    }
}
