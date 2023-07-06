package exercicio2

class Livros(var titulo: String, var qtdPaginas: Int, var paginasLidas: Int) {

    fun verificarProgresso(){
        val porcentagemDaLeitura = paginasLidas * 100 / qtdPaginas
        println("Você já leu $porcentagemDaLeitura% do livro")
    }

    override fun toString(): String {
        return "\nTitulo - $titulo\nQuantidade de Paginas - $qtdPaginas\nPaginas Lidas - $paginasLidas"
    }
}