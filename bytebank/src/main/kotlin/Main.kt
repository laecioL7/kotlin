fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank!")


}

/**Imprime conta Objeto*/
private fun imprimeConta(){
    val contaNaruto = Conta()
    contaNaruto.titular = "Naruto"
    contaNaruto.numeroDaConta = 2024
    contaNaruto.saldo = 5.0

    println(contaNaruto.titular)
    println(contaNaruto.numeroDaConta)
    println(contaNaruto.saldo)
}

/** Loop */
private fun listarContas() {
    //Tipo explicito
    val titular: String = "Tanjiro"
    val numeroConta = 2010
    var saldo = 0.0

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    saldo = 200.00
    saldo += 50.0
    println("Saldo da conta depois: $saldo")

    for (i in 1..5) {
        println("Titular $i: $titular")
        println("Numero da conta $i: $numeroConta")
        println("Saldo da conta $i: $saldo")
    }

    for (i in 6 downTo 1) {

        if (i == 4){
            //pula para o próximo
            continue
        }

        if (i == 2)
            break

        println("Titular $i: $titular")
        println("Numero da conta $i: $numeroConta")
        println("Saldo da conta $i: $saldo")
    }
}

/**Condiçoes*/
fun testaCondicoes(saldo: Double) {
    /*if (saldo > 0.0){
    println("A conta esta positiva")
}else if(saldo == 0.0){
    println("Conta neutra")
}else{
    println("Conta negativa")
}*/

    // ^ De cima virou isso:
    when {
        saldo > 0 -> println("A conta esta positiva")
        saldo == 0.0 -> println("A conta esta neutra")
        else -> println("Conta está negativa")
    }
}