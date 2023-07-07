package exercicio2

class CompanhiaAerea(val nome: String, val codigo: String) {
    fun obterCompanhia(codigo: String): CompanhiaAerea? {
        val companhias = arrayOf(
            CompanhiaAerea("GOL", "G3"),
            CompanhiaAerea("LATAM", "LA"),
            CompanhiaAerea("Azul", "AD"),
            CompanhiaAerea("Avianca", "O6")
        )
        return companhias.find { it.codigo == codigo }
    }
}