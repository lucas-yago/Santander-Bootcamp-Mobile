package one.digitalinnovation.collections

data class Funcioario(
    val name: String, val salary: Double, val tipoContratacao: String
) {
    override fun toString(): String = """
        Nome:     $name
        Salario:  $salary
        tipo:     $tipoContratacao
    """.trimIndent()
}