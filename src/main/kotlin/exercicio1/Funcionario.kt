package exercicio1

class Funcionario (var nome: String, var sobreNome: String, var horasTrabalhadas: Int, var valorPorHora: Double) {
    fun nomeCompleto(){
        println("Nome completo: $nome $sobreNome")
    }
    fun calcularSalario(){
        val valorFinalDoMes = horasTrabalhadas * valorPorHora
        println("Salario do mês: R$ $valorFinalDoMes")
    }
    fun incrementarHoras(horasAdicionais: Int){
        horasTrabalhadas += horasAdicionais
        println("Horas trabalhadas atual: $horasTrabalhadas")
    }

    override fun toString(): String {
        return "\nFuncionario:\nNome - $nome\nSobreNome - $sobreNome\nHoras Trabalhadas - $horasTrabalhadas\nValor Por Hora - $valorPorHora"
    }

}