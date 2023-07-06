package exercicio3

import kotlin.time.Duration.Companion.minutes

class Filme(var filme: String, var duracaoEmMinutos : Int) {
    fun exibirDuracaoEmHoras(){
        val horas = duracaoEmMinutos.minutes
        println("O filme $filme possui $horas de duração.")
    }
}