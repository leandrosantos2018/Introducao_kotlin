fun main (){

    
/* o valor atribuido tem estar na ultima linha do bloco.
a condicional pode não usar chaves se só fizer a
a atribuição */

val MaxValue = if(a >b) a else if (a < b) b else b
    val minValue = if(a > b){
        println("b($b) é o menor valor")
        b
    } else if (a < b) {
        println("a($a) é o menor valor")
        a
    }else {
        println("bos valores são iguais")
        b
    }

/* Equivalente ao switch de outras linguagem
aceita tanto valores quanto condicionais
aceita range como case */

//when =  switch case

when {
    a > b -> {}
    a != b && a > c -> {}
    b ==0 -> {}
    else -> {}
}

when(year){
    -4000.. 475 - > // Antiguidade
    476.. 1452 -> //Medieval
    1453..1789 ->//Moderna
    currentYear -> // ano Atual
}

/* Elvis Operator
o mais próximo que a liguagem possui de um operador ternário
verifica se um valor é nulo e apresenta uma opção caso seja.
pode ser encadeado; */

val a:Int? =null        //Nesse caso, se o valor de a não for nulo,
val c:Int? = 9          //number recebe a.
var number = a?: b?: 0 /*se o valor de a for nullo e b não for nulo, 
                        number recebe b
                        se a e b forem nullo recebe 0  */

     var t:Int
     var x:Int? = null
     var o:Int? = 10
     t = x?:w ?:-1

fun Int.getStudentStatus():String{
    println("nota $this")

    return when(this){
    in 0..4 -> "Reprovado"
    in 5..7 ->"mediano"
    in 8..9 ->"Boa"
    else -> "Indefinido"
    }

}




}