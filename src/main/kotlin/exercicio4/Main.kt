package exercicio4

fun main(){
    var entrada = false
    while (!entrada){
        println("=============================== Bem - Vindo a SimCity ==============================")
        println("1. Cadastrar Habitante | 2. Informações do Habitante | 3. Calcular Imposto | 4. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0
        when(option){
            1 -> {
                print("Nome do habitante?")
                val name = readlnOrNull()
                print("Profissão?")
                val job = readlnOrNull()
                Registro().cadastrarHabitante(name,job)
            }
            2 -> {
                print("Nome do habitante?")
                val name = readlnOrNull()
                Registro().informacoesHabitante(name)
            }
            3 -> {
                print("Nome do habitante?")
                val name = readlnOrNull()
                Registro().calcularImpostoPorMes(name)
            }
            4 -> entrada = true
            else -> println("Opção invalida")
        }
    }
}