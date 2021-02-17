package one.digitalinnovention.digitalbank

import java.math.BigDecimal

class Conta(
    /* Metodo Construtor Primario */

    val  agencia:String,
    val numero : String,
    val saldo:BigDecimal
) {
    fun deposito(valor:BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}