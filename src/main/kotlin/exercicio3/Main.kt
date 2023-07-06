package exercicio3

import kotlin.time.Duration.Companion.minutes

fun main(){
    println("============================Filmes em Cartaz==============================")
    val filme1: Filme = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()
    val filme2: Filme = Filme("Hotel Transsilvânia", 93)
    filme2.exibirDuracaoEmHoras()
    println()
    println("Os filmes em cartaz são ${filme1.filme} e ${filme2.filme}")

    val filmes = arrayOf(
        Filme("O Poderoso Chefão", 110),
        Filme("A Origem", 145),
        Filme("O Senhor dos Anéis: A Sociedade do Anel", 159),
        Filme("Pulp Fiction: Tempo de Violência", 112),
        Filme("Clube da Luta", 130)
    )

    println("============================Lista Filmes==============================")
    var i=0
    for (filmeAtual in filmes) {
        println("Filme ${i+1}: ${filmeAtual.filme}")
        println("Duração: ${filmeAtual.duracaoEmMinutos.minutes}")
        i++
        println("----------------------------------------------------------------------")
    }
}