package exercicio1

import kotlin.time.Duration.Companion.minutes
//access modifier
class Dvds(nome: String, preco: Double, codigoDeBarras: String,val duracaoMinutos: Int): Produto(nome, preco, codigoDeBarras) {

    override fun mostrarDetalhesDoItem() {
        if (codigoDeBarras == " "){
            val horas = duracaoMinutos.minutes//set implicit
            println("Nome - $nome | Preço - $preco | Duração - $horas")//get implicit
        }else {
            val horas = duracaoMinutos.minutes//set implicit
            println("Nome - $nome | Preço - $preco | Duração - $horas | Codigo de barra - $codigoDeBarras")//get implicit
        }
    }
}