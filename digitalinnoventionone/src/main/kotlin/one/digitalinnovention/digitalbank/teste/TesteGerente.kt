package one.digitalinnovention.digitalbank.teste

import one.digitalinnovention.digitalbank.Funcionario
import one.digitalinnovention.digitalbank.Pessoa
import java.math.BigDecimal
import one.digitalinnovention.digitalbank.Analista as Analista

fun main() {

    val maria = Gerente("Maria Ramos ","145.022.000.-10",5000.00)

    imprimiRelatorio(maria)
}
fun imprimiRelatorio(funcionario : Funcionario) = println(funcionario.toString())
