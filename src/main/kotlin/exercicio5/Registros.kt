package exercicio5

class Registros {
    companion object {
        private val animal = arrayListOf<Animal>()
        val cachorro = Cachorro("Lulu","Raissa","Golden")
        val gato = Gato("Lele", "Raissa","Persa")
        val peixe = Peixe("Lili","Raissa","Carpa")
        fun registrarAnimal() {
            println("Quantos animais deseja lançar?")
            val quantidade = readlnOrNull()?.toIntOrNull() ?: 0

            for (i in 1..quantidade) {
                println("Digite o nome do animal:")
                val nomeAnimal = readlnOrNull() ?: ""
                println("Digite o nome do responsavel do $nomeAnimal:")
                val nomeResponsavel = readlnOrNull() ?: ""
                println("Digite a raça do $nomeAnimal:")
                val raca = readlnOrNull() ?: ""
                println("Qual o tipo de animal (Cachorro | Gato | Peixe)")
                val tipo = readlnOrNull() ?: ""

                when {
                    tipo.equals("Cachorro", ignoreCase = true) -> {
                        animal.add(Cachorro(nomeAnimal, nomeResponsavel, raca))
                        println("Animal registrado com sucesso!")
                    }

                    tipo.equals("Gato", ignoreCase = true) -> {
                        animal.add(Gato(nomeAnimal, nomeResponsavel, raca))
                        println("Animal registrado com sucesso!")
                    }

                    tipo.equals("Peixe", ignoreCase = true) -> {
                        animal.add(Peixe(nomeAnimal, nomeResponsavel, raca))
                        println("Animal registrado com sucesso!")
                    }

                    else -> {
                        println("Opção invalida, tente novamente!")
                    }
                }
                println()
            }
        }
        fun litarAnimais(){
            animal.add(cachorro)
            animal.add(gato)
            animal.add(peixe)
            println("Informações dos animais registrados:")
            for (animais in animal) {
                animais.exibirInformacoes()
            }
        }
        fun interagirCachorro() {
            while (true) {
                println("Qual o nome do cachorro: ")
                val nomeVerificar = readln()

                val cachorro = animal.find { it is Cachorro && it.nome == nomeVerificar } as? Cachorro
                if (cachorro != null) {
                    println("Qual opção você deseja:")
                    println("1. Movimentar | 2. Comer | 3. Dormir | 4. Voltar ao menu")
                    val option = readlnOrNull()?.toIntOrNull() ?: 0
                    when (option) {
                        1 -> cachorro.movimentar()
                        2 -> cachorro.comer()
                        3 -> cachorro.dormir()
                        4 -> return
                        else -> println("Opção inválida.")
                    }
                } else {
                    println("Cachorro não encontrado.")
                }
                println("Deseja realizar mais interações?")
                println("1. Sim | 2. Não")
                val option = readlnOrNull()?.toIntOrNull()
                if (option != null && option == 2) {
                    return
                }
            }
        }
        fun interagirGato() {
            while (true) {
                println("Qual o nome do gato: ")
                val nomeVerificar = readLine()

                val gato = animal.find { it is Gato && it.nome == nomeVerificar } as? Gato
                if (gato != null) {
                    println("Qual opção você deseja:")
                    println("1. Movimentar | 2. Comer | 3. Dormir | 4. Voltar ao menu")
                    val option = readlnOrNull()?.toIntOrNull() ?: 0
                    when (option) {
                        1 -> gato.movimentar()
                        2 -> gato.comer()
                        3 -> gato.dormir()
                        4 -> return
                        else -> println("Opção inválida.")
                    }
                } else {
                    println("Gato não encontrado.")
                }
                println("Deseja realizar mais interações?")
                println("1. Sim | 2. Não")
                val option = readlnOrNull()?.toIntOrNull()
                if (option != null && option == 2) {
                    return
                }
            }
        }
        fun interagirPeixe() {
            while (true) {
                println("Qual o nome do peixe: ")
                val nomeVerificar = readLine()

                val peixe = animal.find { it is Peixe && it.nome == nomeVerificar } as? Peixe
                if (peixe != null) {
                    println("Qual opção você deseja:")
                    println("1. Movimentar | 2. Comer | 3. Dormir | 4. Voltar ao menu")
                    val option = readlnOrNull()?.toIntOrNull() ?: 0
                    when (option) {
                        1 -> peixe.movimentar()
                        2 -> peixe.comer()
                        3 -> peixe.dormir()
                        4 -> return
                        else -> println("Opção inválida.")
                    }
                } else {
                    println("Peixe não encontrado.")
                }
                println("Deseja realizar mais interações?")
                println("1. Sim | 2. Não")
                val option = readlnOrNull()?.toIntOrNull()
                if (option != null && option == 2) {
                    return
                }
            }
        }
    }
}