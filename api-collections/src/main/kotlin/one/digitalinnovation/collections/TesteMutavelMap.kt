package one.digitalinnovation.collections

fun main() {
    val joao = Funcioario("João", 1500.0, "CLT")
    val pedro = Funcioario("Pedro", 4000.0, "CLT")
    val zezo = Funcioario("Zezo", 2000.0, "PJ")

    val repositorio = Repositorio<Funcioario>()

    repositorio.create(joao.name, joao)
    repositorio.create(pedro.name, pedro)
    repositorio.create(zezo.name, zezo)

    println(repositorio.findById(joao.name))

    println("--------------------------------")
    repositorio.findAll().forEach { println(it) }


    println("--------------------------------")
    repositorio.remove(zezo.name)
    repositorio.findAll().forEach { println(it) }

}