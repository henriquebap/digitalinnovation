package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Henrique"
    var cpf : String = "123.123.123-12"

}

fun main() {
    val henrique = Pessoa()

    println(henrique.nome)
    println(henrique.cpf)
}
