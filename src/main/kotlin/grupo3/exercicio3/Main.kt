package grupo3.exercicio3

fun main() {
    var entrada = false
    while (!entrada) {
        print("Digite o nome do usuário: ")
        val nomeUsuario = readlnOrNull()

        print("Digite o ano de nascimento do usuário (AAAA): ")
        val anoNascimento = readlnOrNull()?.toIntOrNull()

        when {
            nomeUsuario == null -> {
                println("Não é permitido valor nulo, tente novamente!")
            }
            anoNascimento == null -> {
                println("Não é permitido valor nulo, tente novamente!")
            }
            else -> {
                Pessoa().verificarMaioridade(nomeUsuario, anoNascimento)
                entrada = true
            }
        }
    }
}