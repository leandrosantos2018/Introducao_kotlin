package one.digitalinnovention.digitalbank

abstract class Gerencia (
    nome: String,
    CPf : String,
    Salario : Double,
    val senha : String
    ) :Funcionario(nome = nome,cpf = CPf,salario = Salario){

    override fun calcularAuxilio(): Double = salario * 0.4
    }

