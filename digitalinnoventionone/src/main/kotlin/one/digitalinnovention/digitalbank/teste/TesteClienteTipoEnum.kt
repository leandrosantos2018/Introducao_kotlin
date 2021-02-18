package one.digitalinnovention.digitalbank.teste

import one.digitalinnovention.digitalbank.ClienteTipo
import kotlin.collections.forEach as forEach1

fun main() {
    ClienteTipo.values().forEach1 { elemento ->
        println("${elemento.name} - ${elemento.descricao}")

    }


    ClienteTipo.values().forEach1 {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")


    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}