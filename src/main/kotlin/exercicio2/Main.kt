package exercicio2

fun main(){
    var entrada = false
    while (!entrada){
        println("===================== Biblioteca =====================")
        println("\t\t================ MENU ================")
        println("1. Cadastrar Livro | 2. Listar livros | 3. Sair")
        val option = readlnOrNull()?.toIntOrNull()

        when(option){
            1-> { Biblioteca.cadastrarLivro() }
            2-> { Biblioteca.listarLivros() }
            3-> {
                println("Saindo...")
                entrada = true
            }
            else-> { println("Opção invaida, tente novamente!")}
        }
    }

}