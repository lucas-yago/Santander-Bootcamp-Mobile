package one.digitalinnovation.digionebank

class Analista(name: String, cpf: String, salary: Double) : Funcionario(name, cpf, salary) {
    override fun calcAuxilio():Double = salary * 0.1
}