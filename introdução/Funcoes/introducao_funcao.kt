fun main(){
/* Prefixo Fun nomeDaFunção(nome:Tipo):TipoRetorno{}
funções anônimas, single-line,inline,extensões,Lambdas,
orderm superior;  */

private fun GetFullName(nome:String, lastName:String):String{

    val fullname ="$name $lastName"

    return fullname
}
// simplificando uma função

private fun GetFullName(nome:String, lastName:String):String{
  
    return  "$name $lastName"
}

private fun GetFullName(name:String, lastName:String) =  "$name $lastName"



}