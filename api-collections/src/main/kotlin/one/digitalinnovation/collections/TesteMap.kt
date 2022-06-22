package one.digitalinnovation.collections

fun main() {
    val pessoa: Pair<String, Int> = Pair("Joao", 28)
    val map1 = mapOf(pessoa)

    map1.forEach { (key, value) -> println("Nome:  $key - Idade: $value") }

    //Utlizado sintaxe do infix
    val map2 = mapOf(
        "Pedro" to 18,
        "Lara" to 22,
        "Osvaldo" to 25,
    )
    map2.forEach { (key, value) -> println("Nome:  $key \nIdade: $value") }
}