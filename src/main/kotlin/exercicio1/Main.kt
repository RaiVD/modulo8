package exercicio1

fun main() {
    val produto = Produto(20.00,35.00,35.99)
    println("Valor do produto1: R$${produto.produtoUm}")
    println("Valor do produto2: R$${produto.produtoDois}")
    println("Valor do produto3: R$${produto.produtoTres}")
    produto.produtoMaisBarato()
}
