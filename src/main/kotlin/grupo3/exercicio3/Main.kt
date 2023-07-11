package grupo3.exercicio3

fun main() {
    var entrada = false
    while (!entrada) {
        println("Digite o nome do usuário: ")
        val nomeUsuario = readlnOrNull()

        println("Digite o ano de nascimento do usuário (AAAA): ")
        val anoNascimento = readlnOrNull()?.toIntOrNull()

        when {
            nomeUsuario == null || anoNascimento == null -> {
                println("Não é permitido valor nulo, tente novamente!")
            }
            else -> {
                Pessoa().verificarMaioridade(nomeUsuario, anoNascimento)
                entrada = true
            }
        }
    }
}