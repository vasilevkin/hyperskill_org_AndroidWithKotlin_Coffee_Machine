import java.util.*


fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean = (number1+number2) > (number3+number4)


// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}

