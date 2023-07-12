package exercicio2

import exercicio1.Supermercado

class Biblioteca() {
    companion object {
        val romance = mutableMapOf<String, Livro>()
        val ficcaoCientifica = mutableMapOf<String, Livro>()
        val suspence = mutableMapOf<String, Livro>()
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
                println("Qual o gênero do livro?\n1. Romance | 2. Ficção Científica | 3. Suspense)")
                val generoOpcao = readlnOrNull()?.toIntOrNull() ?: " "

                when(generoOpcao){
                    1-> {
                        romance.put("Romance", Livro(nome, autor))
                        println("Livro cadastrado com sucesso!")
                    }
                    2->{
                        ficcaoCientifica.put("Ficção Científic", Livro(nome, autor))
                        println("Livro cadastrado com sucesso!")
                    }
                    3->{
                        suspence.put("Suspense", Livro(nome, autor))
                        println("Livro cadastrado com sucesso!")
                    }
                    else->{
                        println("Opção invalida, tente novamente!")
                    }
                }
            }
        }
        fun listarLivros(){
            println("===================== Livros Cadastrados =====================")

        }
    }
}