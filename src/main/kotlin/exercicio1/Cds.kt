package exercicio1
//access modifier
class Cds(nome: String, preco: Double, codigoDeBarras: String,val numeroFaixa: Int): Produto( nome, preco, codigoDeBarras){

    override fun mostrarDetalhesDoItem() {
        if (codigoDeBarras == " "){
            println("Nome - $nome | Preço - $preco | Numero da Faixa - $numeroFaixa") //get implicit
        }else {
            println("Nome - $nome | Preço - $preco | Numero da Faixa - $numeroFaixa | Codigo de barra - $codigoDeBarras") //get implicit
        }
    }
}