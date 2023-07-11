package grupo3.exercicio3

class Pessoa() {
    fun verificarMaioridade(nomeUsuario: String, anoNascimento: Int) {
        val idade = calcularIdade(anoNascimento)

        if (idade >= 18) {
            println("$nomeUsuario é maior de idade.\nEla tem $idade anos.")
        } else {
            val anosQueFaltam = 18 - idade
            println("$nomeUsuario tem $idade anos, faltam $anosQueFaltam anos para ser maior de idade!")
        }
    }
    private fun calcularIdade(anoNascimento: Int): Int {
        val anoAtual = 2023 - anoNascimento
        return anoAtual
    }
}