package exercicio2
class Biblioteca() {
    companion object {
        val romance = arrayListOf<Livro>()
        val ficcaoCientifica = arrayListOf<Livro>()
        val suspence = arrayListOf<Livro>()
        fun cadastrarLivro() {
            println("==================== Cadastrar Livro ====================")
            println("Quantos livros você deseja cadastrar?")
            val quantidadeLivros = readlnOrNull()?.toIntOrNull() ?: 0

            for (i in 1..quantidadeLivros) {
                println("Livro $i:")
                println("Qual o nome do livro?")
                val nome = readlnOrNull() ?: " "
                println("Qual o nome do autor?")
                val autor = readlnOrNull() ?: " "
                println("Qual o gênero do livro?\n1. Romance | 2. Ficção Científica | 3. Suspense")
                val generoOpcao = readlnOrNull()?.toIntOrNull() ?: " "

                when (generoOpcao) {
                    1 -> {
                        romance.add(Livro(nome, autor))
                        println("Livro registrado com sucesso!")
                    }

                    2 -> {
                        ficcaoCientifica.add(Livro(nome, autor))
                        println("Livro registrado com sucesso!")
                    }

                    3 -> {
                        suspence.add(Livro(nome, autor))
                        println("Livro registrado com sucesso!")
                    }
                    else -> {
                        println("opção invalida")

                    }
                }
            }
        }
        fun listarLivros() {
            println("===================== Livros Cadastrados =====================")
            println()
            println("=========== Romance ==========")
            for (livro in romance) {
                println(livro.toString())
            }
            println()
            println("=========== Ficção Científica ==========")
            for (livro in ficcaoCientifica) {
                println(livro.toString())
            }
            println()
            println("=========== Suspense ==========")
            for (livro in suspence) {
                println(livro.toString())
            }
            println()
        }
    }
}