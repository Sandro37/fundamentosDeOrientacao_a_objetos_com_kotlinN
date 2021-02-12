package one.digitalinnovation.digioneBank

class Pessoa {
    var nome:String = "Jether"

    var cpf:String = "123.123.123-11"
    private  set

}

fun main() {
    val jether = Pessoa()
    jether.nome = "ama"
    jether.cpf = "4"
    println(jether.nome)
    println(jether.cpf)
}