package one.digitalinnovention.digitalbank

abstract class Gerencia (nome: String, CPf : String, Salario : Double
    ) :Funcionario(nome = nome,cpf = CPf,salario = Salario){

    override fun calcularAuxilio(): Double = Salario * 0.4
    }

