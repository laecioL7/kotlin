class Conta (val titular: String, val numero: Int){

    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        saldo += valor;
    }

    fun sacar(valor: Double) {
        saldo -= valor;
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor

            contaDestino.depositar(valor)

            return true
        }

        return false
    }
}