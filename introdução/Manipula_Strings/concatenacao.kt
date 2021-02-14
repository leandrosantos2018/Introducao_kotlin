//funcao principal
fun main() {

    var name = "ana"
    val s = "Olá"
    val welcome = "Bem Vinda(o)"
    
    println(s + name)
    //imprime OláAna
    
    println("${s}, ${name}!")
    //imprime Olá, ana !
    
    println("Bem Vinda(o), $name !")
    // imprime Bem Vinda(o), Ana !

    name = "luisa"

    println("$welcome, ${name.capitalize()}!") // primeira letra na String vai ser Maiuscula


    

    
    
}