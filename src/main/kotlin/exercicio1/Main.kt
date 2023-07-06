package exercicio1

fun main(){
    val listaDeFuncionarios = arrayListOf<Funcionario>()

    val novoFuncionario: Funcionario = Funcionario("Luis","Silva",10,25.50)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    listaDeFuncionarios.add(Funcionario("Ana","Rodrigues",13,30.50))
    listaDeFuncionarios.add(Funcionario("Raissa","Dias",14,34.40))
    listaDeFuncionarios.add(Funcionario("Julia","Silva",12,12.00))
    listaDeFuncionarios.add(Funcionario("Paula","Santos",11,26.00))
    listaDeFuncionarios.add(Funcionario("João","Vicente",16,29.90))
    listaDeFuncionarios.add(Funcionario("José","Queiroz",17,27.80))
    listaDeFuncionarios.add(Funcionario("Pedro","Pereira",18,20.60))
    listaDeFuncionarios.add(Funcionario("Paulo","Silva",10,21.88))
    listaDeFuncionarios.add(Funcionario("Renata","Carvalho",20,22.80))
    listaDeFuncionarios.add(novoFuncionario)
    println("==============================")
    println(listaDeFuncionarios.joinToString("\n"))

}