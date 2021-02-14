fun main (){
    // Metodos de comparação;
    //String está Vazia, em branco ou é nula?

    val s =""
    println(s.isEmpty())
    //true

    println(s.isBlank()
    //true

    println(s.isNullOrBlank() || 
        s.isNullOrEmpty())

    //true

    ///

    val S= "   "
    println(S.isEmpty())
    //false
    println(S.isBlank())
    //true
   
    val empty=""
    println(empty.length)
    
    val blank ="      "
    println(blank.length)
    
    println(empty.isEmpty())
}