package exercicio4

class Imposto{
    fun calcularImposto(porcentagem: Double, salario: Double): String{
        val calculo = salario * porcentagem
        val formatValue = "%.2f".format(calculo)
        val formatSalario = "%.2f".format(salario - calculo)
        return "Imposto - R$$formatValue | Salario Liquido - R$formatSalario "
    }
}