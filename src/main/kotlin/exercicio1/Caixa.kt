package exercicio1

class Caixa() {
    companion object {

        var listaDeProdutos = mutableMapOf<Int, Produto>()
        fun estoque() {
            for (valor in listaDeProdutos) {
                println("-Nome:${valor.value.nome}|Preço:${valor.value.valor}|Quantidade:${valor.value.quantidade}|Codigo:${valor.key}")
            }
        }

        fun cadastrarProdutosEstoque() {
            println("Quantos produtos você deseja adicionar:")
            val adicionar = readln().toIntOrNull() ?: 0

            for (i in 1..adicionar) {
                println("Qual o codigo do produto:")
                val codigo = readln().toInt()
                println("Qual o nome do produto:")
                val name = readlnOrNull()
                println("Qual o valor do produto:")
                val value = readlnOrNull()?.toDoubleOrNull()
                println("Qual a quantidade:")
                val quantity = readlnOrNull()?.toIntOrNull()

                if (name != null && value != null && quantity != null) {
                    listaDeProdutos[codigo] = Produto(name, value, quantity)
                    println("Produto adicionado com sucesso!")
                } else {
                    println("Entrada inválida. Produto não adicionado.")
                }
            }
            println("===================== Estoque Atualizado =====================")
            println(estoque())
        }

        fun cadastrarCompra() {
            println("===================== Produtos disponiveis =====================")
            println(estoque())
            println()
            println("Quantos produtos deseja comprar?")
            val quantidadeCompra = readlnOrNull()?.toIntOrNull() ?: 0

            for (i in 1..quantidadeCompra) {
                println("Qual o código do produto que deseja comprar?")
                val codigoProduto = readlnOrNull()?.toIntOrNull()

                if (codigoProduto != null && listaDeProdutos.containsKey(codigoProduto)) {
                    val produto = listaDeProdutos[codigoProduto] ?: continue

                    println("Qual a quantidade:")
                    val quantidade = readlnOrNull()?.toIntOrNull()

                    if (quantidade != null && quantidade <= produto.quantidade) {
                        val valorTotal = produto.valor * quantidade

                        println("==================== Compra realizada com sucesso ====================")
                        println("Compra registrada:")
                        println("Produto: ${produto.nome}")
                        println("Quantidade: $quantidade")
                        println("Valor total: $valorTotal")

                        produto.quantidade -= quantidade

                    } else {
                        println("Quantidade inválida.")
                    }
                } else {
                    println("Código do produto inválido, tente novamente!")
                }
            }
        }
    }
}





