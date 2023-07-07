package exercicio1
fun main() {
    println("Digite seu nome: ")
    val nome = readln()
    println("Digite sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull()

    val pessoa1 = Pessoa(nome, idade)

    pessoa1.informacoes()
    println("É maior de idade: ${pessoa1.maiorDeIdade()}")
    println()
}