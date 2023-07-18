package exercicio5

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

data class Aluno(
    val matricula: Int,
    var nome: String?,
    var sobrenome: String?,
    var dataNascimento: LocalDate,
    var sexo: String?
)

class Turma {
    companion object {
        val aluno = mutableMapOf<Int?, Aluno>()
    }

    fun cadastrarAluno(name: String?, surname: String?, date: String?, gender: String?, matricula: Int?) {
        val dataValidade = try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        } catch (e: Exception) {
            null
        }
        if (!name.isNullOrBlank() && !surname.isNullOrBlank() && dataValidade != null && !gender.isNullOrBlank() && matricula != null) {
            if (!existeMatricula(matricula)) {
                aluno[matricula] = Aluno(matricula, name, surname, dataValidade, gender)
                println("Aluno cadastrado com sucesso!")
            } else {
                println("Matrícula já existente. O aluno não foi cadastrado.")
            }

        } else {
            println("Informações invalidas, tente novamente")
        }

    }

    fun listarTodosOsAlunos() {
        aluno[12345] = Aluno(12345, "Raissa", "Vicente", LocalDate.of(2003, 7, 12), "Femenino")
        aluno[12344] = Aluno(12344, "Maria", "Clara", LocalDate.of(2005, 8, 23), "Femenino")
        for (alunos in aluno) {
            println("Matricula - ${alunos.key} | Nome - ${alunos.value.nome} | Sobrenome - ${alunos.value.sobrenome} | Nascimento - ${alunos.value.dataNascimento} | Gênero ${alunos.value.sexo}")
        }
    }

    fun listarAlunoComSobrenome(surname: String?) {
        val alunosPorSobrenome = aluno.values.filter { aluno ->
            aluno.sobrenome.equals(surname, ignoreCase = true)
        }
        if (alunosPorSobrenome.isNotEmpty()) {
            for (alunos in alunosPorSobrenome) {
                println("Matricula - ${alunos.matricula} | Nome - ${alunos.nome} | Sobrenome - ${alunos.sobrenome} | Nascimento - ${alunos.dataNascimento} | Gênero ${alunos.sexo}")
            }
        } else {
            println("Não há alunos cadastrados com o sobrenome informado.")
        }
    }

    fun listarAlunoMainIdoso() {
        if (aluno.isNotEmpty()) {
            val alunoMaisIdoso = aluno.values.minByOrNull { alunos -> alunos.dataNascimento }

            if (alunoMaisIdoso != null) {
                println("Aluno mais idoso:")
                println(alunoMaisIdoso.nome)
            } else {
                println("Não foi possível determinar o aluno mais idoso.")
            }
        } else {
            println("Não há alunos cadastrados.")
        }

    }

    fun listarMediaDeIdade() {
        if (aluno.isNotEmpty()) {
            val dataAtual = LocalDate.now()
            val somaIdades = aluno.values.sumBy { aluno ->
                Period.between(aluno.dataNascimento, dataAtual).years
            }
            val mediaIdade = somaIdades.toDouble() / aluno.size
            println("Média de idade dos alunos: $mediaIdade")
        } else {
            println("Não há alunos cadastrados.")
        }
    }

    fun atualizarDadosBuscandoPorMatricula(name: String?, surname: String?, gender: String?, matricula: Int?) {
        val alunos = aluno[matricula]
        if (alunos != null) {
            alunos.nome = name
            alunos.sobrenome = surname
            alunos.sexo = gender
            println("Dados do aluno atualizados com sucesso!")
        } else {
            println("Aluno não encontrado. Não foi possível atualizar os dados.")
        }
    }

    fun removerAlunoPorMatricula(matricula: Int?) {
        val alunos = aluno.remove(matricula)
        if (alunos != null) {
            println("Aluno removido com sucesso!")
        } else {
            println("Aluno não encontrado. Não foi possível remover.")
        }
    }

    fun existeMatricula(matricula: Int): Boolean {
        return aluno.containsKey(matricula)
    }
}