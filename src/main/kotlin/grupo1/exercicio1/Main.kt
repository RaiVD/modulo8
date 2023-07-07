package grupo1.exercicio1

fun main() {
    val lista = listOf(1, 2, null, 4, null, 6)
    val soma = Calculadora().calcularSoma(lista)
    println("A soma dos valores não nulos é: $soma")
}