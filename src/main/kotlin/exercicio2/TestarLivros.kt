package exercicio2

fun main() {
    val livroFavorito: Livros = Livros("O pequeno principe", 98,20)

    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()


    listaDeLivros(livroFavorito)
}
fun listaDeLivros(livro: Livros){
    val listaDeLivros = ArrayList<Livros>()

    listaDeLivros.add(Livros("Livro 1", 299,46))
    listaDeLivros.add(Livros("Livro 2", 122,54))
    listaDeLivros.add(Livros("Livro 3", 134,53))
    listaDeLivros.add(Livros("Livro 4", 243,122))
    listaDeLivros.add(Livros("Livro 5", 144,43))
    listaDeLivros.add(Livros("Livro 6", 232,55))
    listaDeLivros.add(Livros("Livro 7", 134,122))
    listaDeLivros.add(Livros("Livro 8", 133,100))
    listaDeLivros.add(Livros("Livro 9", 433,133))
    listaDeLivros.add(Livros("Livro 10", 533,432))
    listaDeLivros.add(livro)

    println("===============Lista de livros=================")
    for(i in 0 until listaDeLivros.size){
        println(listaDeLivros.joinToString("\n"))
        listaDeLivros[i].verificarProgresso()
    }
}