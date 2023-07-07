package grupo3.exercicio1

fun main() {
    println("Digite a quantidade de funcionários:")
    val qtFuncionarios = readln()?.toIntOrNull() ?:0

    var salarioTotal = 0.0
    var salariosValidos = 0


    for (i in 1..qtFuncionarios){
        println("Digite o salário do funcionário $i:")
        val salario = readln()?.toDoubleOrNull() ?:0.0

        if(salario > 0) {
            salarioTotal += salario
            salariosValidos++
        }
    }
    if (salariosValidos != 0 && salariosValidos > 0){
        val media = salarioTotal / salariosValidos
        println("Média salarial: R$ %.2f".format(media))
    }else{
        println("Digite um salário válido!")
    }
}