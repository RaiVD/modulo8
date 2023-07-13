package exercicio1

abstract class Produto(val nome: String, val preco: Double, val codigoDeBarras: String) {
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Produto

        return codigoDeBarras == other.codigoDeBarras
    }

    override fun hashCode(): Int {
        return codigoDeBarras.hashCode()
    }
}