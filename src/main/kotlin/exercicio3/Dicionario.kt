package exercicio3
class Dicionario {
    companion object {
        val dicionario = mutableMapOf<String, String>(
            "Termo" to "Condição ou maneira apresentada por algo ou por alguém, num dado momento.",
            "Divergencia" to "Diferença de opinião; desentendimento, discordância."
        )
    }
    fun adicionarTermo(term: String?, meaning: String?) {
        if (!term.isNullOrEmpty() && !meaning.isNullOrEmpty()) {
            dicionario[term] = meaning
            println("Termo adicionado com sucesso!")
        } else {
            println("Invalido, termo ou descrição esta vazio.")
        }
    }
    fun procurarTermo(term: String?) {
        if (!term.isNullOrEmpty() && dicionario.containsKey(term)) {
            println("$term = ${dicionario[term]}")
        } else {
            println("Invalido, termo esta vazio.")
        }
    }
    fun listarTermos() {
        val chavesOrdenadas = dicionario.keys.sorted()
        for (chave in chavesOrdenadas) {
            println(chave)
        }
    }

}