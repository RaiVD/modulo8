package exercicio3Test
import exercicio3.ReceberNumeros
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class ReceberNumerosTest {
    @Test
    fun testarSeOMetodoRetornaOMaiorValor(){
        val numeros = arrayListOf<Double>()
        numeros.add(5.66)
        numeros.add(7.06)
        numeros.add(9.96)
        numeros.add(12.00)
        numeros.add(24.90)
        assertEquals("Maior valor: ${numeros.max()}", ReceberNumeros().listaDeNumeros(numeros))
    }
}