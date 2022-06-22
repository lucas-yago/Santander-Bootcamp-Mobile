package one.digitalinnovation.collections

fun main() {
    val joao = Funcioario("João", 1500.0, "CLT")
    val pedro = Funcioario("Pedro", 4000.0, "CLT")
    val zezo = Funcioario("Zezo", 2000.0, "PJ")

    println("--------------Mutable-List-Of-----------------")
    val funcionarios = mutableListOf<Funcioario>(joao, zezo)
    funcionarios.forEach { println(it) }

    println("-------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------------------------------")
    funcionarios.remove(zezo)
    funcionarios.forEach { println(it) }

    println("--------------Mutable-Set-Of-----------------")

    val funcionariosSet = mutableSetOf<Funcioario>(joao)
    //funcionariosSet.forEach { println(it) }
    funcionariosSet.add(pedro)
    funcionariosSet.add(zezo)
    funcionariosSet.forEach { println(it) }

    println("-------------------------------")

    funcionariosSet.remove(zezo)
    funcionariosSet.forEach { println(it) }
}
