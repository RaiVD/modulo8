package exercicio2Test

import exercicio2.DiasDaSemana
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class DiasDaSemanaTest {
    @Test
    fun verificarSeHojeEDomingo() {
        val resultado: String = DiasDaSemana(LocalDate.of(2023,7,30)).melhorDiaFeira()
        assertEquals("Hoje é domingo! É o melhor dia para ir à feira.", resultado)
    }

    @Test
    fun verificarSeQualDiaDaSemanaAtual() {
        val diaAtualDaSemana = LocalDate.now().dayOfWeek
        val resultadoDiaDaSemana = diaAtualDaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault())
        val nomeDiaDaSemana = DiasDaSemana(LocalDate.now()).diaDaSemanaAtual()
        assertEquals("Hoje é $resultadoDiaDaSemana", nomeDiaDaSemana)
    }
}