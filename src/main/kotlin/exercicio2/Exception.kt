package exercicio2

class Exception {
    fun returnException(quantidade: Double) {
        if (quantidade % 1 == 0.0) {
            throw NumberFormatException("Para verdura e grão, a quantidade deve ser informada com ponto.")
        }
    }

    fun returnExceptionName(name: String) {
        if (name.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio.")
        }
    }

    fun returnExceptionValue(quantidade: Int) {
        if (quantidade <= 0) {
            throw UnsupportedOperationException("Não é possível inserir número negativo ou zero.")
        }
    }
}