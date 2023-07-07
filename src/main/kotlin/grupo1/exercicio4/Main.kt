package grupo1.exercicio4
fun main() {
    val funcionarios = Funcionarios()
    val nomeBuscado = "Carla"
    val funcionarioEncontrado = funcionarios.buscarFuncionario(nomeBuscado)

    if (funcionarioEncontrado != null) {
        println("Funcionário encontrado! Nome: ${funcionarioEncontrado.nome} e Cargo: ${funcionarioEncontrado.cargo}")
    } else {
        println("Funcionário não encontrado.")
    }
}