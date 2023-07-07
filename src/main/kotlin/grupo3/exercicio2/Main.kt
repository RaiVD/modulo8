package grupo3.exercicio2
fun main() {
    val produtos: List<String?> = listOf("Shampoo", null, "Condicionador", null, "Sabonete")

    val produtosNaoNulos = produtos.filterNotNull()

    for (produto in produtosNaoNulos) {
        println(produto)
    }
}