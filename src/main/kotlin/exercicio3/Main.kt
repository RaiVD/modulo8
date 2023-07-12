package exercicio3

fun main(){
    var entrada = false
    while (!entrada) {
        println("============================ Escola SimCity ============================")
        println("Qual tipo de acesso você deseja entrar: ")
        println("1. Professor |  2. Aluno | 3. Sair ")
        val option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> { MediaAluno.acessoProfessor() }
            2 -> { MediaAluno.listarNotaPorRA() }
            3 -> {
                println("Saindo...")
                entrada = true
            }
            else -> { println("Opção invalida, tente novamente") }
        }
    }
}