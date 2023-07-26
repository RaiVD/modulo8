package exercicio3

fun main(){
    val numeros = arrayListOf<Double>()
    println("===== Digite 5 numeros =====")
    for (i in 1..5){
        println("Digite o numero $i: ")
        val value = readln().toDouble()
        numeros.add(value)
    }
    ReceberNumeros().listaDeNumeros(numeros)
}