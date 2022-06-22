package one.digitalinnovation.digionebank

data class Banco (
    val name: String,
    val number: Int
){
    fun info() = "$name - $number"
}