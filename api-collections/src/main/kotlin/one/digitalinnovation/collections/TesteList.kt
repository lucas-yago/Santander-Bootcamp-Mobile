package one.digitalinnovation.collections

fun main() {

    val joao = Funcioario("João", 1500.0, "CLT")
    val pedro = Funcioario("Pedro", 4000.0, "CLT")
    val zezo = Funcioario("Zezo", 2000.0, "PJ")

    val funcionarios = listOf<Funcioario>(joao, pedro, zezo)

    funcionarios.forEach { println(it.toString()) }

    println("---------------find-----------------")

    println(funcionarios.find { it.name == "Zezo" })

    println("---------------sortedBy-----------------")
    funcionarios
        .sortedBy { it.salary }
        .forEach { println(it) }

    println("--------------groupBy-----------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

