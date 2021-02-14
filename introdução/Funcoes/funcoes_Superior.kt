fun main(){

    //exemplos
    //val x  calculate(12,4,::sum)
    //val y = calculate(12,4){a,b -> a *b}

    val x:Int
    val z:Int
    
     calculate(34,90){{a,b ->
        println("vou calcular! $a + $b")
         a*b
    }
    
       // println(z)
    }

    
    fun sum(a1:Int,a2:Int) = a1.plus(a2)


    fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Unit){
        val result = operation(n1,n2)
        return result
    }
}