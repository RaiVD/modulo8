package exercicio3
fun main(){
    println()
    val filme1: Filme = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()
    val filme2: Filme = Filme("Hotel Transsilvânia", 93)
    filme2.exibirDuracaoEmHoras()
    println()
    println("Os filmes em cartaz são ${filme1.filme} e ${filme2.filme}")

    val filmes = arrayOf(
        Filme("O Poderoso Chefão", 188),
        Filme("A Origem", 249),
        Filme("O Senhor dos Anéis: A Sociedade do Anel", 159),
        Filme("Pulp Fiction: Tempo de Violência", 200),
        Filme("Clube da Luta", 130)
    )

    println("============================Lista Filmes==============================")
    var i=0
    for (filme in filmes) {
        println("Filme ${i+1}")
        filme.exibirDuracaoEmHoras()
        i++
        println("----------------------------------------------------------------------")
    }
}