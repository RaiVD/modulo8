package exercicio1

fun main() {

    val produtos = arrayOf(
        Livro("Livro 1", 29.99, "13543987987", "Autor 1"),
        Cds("CD 1", 19.99, "5432154321", 12),
        Dvds("DVD 1", 39.99, "136543212345",120),
        Livro("Livro 2", 24.99, "54321432132", "Autor 2"),
        Cds("CD 2", 14.99, "3218765434567", 10)
    )

    for (produto in produtos) {
        produto.mostrarDetalhesDoItem()
        println("-----------------------")
    }


    val possuiCodigosRepetidos = verificarCodigosRepetidos(produtos)
    if (possuiCodigosRepetidos) {
        println("Existem códigos de barras repetidos no vetor.")
    } else {
        println("Não existem códigos de barras repetidos no vetor.")
    }

    val produtoComMesmoCodigo = Cds("CD 1", 19.99, "5432154321", 12)
    val produtoComCodigoDiferente = Cds("CD 3", 19.99, "111111111", 11)

    buscarProduto(produtoComMesmoCodigo, produtos)
    buscarProduto(produtoComCodigoDiferente, produtos)
}
fun verificarCodigosRepetidos(produtos: Array<Produto>): Boolean {
    for (i in 0 until produtos.size - 1) {
        val codigoBarras = produtos[i].codigoDeBarras
        for (j in i + 1 until produtos.size) {
            if (codigoBarras == produtos[j].codigoDeBarras) {
                return true
            }
        }
    }
    return false
}

fun buscarProduto(produto: Produto, produtos: Array<Produto>) {
    for ((index, p) in produtos.withIndex()) {
        if (produto == p) {
            println("Produto encontrado na posição $index")
            return
        }
    }
    println("Produto não encontrado.")
}
