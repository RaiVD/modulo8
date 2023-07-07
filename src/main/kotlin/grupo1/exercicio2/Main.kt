package grupo1.exercicio2

fun main() {
    println("Digite o endereço de e-mail:")
    val email = readlnOrNull()

    if (email.isNullOrEmpty()) {
        println("E-mail não fornecido.")
    } else if (isValidEmail(email)) {
        println("E-mail válido.")
    } else {
        println("E-mail inválido.")
    }
}
fun isValidEmail(email: String): Boolean {
    return email.contains('@') && email.contains('.') && email.indexOf('@') < email.lastIndexOf('.')
}