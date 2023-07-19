package exercicio6
class GuardaVolumes {
    companion object {
        private val dicionario = HashMap<Int, ArrayList<Peca>>()
        private var contador = 0
    }
    fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
        contador++
        dicionario[contador] = listaDePeca
        return contador
    }
    fun mostrarPecas() {
        for ((numero, pecas) in dicionario) {
            for (peca in pecas) {
                println("ID - $numero | Marca - ${peca.marca} | Modelo - ${peca.modelo}")
            }
        }
    }

    fun mostrarPecas(numero: Int) {
        val pecas = dicionario[numero]
        if (pecas != null) {
            for (peca in pecas) {
                println("ID - $numero | Marca - ${peca.marca} | Modelo - ${peca.modelo}")
            }
        } else {
            println("Número inválido!")
        }
    }

    fun devolverPecas(numero: Int) {
        val pecas = dicionario.remove(numero)
        if (pecas != null){
            for (peca in pecas){
                PecaConcreta(peca.marca,peca.modelo).retirada()
            }
        }else {
            println("Número inválido!")
        }
    }
}