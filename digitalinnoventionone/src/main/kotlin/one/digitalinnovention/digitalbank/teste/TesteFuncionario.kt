package one.digitalinnovention.digitalbank.teste

import one.digitalinnovention.digitalbank.Funcionario
import one.digitalinnovention.digitalbank.Pessoa
import java.math.BigDecimal

fun main() {

    val Leandro = Pessoa(nome = "Leandro Ramos",cpf = "000.000.000.-00")

    println(Leandro.nome)
    println(Leandro.cpf)

    val joao = Funcionario("Leandro Ramos ","000.000.000.-00", BigDecimal.valueOf(1000.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}