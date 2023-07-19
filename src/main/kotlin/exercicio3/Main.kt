package exercicio3

import java.time.LocalDate

fun main(){
    val converter = ConversorDeMoedas()
    var entrada = false
    while (!entrada) {
        try {
            println("=========== Boas vindas ao conversor de moedas ===========")
            println("=========== Qual moeda você deseja converter? ============")
            println("1 - Dólar Americano | 2 - Dólar canadense | 3 - Euro | 4 - Libra Esterlina | 5 - Sair ")
            val option = readlnOrNull()?.toIntOrNull() ?: 0
            when (option) {
                1 -> {
                    println("Qual valor deseja converter?")
                    val value = readln()
                    val valueBigDecimal = converter.validarValor(value)
                    val valueConvertido = converter.converter(1,valueBigDecimal)
                    println("A moeda Dólar Americano na cotação de hoje ${LocalDate.now()} está em ${converter.cotacao(1)}," +
                    " o valor que pediu para converter de ${valueBigDecimal} em reais é R$$valueConvertido")

                }
                2 -> {
                    println("Qual valor deseja converter?")
                    val value = readln()
                    val valueBigDecimal = converter.validarValor(value)
                    val valueConvertido = converter.converter(2,valueBigDecimal)
                    println("A moeda Dólar Americano na cotação de hoje ${LocalDate.now()} está em ${converter.cotacao(2)}," +
                            " o valor que pediu para converter de ${valueBigDecimal} em reais é R$$valueConvertido")
                }
                3 -> {
                    println("Qual valor deseja converter?")
                    val value = readln()
                    val valueBigDecimal = converter.validarValor(value)
                    val valueConvertido = converter.converter(3,valueBigDecimal)
                    println("A moeda Dólar Americano na cotação de hoje ${LocalDate.now()} está em ${converter.cotacao(3)}," +
                            " o valor que pediu para converter de ${valueBigDecimal} em reais é R$$valueConvertido")
                }
                4 -> {
                    println("Qual valor deseja converter?")
                    val value = readln()
                    val valueBigDecimal = converter.validarValor(value)
                    val valueConvertido = converter.converter(4,valueBigDecimal)
                    println("A moeda Dólar Americano na cotação de hoje ${LocalDate.now()} está em ${converter.cotacao(4)}," +
                            " o valor que pediu para converter de ${valueBigDecimal} em reais é R$$valueConvertido")
                }
                5 -> {
                    println("Finalizando sistema, obrigado!")
                    entrada = true
                }
                else -> {
                    throw IllegalArgumentException ("Tipo de moeda inválida")
                }
            }
        } catch (exception: NumberFormatException) {
            println("Entrada inválida.")
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
        }
    }
}