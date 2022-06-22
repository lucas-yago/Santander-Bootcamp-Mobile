import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco( number = 12 ,name = "DigiOne")
    println(digiOneBank.name)
    println(digiOneBank.number)

    val digiBank = digiOneBank.copy(name = "alternativeBank")
    println(digiBank.info())
}