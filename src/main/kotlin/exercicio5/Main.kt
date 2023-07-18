package exercicio5

fun main(){
    var entrada = false
    while (!entrada){
        println("============================ Escola ===========================")
        println("1. Cadastrar aluno sem matricula\n2. Listar todos os alunos\n3. Listar alunos com sobrenome" +
                "\n4. Nome do aluno mais velho\n5. Media de idade\n6. Atualizar dados" +
                "\n7. Remover aluno\n8. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0
        when(option){
            1 -> {
                print("Nome do aluno?")
                val name = readlnOrNull()
                print("Qual o sobrenome?")
                val surname = readlnOrNull()
                print("Data de nascimento (formato: dd/mm/aaaa)?")
                val  date = readlnOrNull()
                print("Qual gênero?")
                val gender = readlnOrNull()
                print("Qual a matricula?")
                val matricula = readlnOrNull()?.toIntOrNull()
                Turma().cadastrarAluno(name,surname,date,gender,matricula)
            }
            2 -> Turma().listarTodosOsAlunos()
            3 -> {
                print("Qual o sobrenome do aluno?")
                val surname = readlnOrNull()
                Turma().listarAlunoComSobrenome(surname)
            }
            4 -> Turma().listarAlunoMainIdoso()
            5 -> Turma().listarMediaDeIdade()
            6 -> {
                print("Qual aluno deseja atualizar os dados (Informe a matricula)?")
                val matricula = readlnOrNull()?.toIntOrNull()
                print("Nome do aluno (atualizado)?")
                val name = readlnOrNull()
                print("Qual o sobrenome?")
                val surname = readlnOrNull()
                print("Qual gênero?")
                val gender = readlnOrNull()
                Turma().atualizarDadosBuscandoPorMatricula(name, surname, gender, matricula)
            }
            7 -> {
                print("Qual aluno deseja remover (Informe a matricula)?")
                val matricula = readlnOrNull()?.toIntOrNull()
                Turma().removerAlunoPorMatricula(matricula)
            }
            8 -> {
                println("Saindo...")
                entrada = true
            }
            else -> println("Opção invalida")
        }
    }
}