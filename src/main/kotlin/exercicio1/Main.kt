package exercicio1

fun main(){
    val listaDeFuncionarios = arrayListOf<Funcionario>()

    val novoFuncionario: Funcionario = Funcionario("Luis","Silva",10,25.50)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    val funcionarioUm: Funcionario = Funcionario("Ana","Rodrigues",13,30.50)
    val funcionarioDois: Funcionario = Funcionario("Raissa","Dias",14,34.40)
    val funcionarioTres: Funcionario = Funcionario("Julia","Silva",12,12.00)
    val funcionarioQuatro: Funcionario = Funcionario("Paula","Santos",11,26.00)
    val funcionarioCinco: Funcionario = Funcionario("João","Vicente",16,29.90)
    val funcionarioSeis: Funcionario = Funcionario("José","Queiroz",17,27.80)
    val funcionarioSete: Funcionario = Funcionario("Pedro","Pereira",18,20.60)
    val funcionarioOito: Funcionario = Funcionario("Paulo","Silva",10,21.88)
    val funcionarioNove: Funcionario = Funcionario("Renata","Carvalho",20,22.80)

    listaDeFuncionarios.add(funcionarioUm)
    listaDeFuncionarios.add(funcionarioDois)
    listaDeFuncionarios.add(funcionarioTres)
    listaDeFuncionarios.add(funcionarioQuatro)
    listaDeFuncionarios.add(funcionarioCinco)
    listaDeFuncionarios.add(funcionarioSeis)
    listaDeFuncionarios.add(funcionarioSete)
    listaDeFuncionarios.add(funcionarioOito)
    listaDeFuncionarios.add(funcionarioNove)
    listaDeFuncionarios.add(novoFuncionario)
    println("==============================")
    println(listaDeFuncionarios.joinToString("\n"))

}