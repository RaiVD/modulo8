package exercicio6

fun main() {
    var entrada = false
    while (!entrada) {
        println("========================== Guarda Volumes - SaveTheRoupa ==========================")
        println("1. Guardar peças\n2. Mostar todas as peças guardadas\n3. Buscar peças no armario\n4. Retirar peças do armario\n5. Sair")
        val option = readlnOrNull()?.toIntOrNull() ?: 0
        when (option) {
            1 -> {
                println("===========  Bem - Vindo ===========")
                print("Qual o modelo da peça?")
                val modelo = readlnOrNull()
                print("Qual a marca da peça?")
                val marca = readlnOrNull()

                if (!marca.isNullOrEmpty() && !modelo.isNullOrEmpty()) {
                    val listaDePecas = arrayListOf<Peca>()
                    listaDePecas.add(PecaConcreta(marca, modelo))

                    val contador = GuardaVolumes().guardarPecas(listaDePecas)
                    println("Peça adicionada ao guarda-volumes com ID: $contador")
                } else {
                    println("Marca e modelo da peça devem ser preenchidos.")
                }
            }

            2 -> {
                GuardaVolumes().mostrarPecas()
            }

            3 -> {
                print("Qual o numero da chave do guarda-volume?")
                val chave = readlnOrNull()?.toIntOrNull()

                if (chave != null) {
                    GuardaVolumes().mostrarPecas(chave)
                } else {
                    println("Por favor informe uma chave valida!")
                }

            }

            4 -> {
                print("Qual o numero da chave do uarda-volume que deseja devolver?")
                val key = readlnOrNull()?.toIntOrNull()

                if (key != null) {
                    GuardaVolumes().devolverPecas(key)
                } else {
                    println("Por favor informe uma chave valida!")
                }
            }

            5 -> {
                println("Obrigada pela confiança, volte sempre!")
                entrada = true
            }
            else -> println("Opção invalida")
        }
    }
}