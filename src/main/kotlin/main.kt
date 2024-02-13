import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val s: String? = null

    // println(s?.length) // Exceção NullPointerException é tratada por padrão
    // println("dsfsdfgsdfg")

    println(s!!.length) // Estou assumindo o erro e recebendo a Exceção NullPointerException

    val abc = readLine() // Pode retornar null
    if (abc != null && abc != ""){ // É opcional verificar se é null

    }

}