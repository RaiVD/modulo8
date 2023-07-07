package exercicio3

fun main() {
    println("Digite a quantidade de itens que deseja adicionar na lista de compras:")
    val quantidadeItens = readlnOrNull()?.toIntOrNull() ?: 0

    val listaCompras = arrayListOf<String>()

    for (i in 1..quantidadeItens) {
        println("Digite o nome do item $i:")
        val item = readlnOrNull() ?: "Produto não lançado"
        listaCompras.add(item)
    }

    println("\nLista de compras:")

    listaCompras.forEachIndexed { index, item ->
        println("$index - $item")
    }
    if (quantidadeItens == 0){
        println("Nenhum produto lançado")
    }
}