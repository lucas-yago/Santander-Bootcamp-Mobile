package one.digitalinnovation.digionebank

abstract class Funcionario(
    name: String,
    cpf: String,
    val salary: Double
) : Pessoa(name, cpf) {
    protected abstract fun calcAuxilio(): Double

    override fun toString(): String = """ 
        Nome: $name
        Cpf: $cpf
        Salário: $salary
        Auxílio: ${calcAuxilio()}
    """.trimIndent()
}