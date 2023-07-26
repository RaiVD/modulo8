package exercicio2
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*
class DiasDaSemana {
    fun diaDaSemanaAtual(): String {
        val diaAtualDaSemana = LocalDate.now().dayOfWeek
        val nomeDiaSemana = diaAtualDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault())
        return "Hoje é $nomeDiaSemana"
    }
    fun melhorDiaFeira(): String {
        val dataAtual = LocalDate.now().dayOfWeek
        return if (dataAtual == DayOfWeek.SUNDAY) {
            "Hoje é domingo, o melhor dia para ir à feira."
        } else {
            val diasQueFaltam = DayOfWeek.SUNDAY.value - dataAtual.value
            "Ainda não é um bom dia para ir a feira, aguarde $diasQueFaltam dias para domingo."
        }
    }
}