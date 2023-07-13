package exercicio1

class Loja {
    companion object {
        fun buscarProduto(produto: Produto, produtos: Array<Produto>) {
            for ((index, p) in produtos.withIndex()) {
                if (produto == p) {
                    println("Produto encontrado na posição $index")
                    return
                }
            }
            println("Produto não encontrado.")
        }
    }
}