package one.digitalinnovation.digioneBank.testes

import one.digitalinnovation.digioneBank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}