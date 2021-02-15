package one.digitalinnovation.digioneBank.testes

import one.digitalinnovation.digioneBank.Analista
import one.digitalinnovation.digioneBank.Funcionario
import one.digitalinnovation.digioneBank.testes.ImprimeRelatorioFuncionario.Companion.imprime

fun main() {
    val joao = Analista("Jether Rodrigues", "1234567899", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}