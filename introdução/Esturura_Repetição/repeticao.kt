fun main (){
    /*while,do..while, for e forEach;
    
    Estrutura similares às convencionais em outras
    linguagem;
    Aceita os comandos In,range,until,downTo e step*/

    // estrutura while

    while(condicao){
        /*enquando for true será executado até a condição seja false, 
        a condição seja false sair do loop */
    }

    // estrutura do..while
    /* while e loops executam seus corpos continuamente
     enquanto sua condição é satisfeita. A diferença entre
     eles é o tempo de verificação da condição: do-while */

    do{
        //bloco
    } while(condicao)// vai rodar seu codigo todo e faz a validação no final

    //Estrutura for

    /* for (varivelIndexadora in /until / downto faixa de avlores / condicoes step intervalos)
   
    In: conta do valor incial até o final estabelecido.
   
    Unil: conta do valor atual ate o valor estabelecido menos 1.
   
    DownTo: conta de maneira decrescente.
   
    Step: determina o intervalo da contagem */

    for(i in 0..20 step 2){
        println(i)
    }
// Exemplos de For

// Step definido intervalo de Contagem( conta dois em dois)
for(i in 0..20 step 2){
    println(i)
}
//contagem descrecente até 0
for(i in 0..10 downTo 0){
    println(i)
}

// conta valores - 1
for(i in 0 until 10){
    println(i)
}

}
// letters

fun letters(){
    var sArray = "Olha essa String !"
    //tamanho do Array
    //casa posição do Array
    for (l in sArray){
        //l[index]
        println(l.toUpperCase())
    }

// função Extensões
    fun letters_(){
        val sArray = "Olha essa String !"
        //tamanho do Array
        //casa posição do Array
        sArray.forEach{l -> 
            println(l + "")
        }
}