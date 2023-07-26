package exercicio1

class Produto(val produtoUm: Double, val produtoDois: Double, val produtoTres: Double) {
    fun produtoMaisBarato(): String {
        return when {
            produtoUm < produtoDois && produtoUm < produtoTres -> "Você deve comprar o primeiro produto."
            produtoDois < produtoUm && produtoDois < produtoTres -> "Você deve comprar o segundo produto."
            else -> "Você deve comprar o terceiro produto."
        }
    }
}