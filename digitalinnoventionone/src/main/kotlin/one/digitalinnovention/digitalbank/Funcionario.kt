package one.digitalinnovention.digitalbank
import one.digitalinnovention.digitalbank.Pessoa
import java.math.BigDecimal

class Funcionario(

    nome: String,
     cpf: String,
    val salario : BigDecimal

): Pessoa(nome,cpf){

}