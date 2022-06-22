package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Logavel as Logavel

class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    private val password: String
) : Funcionario(name = name, cpf = cpf, salary = salary), Logavel {
    override fun calcAuxilio(): Double = salary * 0.4

    override fun login(): Boolean = "senha123" == password

}
