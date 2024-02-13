fun main() {

    val str: String? = null

    // Podemos diminuir esse código com o operador Elvis ?:
    if (str != null) {
        println("nulo")
    } else {
        println(str)
    }

    println(str ?: "null") // Operador Elvis verifica se a variável é nula e imprime ou lança uma função da direita

    // Em Kotlin não existe operador ternário por que o If Else já retornam um valor
    val idade = 18
    // val str1 = idade > 18 ? "Maior de idade" : "Menor de idade"
    var str1 = if (idade > 18) "Maior de idade" else "Menor de idade" // if else Já retornam valor

}