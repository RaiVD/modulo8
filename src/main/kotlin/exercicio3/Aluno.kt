package exercicio3

class Aluno (){
    var nome: String = ""
        get() = field
        set(value) {
            field = value
        }

    var media: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(nome: String, media: Double) : this() {
        this.nome = nome
        this.media = media
    }

}