package one.digitalinnovention.digitalbank
import one.digitalinnovention.digitalbank.Pessoa
import java.math.BigDecimal

 abstract class Funcionario(

    nome: String,
     cpf: String,
    val salario : Double

): Pessoa(nome,cpf){

 protected   abstract fun CalculoAuxilio():Double
     abstract fun calcularAuxilio(): Double
 }