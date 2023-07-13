package exercicio6

class ContaSalario(saldo: Double, nomeDoUsuario: String) :
    Conta(saldo, nomeDoUsuario) {

    override fun sacar(valorDoSaque: Double) {
        if (saldo - valorDoSaque < 0) {
            println("Saldo insuficiente. Saque não permitido.")
        } else {
            saldo -= valorDoSaque
            println("Saque de R$$valorDoSaque realizado com sucesso. Novo saldo: R$$saldo")
        }

    }
    override fun depositar(valorDoDeposito: Double, empregador: String) {
        if (empregador == "n") {
            println("Conta Salário só pode receber depósito do empregador.")
        } else {
            saldo += valorDoDeposito
            println("Depósito de R$$valorDoDeposito realizado com sucesso. Novo saldo: R$$saldo")
        }
    }
    override fun consultarSaldo() {
        println("Saldo atual da conta Salario - R$$saldo")
    }
}
