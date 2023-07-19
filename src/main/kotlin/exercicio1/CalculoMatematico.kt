package exercicio1

class CalculoMatematico {
    fun divisao(valorUm: Int, valorDois: Int) {
        try {
            println("Resultado = ${valorUm / valorDois}")
        } catch (exception: ArithmeticException) {
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println(message = "Mensagem: O divisor não pode ser ${exception.message}")
        }
    }
}