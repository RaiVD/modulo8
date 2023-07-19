package exercicio2

fun main() {
    var entrada = false
    while (!entrada) {
        try {
            println("1 - Verdura | 2 - Legumes | 3 - Grãos | 4 - Outros | 5 - Sair e mostrar lista do mercado")
            val option = readlnOrNull()?.toIntOrNull() ?: 0
            when (option) {
                1 -> ListaMercado().comprarVerduras()
                2 -> ListaMercado().comprarLegumes()
                3 -> ListaMercado().comprarGrao()
                4 -> ListaMercado().comprarOutros()
                5 -> {
                    ListaMercado().listarEFinalizar()
                    entrada = true
                }
                else -> println("Opção invalida, tente novamente!")
            }
        } catch (exception: NumberFormatException) {
            println("Entrada inválida. ${exception.message}")
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
        } catch (exception: UnsupportedOperationException) {
            println(exception.message)
        }
    }
}