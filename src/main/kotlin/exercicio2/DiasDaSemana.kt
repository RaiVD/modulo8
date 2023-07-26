package exercicio2
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*
class DiasDaSemana(private val currentDate: LocalDate) {
    fun diaDaSemanaAtual(): String {
        val diaAtualDaSemana = currentDate.dayOfWeek
        val nomeDiaSemana = diaAtualDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault())
        return "Hoje é $nomeDiaSemana"
    }
    fun melhorDiaFeira(): String {
        val dataAtual = currentDate.dayOfWeek
        return if (dataAtual == DayOfWeek.SUNDAY) {
            "Hoje é domingo! É o melhor dia para ir à feira."
        } else {
            val diasQueFaltam = DayOfWeek.SUNDAY.value - dataAtual.value
            "Ainda não é um bom dia para ir a feira, aguarde $diasQueFaltam dias para domingo."
        }
    }
}