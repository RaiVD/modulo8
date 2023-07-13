package exercicio6

fun main(){

    var entrada= false
    while (!entrada){
        println("Menu")
        println("1. Criar conta | 2. Acessar Conta | 3. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0

        when(option){
            1-> Sistema.criarConta()
            2-> Sistema.acessarConta()
            3-> {
                println("Saindo...")
                entrada = true
            }
            else-> {
                println("Opção invalida!")
            }
        }
    }
}