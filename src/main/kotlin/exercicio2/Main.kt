package exercicio2
//access modifier
fun main() {
    val formas = arrayOf(//get e set implicit
        Retangulo(3f, 4f),
        Circulo(2.5f),
        Quadrado(5f,3f),
        Retangulo(2f, 6f),
        Circulo(3.2f)
    )

    for (forma in formas) {
        println(forma.calcularArea())
        println(forma.calcularPerimetro())
        println("-----------------------")
    }
}