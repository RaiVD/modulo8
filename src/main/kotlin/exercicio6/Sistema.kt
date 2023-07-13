package exercicio6

class Sistema {
    companion object {
        val contaSalario = arrayListOf<Conta>()
        val contaPoupanca = arrayListOf<Conta>()
        val contaCorrente = arrayListOf<Conta>()

        fun criarConta() {
            var entrada = false
            while (!entrada) {
                println("--------- Criar Conta ---------")
                println("Qual conta deseja criar?")
                println("1. Conta Salário | 2. Conta Poupança | 3. Conta Corrente | 4. Voltar ao menu")
                val option = readlnOrNull()?.toIntOrNull() ?: 0
                when (option) {
                    1 -> {
                        println("Qual o seu nome?")
                        val nome = readlnOrNull()
                        if (nome != null) {
                            contaSalario.add(ContaSalario(1212.00, nome))
                            println("Conta adicionada com sucesso!")
                        } else {
                            println("O nome não pode ser vazio")
                        }
                    }

                    2 -> {
                        println("Qual o seu nome?")
                        val nome = readlnOrNull()
                        if (nome != null) {
                            contaPoupanca.add(ContaPopanca(0.0, nome))
                            println("Conta adicionada com sucesso!")
                        } else {
                            println("O nome não pode ser vazio")
                        }
                    }

                    3 -> {
                        println("Qual o seu nome?")
                        val nome = readlnOrNull()
                        println("Com qual saldo deseja iniciar a conta?")
                        val saldo = readlnOrNull()?.toDoubleOrNull()
                        if (nome != null && saldo != null) {
                            contaCorrente.add(ContaCorrente(saldo, nome))
                            println("Conta adicionada com sucesso!")
                        } else {
                            println("O nome não pode ser vazio")
                        }
                    }
                    4 -> {
                        entrada = true
                    }
                    else->{
                        println("opção invalida")
                    }
                }
            }
        }
        fun acessarConta() {
            println("--------- Acessar Conta ---------")
            println("Qual tipo de conta deseja acessar?")
            println("1. Conta Salário | 2. Conta Poupança | 3. Conta Corrente | 4. Voltar ao menu")
            val option = readlnOrNull()?.toIntOrNull() ?: 0

            when(option){
                1-> {
                    println("Digite o nome do responsavel da conta: ")
                    val nome = readlnOrNull()

                    val contaSalario = contaSalario.find { it.nomeDoUsuario == nome }
                    if (contaSalario != null) {
                        println("Qual opção você deseja:")
                        println("1. Depositar | 2. Sacar | 3. Ver saldo | 4. Voltar ao menu")
                        val option = readlnOrNull()?.toIntOrNull() ?: 0
                        when (option) {
                            1 -> {
                                print("Digite o valor do depósito: ")
                                val valor = readln().toDouble()
                                print("É depósito do empregador? (s/n): ")
                                val empregador = readln()

                                contaSalario.depositar(valor,empregador)
                            }
                            2 -> {
                                print("Digite o valor do depósito: ")
                                val valor = readln().toDouble()

                                contaSalario.sacar(valor)
                            }
                            3 -> {
                                contaSalario.consultarSaldo()
                            }
                            4 -> return
                            else -> println("Opção inválida.")
                        }
                    } else {
                        println("Conta não encontrada.")
                    }
                }
                else->{
                    println("opção invalida")
                }
            }
            when(option){
                1-> {
                    println("Digite o nome do responsavel da conta: ")
                    val nome = readlnOrNull()

                    val contaSalario = contaSalario.find { it.nomeDoUsuario == nome }
                    if (contaSalario != null) {
                        println("Qual opção você deseja:")
                        println("1. Depositar | 2. Sacar | 3. Ver saldo | 4. Voltar ao menu")
                        val option = readlnOrNull()?.toIntOrNull() ?: 0
                        when (option) {
                            1 -> {
                                print("Digite o valor do depósito: ")
                                val valor = readln().toDouble()
                                print("É depósito do empregador? (s/n): ")
                                val empregador = readln()

                                contaSalario.depositar(valor,empregador)
                            }
                            2 -> {
                                print("Digite o valor do saque: ")
                                val valor = readln().toDouble()

                                contaSalario.sacar(valor)
                            }
                            3 -> {
                                contaSalario.consultarSaldo()
                            }
                            4 -> return
                            else -> println("Opção inválida.")
                        }
                    } else {
                        println("Conta não encontrada.")
                    }
                }
                2-> {
                    println("Digite o nome do responsavel da conta: ")
                    val nome = readlnOrNull()

                    val contaPoupanca = contaPoupanca.find { it.nomeDoUsuario == nome }
                    if (contaPoupanca != null) {
                        println("Qual opção você deseja:")
                        println("1. Depositar | 2. Sacar | 3. Ver saldo | 4. Voltar ao menu")
                        val option = readlnOrNull()?.toIntOrNull() ?: 0
                        when (option) {
                            1 -> {
                                print("Digite o valor do depósito: ")
                                val valor = readln().toDouble()
                                print("É depósito do usuario? (s/n): ")
                                val usuario = readln()

                                contaPoupanca.depositar(valor,usuario)
                            }
                            2 -> {
                                print("Digite o valor do saque: ")
                                val valor = readln().toDouble()

                                contaPoupanca.sacar(valor)
                            }
                            3 -> {
                                contaPoupanca.consultarSaldo()
                            }
                            4 -> return
                            else -> println("Opção inválida.")
                        }
                    } else {
                        println("Conta não encontrada.")
                    }
                }
                3-> {
                    println("Digite o nome do responsavel da conta: ")
                    val nome = readlnOrNull()

                    val contaCorrente = contaCorrente.find { it.nomeDoUsuario == nome }
                    if (contaCorrente != null) {
                        println("Qual opção você deseja:")
                        println("1. Depositar | 2. Sacar | 3. Ver saldo | 4. Voltar ao menu")
                        val option = readlnOrNull()?.toIntOrNull() ?: 0
                        when (option) {
                            1 -> {
                                print("Digite o valor do depósito: ")
                                val valor = readln().toDouble()
                                print("É depósito do usuario? (s/n): ")
                                val usuario = readln()

                                contaCorrente.depositar(valor,usuario)
                            }
                            2 -> {
                                print("Digite o valor do saque: ")
                                val valor = readln().toDouble()

                                contaCorrente.sacar(valor)
                            }
                            3 -> {
                                contaCorrente.consultarSaldo()
                            }
                            4 -> return
                            else -> println("Opção inválida.")
                        }
                    } else {
                        println("Conta não encontrada.")
                    }
                }
                else->{
                    println("opção invalida")
                }

            }
        }
    }
}