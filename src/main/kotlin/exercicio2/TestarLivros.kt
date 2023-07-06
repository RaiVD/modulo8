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

    val livroUm: Livros = Livros("Livro 1", 299,46)
    val livroDois: Livros = Livros("Livro 2", 122,54)
    val livroTres: Livros = Livros("Livro 3", 134,53)
    val livroQuatro: Livros = Livros("Livro 4", 243,122)
    val livroCinco: Livros = Livros("Livro 5", 144,43)
    val livroSeis: Livros = Livros("Livro 6", 232,55)
    val livroSete: Livros = Livros("Livro 7", 134,122)
    val livroOito: Livros = Livros("Livro 8", 133,100)
    val livroNove: Livros = Livros("Livro 9", 433,133)
    val livroDez: Livros = Livros("Livro 10", 533,432)

    listaDeLivros.add(livroUm)
    listaDeLivros.add(livroDois)
    listaDeLivros.add(livroTres)
    listaDeLivros.add(livroQuatro)
    listaDeLivros.add(livroCinco)
    listaDeLivros.add(livroSeis)
    listaDeLivros.add(livroSete)
    listaDeLivros.add(livroOito)
    listaDeLivros.add(livroNove)
    listaDeLivros.add(livroDez)
    listaDeLivros.add(livro)

    println("===============Lista de livros=================")
    for(i in 0 until listaDeLivros.size){
        println(listaDeLivros.joinToString("\n"))
        listaDeLivros[i].verificarProgresso()
    }
}