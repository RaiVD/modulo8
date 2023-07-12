package exercicio2

class Pessoa {
    var idade: Int = 0
        private set

    var diaNascimento: Int = 0
        private set

    var mesNascimento: Int = 0
        private set

    var anoNascimento: Int = 0
        private set

    var nome: String = ""

    fun calculaIdade( anoAtual: Int) {
        idade = anoAtual - anoNascimento

        if (anoAtual < anoNascimento) {
            println("Ano de nascimento inferior ao ano atual, por favor informe outra data")
        }
    }

    fun informarIdade(): Int {
        return idade
    }

    fun informarNome(): String {
        return nome
    }

    fun ajustaDataDeNascimento(dia: Int, mes: Int, ano: Int) {
        diaNascimento = dia
        mesNascimento = mes
        anoNascimento = ano
    }
}