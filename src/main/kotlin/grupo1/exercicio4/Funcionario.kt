package grupo1.exercicio4

class Funcionario(val nome: String, val cargo: String)
class Funcionarios() {
    val listaFuncionarios: List<Funcionario> = listOf(
        Funcionario("João", "Gerente"),
        Funcionario("Maria", "Analista"),
        Funcionario("Pedro", "Programador"),
        Funcionario("Ana", "Assistente"),
        Funcionario("Lucas", "Estagiário"),
        Funcionario("Carla", "Designer")
    )

    fun buscarFuncionario(nome: String): Funcionario? {
        return listaFuncionarios.find { it.nome == nome }
    }
}
