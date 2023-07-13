package exercicio1

class Livro(nome: String,preco: Double, codigoDeBarras: String,val autor: String): Produto(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        if (codigoDeBarras == " ") {
            println("Nome - $nome | Preço - $preco | Autor - $autor")
        }else{
            println("Nome - $nome | Preço - $preco | Autor - $autor | Codigo de barra - $codigoDeBarras")
        }
    }
}