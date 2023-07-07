package exercicio1

class Pessoa(val name: String, val idade: Int?) {
    fun informacoes() {
        println("Nome: $name")
        println("Idade: ${idade ?: "Idade não informada!"}")
    }

    fun maiorDeIdade(): Boolean {
        return idade != null && idade >= 18
    }
}