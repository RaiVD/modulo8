package exercicio1

fun main() {
    //access modifier
    val produtos = arrayOf(//get e set implicit
        Livro("Livro 1", 29.99, "13543987987", "Autor 1"),
        Cds("CD 1", 19.99, "5432154321", 12),
        Dvds("DVD 1", 39.99, "136543212345",120),
        Livro("Livro 2", 24.99, "54321432132", "Autor 2"),
        Cds("CD 2", 14.99, "3218765434567", 10)
    )
    println("-------------------------- Produtos ------------------------------")
    for (produto in produtos) {
        produto.mostrarDetalhesDoItem()
    }

    //get e set implicit
    //access modifier
    val produtoComMesmoCodigo = Cds("CD 1", 19.99, "5432154321", 12)
    val produtoSemMesmoCodigo = Cds("CD 34", 9.99, "1234543234", 24)
    println("------------- PRODUTO PROCURADO --------------")
    Loja.buscarProduto(produtoComMesmoCodigo, produtos)
    Loja.buscarProduto(produtoSemMesmoCodigo, produtos)
}

