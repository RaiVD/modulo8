package exercicio6

class ContaPopanca(saldo: Double,nomeDoUsuario: String): Conta(saldo,nomeDoUsuario) {

    override fun sacar(valorDoSaque: Double) {
        if (saldo - valorDoSaque < 0) {
            println("Saldo insuficiente. Saque não permitido.")
        } else {
            saldo -= valorDoSaque
            println("Saque de R$$valorDoSaque realizado com sucesso. Novo saldo: R$$saldo")
        }

    }
    override fun depositar(valorDoDeposito: Double, usuario: String) {
        if (usuario == "n") {
            println("Conta Poupança só pode receber depósito do usuario.")
        } else {
            saldo += valorDoDeposito
            println("Depósito de R$$valorDoDeposito realizado com sucesso. Novo saldo: R$$saldo")
        }
    }
    override fun consultarSaldo() {
        println("Saldo atual da conta Poupança - R$$saldo")
    }
}