package exercicio4

class Imposto{
    fun calcularImposto(porcentagem: Double, salario: Double): String{
        val calculo = salario * porcentagem
        val formatValue = "%.2f".format(calculo)
        return "Imposto a ser pago: R$$formatValue"
    }
}