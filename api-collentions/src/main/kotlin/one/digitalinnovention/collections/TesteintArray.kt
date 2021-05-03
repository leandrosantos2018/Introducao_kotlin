package one.digitalinnovention.collections

fun main(){

    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    print("----interação com for---\n")
    for(valor in values){
        println(valor)
    }
        print("------Segunda interação Percorrendo ARRAY-------\n")
    values.forEach { valor ->
        println(valor)
    }
    print("------interação com index-----\n")
    for (index in values.indices){
        println(values[index])
    }

    values.sort()

    print("------interação  prinit ordenado-----\n")
    for (valor in values){
        println(valor)
    }
}
