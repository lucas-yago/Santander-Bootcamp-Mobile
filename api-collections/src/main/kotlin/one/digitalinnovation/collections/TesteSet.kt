package one.digitalinnovation.collections

fun main() {
    val joao = Funcioario("João", 1500.0, "CLT")
    val pedro = Funcioario("Pedro", 4000.0, "CLT")
    val zezo = Funcioario("Zezo", 2000.0, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(zezo)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-----------------------------")
    val funcionarios3 = setOf(joao, pedro, zezo)

    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-----------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}