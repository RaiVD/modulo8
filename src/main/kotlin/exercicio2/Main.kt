package exercicio2

import java.sql.DriverManager.println

fun main() {
     val diasDaSemana = DiasDaSemana()
     println(diasDaSemana.diaDaSemanaAtual())
     println(diasDaSemana.melhorDiaFeira())
}