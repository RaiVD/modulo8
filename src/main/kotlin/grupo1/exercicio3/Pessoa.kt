package grupo1.exercicio3

class Pessoa (){
    var nome: String?=null
    var idade: Int?=null
    var profissao: String?=null

    fun preencherDados() {
        while (true) {
            println("Digite o nome da pessoa:")
            nome = readLine()
            if (!nome.isNullOrEmpty()) {
                break
            }
            println("Nome inválido. Digite o nome novamente.")
        }
        println("Digite a idade da pessoa:")
        idade = readlnOrNull()?.toIntOrNull()

        println("Digite a profissão da pessoa:")
        profissao = readlnOrNull()

    }
    fun exibirInformacoes(){
        val idadeInformacao = idade ?: "DESCONHECIDO"
        val profissaoInformacao = profissao?.takeUnless { it.isEmpty() } ?: "DESCONHECIDO"

        println("Nome: $nome")
        println("Idade: $idadeInformacao")
        println("Profissão: $profissaoInformacao")
    }
}