package exercicio2

fun main(){
    val conjuntoNumeros = mutableSetOf<Int>()
    conjuntoNumeros.add(1)
    conjuntoNumeros.add(5)
    conjuntoNumeros.add(5)
    conjuntoNumeros.add(6)
    conjuntoNumeros.add(7)
    conjuntoNumeros.add(8)
    conjuntoNumeros.add(8)
    conjuntoNumeros.add(8)

    println(conjuntoNumeros)
    //O List permite valores repetidos, ao contrario do Set que não permite
}