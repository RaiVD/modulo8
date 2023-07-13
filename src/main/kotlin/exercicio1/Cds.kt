package exercicio1

class Cds(nome: String, preco: Double, codigoDeBarras: String,val numeroFaixa: Int): Produto( nome, preco, codigoDeBarras){

    override fun mostrarDetalhesDoItem() {
        if (codigoDeBarras == " "){
            println("Nome - $nome | Preço - $preco | Numero da Faixa - $numeroFaixa")
        }else {
            println("Nome - $nome | Preço - $preco | Numero da Faixa - $numeroFaixa | Codigo de barra - $codigoDeBarras")
        }
    }
}