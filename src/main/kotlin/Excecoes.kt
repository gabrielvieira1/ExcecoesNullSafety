import java.lang.ArithmeticException
import java.lang.Exception

fun main() {

    try {

        val s: String? = null
        println(s!!.length)

        val a = 10 / 0

    } catch (e: NullPointerException) {
        println("Variável nula!")
    } catch (e: ArithmeticException) {
        println("Impossivel dividir por zero!")
    } catch (e: Exception) { // A exceção mais generica fica por último
        println("Generica")
    } finally {
        println("Finally") // Sempre vai ser executado
    }

    println("Fim.")

}