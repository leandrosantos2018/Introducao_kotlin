package one.digitalinnovention.digitalbank.teste

import one.digitalinnovention.digitalbank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigitalOne",numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

  val banco2 = digiOneBank.copy(nome = "banco2")

    println(banco2.info())



}