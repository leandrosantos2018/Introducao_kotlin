package one.digitalinnovention.digitalbank

abstract class Pessoa (
   val nome: String,
   val cpf: String
        ) {
    abstract fun CalculoAuxilio(): Double
}