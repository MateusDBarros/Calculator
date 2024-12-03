import java.text.DecimalFormat
import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val df = DecimalFormat("#.##")
        var resultado = 0.0


        System.out.printf("Digite o primeiro numero: ")
        val a = scanner.nextDouble()
        System.out.printf("Qual operação deseja realizar(+ - * /)? ")
        val op = scanner.next()[0]
        System.out.printf("Digite o segundo numero: ")
        val b = scanner.nextDouble()

        when (op) {
            '+' -> {
                resultado = a + b
                println("Soma = $resultado")
            }

            '-' -> {
                resultado = a - b
                println("Subtração = $resultado")
            }

            '*' -> {
                resultado = a * b
                println("Multiplicação = $resultado")
            }

            '/' -> if (a == 0.0 || b == 0.0) println("Impossivel dividir por zero!")
            else {
                resultado = a / b

                println("Divisão = " + df.format(resultado))
            }

            else -> println("Operador invalido!")
        }
    }
}