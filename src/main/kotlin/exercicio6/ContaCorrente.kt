package exercicio6

class ContaCorrente(saldo: Double,nomeDoUsuario: String): Conta(saldo,nomeDoUsuario) {

    override fun sacar(valorDoSaque: Double) {
        if (saldo - valorDoSaque < 0) {
            println("Saldo insuficiente. Saque não permitido.")
        } else {
            saldo -= valorDoSaque
            println("Saque de R$$valorDoSaque realizado com sucesso. Novo saldo: R$$saldo")
        }

    }
    override fun depositar(valorDoDeposito: Double, usuario: String) {
        if (usuario == "n" && valorDoDeposito >= 5000) {
            println("Operação inválida, procure a sua agência!")
        } else {
            saldo += valorDoDeposito
            println("Depósito de R$$valorDoDeposito realizado com sucesso. Novo saldo: R$$saldo")
        }
    }
    override fun consultarSaldo() {
        println("Saldo atual da conta Corrente - R$$saldo")
    }

}