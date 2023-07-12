package exercicio2

open class Livro(val nome: String, val autor: String) {
    override fun toString(): String {
        return "Nome do livro - $nome | Autor - $autor"
    }
}