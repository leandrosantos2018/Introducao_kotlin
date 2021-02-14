fun main(){

/* função sngle-line
 */

 private fun getFullname(name:String,lastName:String) = "$name $lastName"

 //##funções Extenções

/* Prexifo fun tipo.nomeDaFuncao();
criar uma função que só ser chamada por um 
tipo específico,cujo o valor pode ser referenciado dentro
da função através da palavra this; */

fun String.randomCapitalizedLetter()=
    this.[(0..this.length-1).random()].toUpperCase()


}