package exercicio2
class ListaMercado {
    companion object {
        val listaVerdura = mutableMapOf<String, Double>()
        val listaLegumes = mutableMapOf<String, Int>()
        val listaGrao = mutableMapOf<String, Double>()
        val listaOutros = mutableMapOf<String, Int>()
    }
    fun comprarVerduras(){
        println("Quantas gramas de verdura você deseja?")
        val quantidade = readln().toDouble()
        Exception().returnException(quantidade)

        println("Qual Verdura?")
        val name = readln()
        Exception().returnExceptionName(name)

        println("Compra realizada com sucesso")
        listaVerdura[name] = quantidade
    }
    fun comprarLegumes(){
        println("Quantos legumes você deseja?")
        val quantidade = readlnOrNull()?.toIntOrNull() ?: 0
        Exception().returnExceptionValue(quantidade)

        println("Qual Legume?")
        val name = readln()
        Exception().returnExceptionName(name)

        println("Compra realizada com sucesso")
        listaLegumes[name] = quantidade
    }
    fun comprarGrao(){
        println("Quantas gramas de grão você deseja?")
        val quantidade = readln().toDouble()
        Exception().returnException(quantidade)

        println("Qual Grão?")
        val name = readln()
        Exception().returnExceptionName(name)

        println("Compra realizada com sucesso")
        listaGrao[name] = quantidade
    }
    fun comprarOutros(){
        println("Quantos produtos você deseja?")
        val quantidade = readlnOrNull()?.toIntOrNull() ?: 0
        Exception().returnExceptionValue(quantidade)

        println("Qual Produto?")
        val name = readln()
        Exception().returnExceptionName(name)

        println("Compra realizada com sucesso")
        listaOutros[name] = quantidade
    }
    fun listarEFinalizar() {
        println("------------Lista Mercado-------------")
        println("Quantidade de legumes: ${listaLegumes.size}")
        listaLegumes.forEach { (k, v) -> println("Produto: $k | Quantidade: $v Kg") }

        println("\nQuantidade de verdura: ${listaVerdura.size}")
        listaVerdura.forEach { (k, v) -> println("Produto: $k | Quantidade: $v") }

        println("\nQuantidade de grãos: ${listaGrao.size}")
        listaGrao.forEach { (k, v) -> println("Produto: $k Kg | Quantidade: $v Kg") }

        println("\nQuantidade de outros: ${listaOutros.size}")
        listaOutros.forEach { (k, v) -> println("Produto: $k | Quantidade: $v") }
    }
}