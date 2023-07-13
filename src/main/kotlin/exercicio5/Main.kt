package exercicio5
fun main(){
    var entrada = false
    while (!entrada) {
        println("================== Controle de Funcionarios ==================")
        println("1. Registrar Animal")
        println("2. Listar todos os Animal")
        println("3. Interagir com Cachorro")
        println("4. Interagir com Gato")
        println("5. Interagir com Peixe")
        println("6 Sair")
        println("Digite a opção desejada:")
        val opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Registros.registrarAnimal()
            2 -> Registros.litarAnimais()
            3 -> Registros.interagirCachorro()
            4 -> Registros.interagirGato()
            5 -> Registros.interagirPeixe()
            6 -> {
                entrada = true
                println("Saindo do programa...")
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println()
    }
}