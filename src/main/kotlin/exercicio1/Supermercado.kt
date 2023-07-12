package exercicio1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Supermercado {
    companion object {

        private val listaDeProdutos = arrayListOf<Produto>()
        fun cadastrarProduto() {
            println("Quantos produtos você deseja adicionar:")
            val adicionar = readLine()?.toIntOrNull() ?: 0

            for (i in 1..adicionar) {
                println("Qual o código de barras do produto:")
                val codigo = readLine()?.toLongOrNull()
                println("Qual o nome do produto:")
                val nome = readLine()

                if (codigo != null && nome != null) {
                    println("Qual a data de validade (formato: dd/mm/aaaa):")
                    val dataValidadeString = readln()

                    val dataValidade = try {
                        LocalDate.parse(dataValidadeString, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    } catch (e: Exception) {
                        null
                    }

                    if (dataValidade != null) {
                        val produto = Produto(nome, codigo, dataValidade)
                        listaDeProdutos.add(produto)
                        println("Produto adicionado ao carrinho com sucesso!")
                    } else {
                        println("Data de validade inválida. Produto não adicionado.")
                    }
                } else {
                    println("Entrada inválida. Produto não adicionado.")
                }
            }
        }

        fun exibirProdutosCadastrados() {

            listaDeProdutos.add(Produto("Arroz", 7891234567890, LocalDate.of(2023, 12, 31)))
            listaDeProdutos.add(Produto("Feijão", 7894561237890, LocalDate.of(2024, 6, 30)))
            listaDeProdutos.add(Produto("Leite", 9876543210123, LocalDate.of(2023, 8, 31)))

            println("===================== Produtos Cadastrados =====================")
            for (produto in listaDeProdutos) {
                println(produto.toString())
            }
        }
    }
}