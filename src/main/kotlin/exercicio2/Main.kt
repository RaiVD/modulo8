package exercicio2
fun main() {
    print("Digite um número de 1 a 7: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0
    val diaSemana = when (numero) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Valor inválido"
    }
    println("O dia correspondente ao número $numero é $diaSemana.")
}
