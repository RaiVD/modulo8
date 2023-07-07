package exercicio4

fun main() {
    println("Digite a quantidade de alunos:")
    val quantidadeAlunos = readln().toInt()

    val nomes = mutableListOf<String>()
    val notas = mutableListOf<Double?>()

    for (i in 1..quantidadeAlunos) {
        println("Digite o nome do aluno $i:")
        val nome = readln()

        println("Digite a nota do aluno $i (deixe em branco para alunos sem notas lançadas):")
        var nota = readLine()
        nota = String as? Double

        nomes.add(nome)
        notas.add(nota)
    }

    val alunosComNotaNull = mutableListOf<String>()
    val alunosComNota = mutableListOf<String>()

    for (i in 0 until quantidadeAlunos) {
        if (notas[i] == null) {
            alunosComNotaNull.add(nomes[i])
        }
        else{
            alunosComNota.add(nomes[i])
        }
    }

    println("\nAlunos sem notas lançadas:")
    if (alunosComNotaNull.isNotEmpty()) {
        for (nom in alunosComNotaNull){
            println("-Nome: $nom")
        }
    } else {
        println("Nenhum aluno sem nota lançada.")
    }
    println("\nAlunos com notas lançadas:")
    for (nom in alunosComNota){
        println("-Nome: $nom")
    }
}