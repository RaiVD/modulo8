package exercicio6

 abstract class Conta(var saldo: Double, val nomeDoUsuario: String) {

    abstract fun depositar(valorDoDeposito: Double, quemFazODeposito: String)
    abstract fun sacar(valorDoSaque: Double)
    abstract fun consultarSaldo()
}