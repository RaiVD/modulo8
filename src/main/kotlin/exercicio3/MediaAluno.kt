package exercicio3

class MediaAluno {
    companion object {
        val mediaAluno = mutableMapOf<Int, Aluno>()
        fun acessoProfessor(){
            var entrada = false
            while (!entrada) {
                println("Qual opção você deseja: ")
                println("1. Lançar média |  2. Listar médias lançadas | 3. Sair ")
                val opcao = readlnOrNull()?.toIntOrNull()
                when (opcao) {
                    1 -> lancarMeidas()
                    2 -> listaDeAlunos()
                    3 ->{
                        entrada = true
                    }
                    else -> println("Opção invalida")
                }
            }
        }
        fun lancarMeidas() {
            var entrada = false
            while (!entrada) {
                println("Quantos alunos você deseja lançar notas: ")
                val qantAlunos = readln().toInt()

                for (i in 0 until qantAlunos) {
                    println("Qual o RA do aluno?")
                    val codigoRA = readlnOrNull()?.toIntOrNull()
                    println("Qual nome do aluno: ")
                    val nome = readlnOrNull()

                    val mediasAlunos = DoubleArray(4)

                    for (y in 0 until 4) {
                        var nota: Double
                        do {
                            println("Informe a nota $y:")
                            nota = readln().toDoubleOrNull()!!
                        } while (nota !in 0.0..10.0)
                        mediasAlunos[y] = nota
                    }
                    if (codigoRA != null && nome != null) {
                        val mediaTurmaAuxiliar = mediasAlunos.average()
                        mediaAluno.put(codigoRA, Aluno(nome, mediaTurmaAuxiliar))
                        println("Notas lançadas com sucesso!")
                    } else {
                        println("Entrada inválida!")
                    }
                }
                println("Deseja realizar mais lançamentos?")
                println("1. Sim | 2. Não")
                val option = readlnOrNull()?.toIntOrNull()
                if (option != null && option == 2) {
                    entrada = true
                }
            }
        }
        fun listaDeAlunos() {
            println("============================ Média das Alunos ============================")
            for (media in mediaAluno) {
                println("Codigo RA - ${media.key} | Nome - ${media.value.nome} | Média - ${media.value.media}")
                println()
            }
        }
        fun listarNotaPorRA() {
            println("Qual o RA do aluno:")
            val ra = readlnOrNull()?.toIntOrNull()

            if (ra != null && mediaAluno.containsKey(ra)) {
                val aluno = mediaAluno[ra]
                println("========== Notas do aluno ==========")
                println("Nome - ${aluno?.nome} | Média - ${aluno?.media}")
            } else {
                println("Aluno não encontrado.")
            }
        }
    }
}
