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

}