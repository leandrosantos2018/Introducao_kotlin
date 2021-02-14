fun main (){

    /* if/else ,when, elvis operator
    Pode ser ultizado tando para controle quanto para atribuição.
    Pode ser encadeado com múltiplas estrutura; */

    // ultilizando  if e else
    //extressao for true vai ser executado
    if(expressao){
    // bloco de condigo
    } else if (expressao2){
        //bloco de codigo
    } else{ // else quando for false
        // bloco de codigo
    }

    // when =  Switch case

    when {
        case1 -> {}
        case2 -> {}
        case3 -> {}
        else ->{}
    }
 
    //operator

    // number  não pode recebe nullo

    val a:Int? = null // se a é nullo
    var number = a ?: 0 // a for nulo vai setado valor 0

}