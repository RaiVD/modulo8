package exercicio3

class Filme(var filme: String, var duracaoEmMinutos : Int) {
    fun exibirDuracaoEmHoras(){
        val horas = duracaoEmMinutos  / 60
        val minutos = duracaoEmMinutos  % 60
        println("O filme $filme possui $horas horas e $minutos minutos de duração.")
    }
}