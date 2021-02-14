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

}