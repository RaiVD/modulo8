package exercicio4

import java.time.LocalDate
class FuncionarioAdministracao(nomeCompleto: String, salario: Double, dataAdmissao: LocalDate): Funcionario("Administração", nomeCompleto, salario, dataAdmissao)  {
    override fun exibirInformacoes() {
        println("================ Setor De Administração ================")
        println("Nome - $nomeCompleto \nSalario - $salario \nData Admissão - $dataAdmissao \nSetor - $setor")
    }
}
