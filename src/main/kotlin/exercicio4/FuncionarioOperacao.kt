package exercicio4

import java.time.LocalDate
class FuncionarioOperacao(nomeCompleto: String, salario: Double, dataAdmissao: LocalDate): Funcionario("Operação", nomeCompleto, salario, dataAdmissao) {
    override fun exibirInformacoes() {
        println("================ Setor De Operação ================")
        println("Nome - $nomeCompleto \nSalario - $salario \nData Admissão - $dataAdmissao \nSetor - $setor")
    }
}
