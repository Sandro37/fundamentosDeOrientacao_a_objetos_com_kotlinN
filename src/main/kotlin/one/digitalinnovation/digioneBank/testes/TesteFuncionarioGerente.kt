package one.digitalinnovation.digioneBank.testes

import one.digitalinnovation.digioneBank.Gerente

fun main() {
    val maria = Gerente("Maria Rodrigues", "1234567899", 5000.0,"senha123")

    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autenticar(maria)
}