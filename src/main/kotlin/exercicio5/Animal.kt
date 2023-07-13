package exercicio5

open class Animal(val tipo: String,val nome: String,val responsavel: String,val raca: String){

    fun exibirInformacoes(){
        println("------------------------------")
        println("Nome do animal - $nome \nResponsavel - $responsavel \nRaça - $raca \nTipo - $tipo")
    }
    open fun movimentar(){
        println("Movendo... ")
    }
    open fun comer(){
        println("Comendo... ")
    }
    open fun dormir(){
        println("Dormindo... ")
    }

}