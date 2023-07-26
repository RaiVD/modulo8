package exercicio2Test

import org.junit.Assert.assertEquals
import org.junit.Test

class DiasDaSemanaTest {
    @Test
    fun testDiaCorrespondente() {
        assertEquals("Domingo", obterDiaDaSemana(1))
        assertEquals("Segunda-feira", obterDiaDaSemana(2))
        assertEquals("Terça-feira", obterDiaDaSemana(3))
        assertEquals("Quarta-feira", obterDiaDaSemana(4))
        assertEquals("Quinta-feira", obterDiaDaSemana(5))
        assertEquals("Sexta-feira", obterDiaDaSemana(6))
        assertEquals("Sábado", obterDiaDaSemana(7))
    }
    @Test
    fun testValorInvalido() {
        assertEquals("Valor inválido", obterDiaDaSemana(0))
        assertEquals("Valor inválido", obterDiaDaSemana(8))
        assertEquals("Valor inválido", obterDiaDaSemana(-1))
    }
    private fun obterDiaDaSemana(numero: Int): String {
        return when (numero) {
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            7 -> "Sábado"
            else -> "Valor inválido"
        }
    }
}