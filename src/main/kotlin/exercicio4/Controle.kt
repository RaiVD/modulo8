package exercicio4

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Controle {
    companion object {
        private val funcionarios = arrayListOf<Funcionario>()
        fun lancarFuncionarios() {
            println("Quantos funcionarios deseja lançar?")
            val quantidade = readlnOrNull()?.toIntOrNull() ?: 0

            for (i in 1..quantidade) {
                println("Digite o nome do funcionario:")
                val nome = readlnOrNull() ?: ""
                println("Digite o salario do $nome:")
                val salario = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                println("Digite a data de admissão (formato: dd/mm/aaaa):")
                val data = readln()

                val dataValidade = try {
                    LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                } catch (e: Exception) {
                    null
                }

                println("Digite o setor (Operação ou Administração):")
                val setor = readlnOrNull() ?: ""

                when {
                    setor.equals("Operação", ignoreCase = true) && dataValidade != null -> {
                        funcionarios.add(FuncionarioOperacao(nome, salario, dataValidade))
                        println("Funcionario adicionado com sucesso!")
                    }
                    setor.equals("Administração", ignoreCase = true) && dataValidade != null -> {
                        funcionarios.add(FuncionarioAdministracao(nome, salario, dataValidade))
                        println("Funcionario adicionado com sucesso!")
                    }
                    else -> {
                        println("Opção invalida, tente novamente!")
                    }
                }
                println()
            }
        }
        fun listarFuncionarios() {
            println("Informações dos times criados:")
            for (funcionario in funcionarios) {
                funcionario.exibirInformacoes()
            }
        }
    }
}