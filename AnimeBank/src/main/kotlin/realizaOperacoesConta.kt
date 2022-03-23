
fun realizarOperacoes(conta: Conta) {
    println("O que gostaria de fazer? /n 1-Sacar 2-Depositar 3-Transferir")
    val opcao  = readLine()?.toInt()

    if (opcao == 1) {
        println("Quanto gostaria de sacar?")
        val valorSaque = readLine()!!
        conta.sacar(valorSaque.toDouble())
        println("Saque de $valorSaque efetuado!!")
        println("Saldo atual: ${conta.saldo}")

    } else if (opcao == 2) {
        println("Quanto gostaria de depositar?")
        val valorDeposito = readLine()!!

        conta.depositar(valorDeposito.toDouble())
        println("Deposito de $valorDeposito efetuado!!")
        println("Saldo atual: ${conta.saldo}")
    } else if (opcao == 3 ){
        println("Digite o numero da conta para transferencia")
        val numConta = readLine()!!
        var contaDestino = Conta("Naruto",numConta.toInt())

        println("Digite o valor da transferencia")
        val valor = readLine()!!

        conta.transfere(valor.toDouble(),contaDestino)
        println("Saldo atual: ${conta.saldo}")

    } else {
        println("Opção invalida")
    }

}

