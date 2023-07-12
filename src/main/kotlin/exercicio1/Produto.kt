package exercicio1

import java.time.LocalDate
class Produto(val nome: String, val codigoBarras: Long, val dataValidade: LocalDate) {
    override fun toString(): String {
        return "Nome: $nome | Código de Barras: $codigoBarras | Data de Validade: $dataValidade"
    }
}