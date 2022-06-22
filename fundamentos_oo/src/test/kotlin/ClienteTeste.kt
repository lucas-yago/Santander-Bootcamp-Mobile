import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val josias = Cliente("Boneco Josias", "123.123.123-23", ClienteTipo.PF,"123456")

    print(josias)

    AutenticacaoTeste().authentication(josias)
}