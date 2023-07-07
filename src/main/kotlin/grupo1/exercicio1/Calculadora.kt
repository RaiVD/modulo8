package grupo1.exercicio1

class Calculadora {
    fun calcularSoma(lista: List<Int?>): Int {
        var soma = 0
        for (valor in lista) {
            if (valor != null) {
                soma += valor
            }
        }
        return soma
    }
}