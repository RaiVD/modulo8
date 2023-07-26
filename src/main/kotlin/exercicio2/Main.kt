package exercicio2

import java.sql.DriverManager.println
import java.time.LocalDate

fun main() {
     val diasDaSemana = DiasDaSemana(LocalDate.now())
     println(diasDaSemana.diaDaSemanaAtual())
     println(diasDaSemana.melhorDiaFeira())
}