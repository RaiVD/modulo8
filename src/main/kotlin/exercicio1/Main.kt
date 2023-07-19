package exercicio1

fun main(){
    var entrada = false
    while (!entrada) {
        println("Menu")
        println("1. Divisão | 2. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0
        when(option) {
            1 -> {
                println("Digite um número inteiro: ")
                val dividendo: Int = readln().toInt()
                println("Digite outro número inteiro: ")
                val divisor: Int = readln().toInt()

                CalculoMatematico().divisao(dividendo,divisor)
            }
            2-> entrada=true
        }
    }
}