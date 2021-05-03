package one.digitalinnovention.collections

fun main() {
    val values = intArrayOf(2,3,4,1,10,7);

    values.forEach {
        println(it)
    }

    values.sort()
println("---- imprimi orderna-----")
    values.forEach {
        println(it)
    }

}