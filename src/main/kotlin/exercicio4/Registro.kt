package exercicio4

data class Habitante(val nome: String,val profissao: String,val salario: List<Double>)
class Registro {
    companion object {
        val listaSalario = mutableListOf<Double>()
        val listahabitante = mutableListOf<Habitante>()
    }
    fun cadastrarHabitante(name: String?, job: String?){
        if (!name.isNullOrEmpty() && !job.isNullOrEmpty()){
            println("Informe seu salario nos 12 meses")
            for (i in 1..12){
                print("Qual o valor do salario do mês ${i}:")
                val salario = readlnOrNull()?.toDoubleOrNull()
                if (salario != null){
                    listaSalario.add(salario)

                }else{
                    println("Valor não pode ser nulo, tente novamente!")
                }
            }
            listahabitante.add(Habitante(name,job,listaSalario))
        }
    }
    fun informacoesHabitante(name: String?){
        val habitantesCadastrados = listahabitante.filter { habitante ->
            habitante.nome.equals(name, ignoreCase = true)
        }
        if (habitantesCadastrados.isEmpty()) {
            println("Nenhum habitente com $name encontrado!")
        }else{
            for (habitantes in listahabitante){
                println("Nome - ${habitantes.nome} | Profissão - ${habitantes.profissao}\nSalários: ")
                for ((index, salario) in habitantes.salario.withIndex()) {
                    println("Mês - ${index + 1}: R$$salario")
                }
            }
        }
    }
    fun calcularImpostoPorMes(name: String?){
        val habitantesCadastrados = listahabitante.filter { habitante ->
            habitante.nome.equals(name, ignoreCase = true)
        }
        if (habitantesCadastrados.isEmpty()) {
            println("Nenhum habitente com $name encontrado!")
        }else{
            for (habitantes in listahabitante){
                println("Nome - ${habitantes.nome} | Profissão - ${habitantes.profissao}\nSalários: ")
                for ((index, salario) in habitantes.salario.withIndex()) {
                    val imposto: Double = when{
                        salario <= 2000 -> 0.0
                        salario <= 3000 -> salario * 0.08
                        salario <= 4500 -> salario * 0.18
                        else -> salario * 0.28
                    }
                    val format = "%.2f".format(imposto)
                    val formtSalarioFinal =  "%.2f".format(salario - imposto)
                    println("Mês ${index + 1}: Valor imposto- R$$format | Salario com Desconto R$${formtSalarioFinal}")
                }
            }
        }
    }
}