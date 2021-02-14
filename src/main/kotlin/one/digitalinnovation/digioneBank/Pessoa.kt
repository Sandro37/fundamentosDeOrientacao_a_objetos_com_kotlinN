package one.digitalinnovation.digioneBank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123-11"
    private  set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)

    println(jether.pessoaInfo())
}