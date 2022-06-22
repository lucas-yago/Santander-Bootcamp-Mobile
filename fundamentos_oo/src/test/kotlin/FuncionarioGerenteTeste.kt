import one.digitalinnovation.digionebank.Gerente

fun main() {
    val pedro = Gerente("Pedro Pedrosa", "123.123.123-12", 5000.0, "senha123")
    PrintReportFunctionary.print(pedro)
    pedro.login()
    AutenticacaoTeste().authentication(pedro)
}