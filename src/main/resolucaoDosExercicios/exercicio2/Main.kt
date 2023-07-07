package exercicio2
fun main() {
    val codigoCompanhia = "G3"

    val companhiaAerea = CompanhiaAerea(" ",codigoCompanhia)
    val companhia = companhiaAerea.obterCompanhia(codigoCompanhia)

    companhia?.let {
        println("Companhia encontrada: ${it.nome}")
    } ?: run {
        println("Companhia não encontrada para o código '$codigoCompanhia'")
    }
}