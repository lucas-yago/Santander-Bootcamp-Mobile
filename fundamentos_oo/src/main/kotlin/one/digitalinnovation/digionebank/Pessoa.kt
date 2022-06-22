package one.digitalinnovation.digionebank

abstract class Pessoa(
    var name:String,
    var cpf:String
){
    fun pessoaInfo() = "nome: $name \ncpf: $cpf"
}