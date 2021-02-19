package one.digitalinnovention.digitalbank
import one.digitalinnovention.digitalbank.Pessoa
import java.math.BigDecimal

 abstract class Funcionario(

    nome: String,
     cpf: String,
    val salario : BigDecimal

): Pessoa(nome,cpf){

    abstract fun CalculoAuxilio()

}