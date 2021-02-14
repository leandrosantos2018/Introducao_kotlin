package one.digitalinnovention.digitalbank

class Pessoa {
    var nome: String ="Leandro"
    var cpf:String ="145.255.164-78"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val Leandro = Pessoa()

    println(Leandro.pessoaInfo())

}