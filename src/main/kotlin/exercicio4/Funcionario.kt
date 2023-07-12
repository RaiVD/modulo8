package exercicio4

import java.time.LocalDate
open class Funcionario (val setor: String, val nomeCompleto: String, val salario: Double, val dataAdmissao: LocalDate){
    open fun exibirInformacoes() {
        println("Nome - $nomeCompleto \nSalario - $salario \nData Admissão - $dataAdmissao \nSetor - $setor")
    }
}