package exercicio1

class Produto() {
    var nome: String = ""
        get() = field
        set(value) {
            field = value
        }
    var valor: Double = 0.0
        get() = field
        set(value) {
            field = value
        }
    var quantidade: Int = 0
        get() = field
        set(value) {
            field = value
        }

    constructor(nome: String, valor: Double, quantidade: Int) : this() {
        this.nome = nome
        this.valor = valor
        this.quantidade = quantidade
    }

}