package exercicio3

fun main(){
    var entrada = false
    while (!entrada){
        println("============================ Dicionario ===========================")
        println("1. Adicionar Termo | 2. Procurar Termo | 3. Listar Termos | 4. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0
        when(option){
            1 -> {
                print("Qual termo deseja adicionar ao dicionario?")
                val term = readlnOrNull()
                print("Qual o significado desse termo?")
                val meaning = readlnOrNull()
                Dicionario().adicionarTermo(term,meaning)
            }
            2 -> {
                print("Qual termo deseja procurar?")
                val term = readlnOrNull()
                Dicionario().procurarTermo(term)
            }
            3 -> Dicionario().listarTermos()
            4 -> entrada = true
            else -> println("Opção invalida")
        }
    }
}