package exercicio1Test
import exercicio1.Produto
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class ProdutoTest {
    @Test
    fun testProdutoMaisBaratoPrimeiro() {
        val produtoUm = 10.00
        val produtoDois = 15.00
        val produtoTres = 20.00
        val produto = Produto(produtoUm, produtoDois, produtoTres)
        val expectedOutput = "Você deve comprar o primeiro produto."
        assertEquals(expectedOutput, produto.produtoMaisBarato())
    }

    @Test
    fun testProdutoMaisBaratoSegundo() {
        val produtoUm = 25.00
        val produtoDois = 15.00
        val produtoTres = 30.00
        val produto = Produto(produtoUm, produtoDois, produtoTres)
        val expectedOutput = "Você deve comprar o segundo produto."
        assertEquals(expectedOutput, produto.produtoMaisBarato())
    }

    @Test
    fun testProdutoMaisBaratoTerceiro() {
        val produtoUm = 50.00
        val produtoDois = 40.00
        val produtoTres = 30.00
        val produto = Produto(produtoUm, produtoDois, produtoTres)
        val expectedOutput = "Você deve comprar o terceiro produto."
        assertEquals(expectedOutput, produto.produtoMaisBarato())
    }
}