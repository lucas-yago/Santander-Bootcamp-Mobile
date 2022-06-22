package one.digitalinnovation.collections

fun main() {
    val names = Array(3) { "" }
    names[0] = "Maria"
    names[1] = "Zazá"
    names[2] = "José"

    for (name in names) {
        println(name)
    }

    println("-------------------------------")

    names.sort()
    names.forEach { println(it) }

    println("-------------------------------")

    val names2 = arrayOf("Maria", "Zazá", "José")

    for (name in names2) {
        println(name)
    }

    println("-------------------------------")

    names2.sort()
    names2.forEach { println(it) }

}