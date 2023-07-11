package exercicio2

import java.time.LocalDate
class CalcularIdade {
    companion object{
        fun idadeAlbert(){
            val pessoa = Pessoa()
            pessoa.nome = "Albert Einstein"
            pessoa.ajustaDataDeNascimento(14, 3, 1879)

            val dataAtual = LocalDate.now()
            val diaAtual = dataAtual.dayOfMonth
            val mesAtual = dataAtual.monthValue
            val anoAtual = dataAtual.year

            pessoa.calculaIdade(diaAtual, mesAtual, anoAtual)

            println("Nome: ${pessoa.informarNome()}")
            println("Idade: ${pessoa.informarIdade()} anos")
        }
        fun idadeIssac(){
            val pessoa = Pessoa()
            pessoa.nome = "Isaac Newton"
            pessoa.ajustaDataDeNascimento(4, 1, 1643)

            val dataAtual = LocalDate.now()
            val diaAtual = dataAtual.dayOfMonth
            val mesAtual = dataAtual.monthValue
            val anoAtual = dataAtual.year

            pessoa.calculaIdade(diaAtual, mesAtual, anoAtual)

            println("Nome: ${pessoa.informarNome()}")
            println("Idade: ${pessoa.informarIdade()} anos")
        }
        fun idadeUsuario(nome: String,dia: Int, mes: Int, ano: Int){
            val pessoa = Pessoa()

            pessoa.nome = nome
            pessoa.ajustaDataDeNascimento(dia, mes, ano)

            val dataAtual = LocalDate.now()
            val diaAtual = dataAtual.dayOfMonth
            val mesAtual = dataAtual.monthValue
            val anoAtual = dataAtual.year

            pessoa.calculaIdade(diaAtual, mesAtual, anoAtual)

            println("Nome: ${pessoa.informarNome()}")
            println("Idade: ${pessoa.informarIdade()} anos")
        }
    }
}