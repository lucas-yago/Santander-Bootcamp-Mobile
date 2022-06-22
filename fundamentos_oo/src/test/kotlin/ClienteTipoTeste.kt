import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
       ClienteTipo.values().forEach {elemento -> println("$elemento --- ${elemento.descricao} ")}
       ClienteTipo.values().forEach {println("$it --- ${it.descricao}")}

       val pf = ClienteTipo.PF
       println(">> $pf --- ${pf.descricao}")

       val pj = ClienteTipo.PJ
       println(">> $pj --- ${pj.descricao}")



}