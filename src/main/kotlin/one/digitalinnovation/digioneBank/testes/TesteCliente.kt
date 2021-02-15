package one.digitalinnovation.digioneBank.testes

import one.digitalinnovation.digioneBank.Cliente
import one.digitalinnovation.digioneBank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    TesteAutenticacao().autenticar(jose)
}