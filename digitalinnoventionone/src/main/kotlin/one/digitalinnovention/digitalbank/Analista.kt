package one.digitalinnovention.digitalbank

import java.math.BigDecimal

abstract class Analista(

    nome: String,
    cpf: String,
    salario: Double) : Funcionario (nome, cpf, salario) {

    override fun calcularAuxilio() = salario + (salario * 0.1)
}