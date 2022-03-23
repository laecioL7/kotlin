public fun testaComportamentosConta() {
    //println("Qual o seu nome: ")
    //val nomeInput = readLine()!!
    println("Olá: Cliente")

    val conta = Conta(titular = "Levi", numero = 2024)
    conta.depositar(25.0)

    println("Seu saldo é: ${conta.saldo}")

    var continuar = "S"

    while (continuar.equals("S", ignoreCase = true)) {

        realizarOperacoes(conta)

        println("Deseja continuar? S - sim | N - não")
        continuar = readLine()!!

        if (continuar.equals("S", true)) {
            println("Nova operação")
        }
    }

    println("Saldo final: ${conta.saldo}")
}