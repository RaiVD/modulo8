package exercicio1
//access modifier
abstract class Produto(val nome: String, val preco: Double, val codigoDeBarras: String) {
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Produto-> {
                this.codigoDeBarras == other.codigoDeBarras
            }else-> false
        }
    }


}