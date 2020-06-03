import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.nextLong()
    val operation = scanner.next().single()
    val secondNumber = scanner.nextLong()

    val resultString = when (operation) {
        '+' -> (firstNumber + secondNumber).toString()
        '-' -> (firstNumber - secondNumber).toString()
        '/' -> {
            if (secondNumber.toInt() == 0)
                "Division by 0!"
            else
                (firstNumber / secondNumber).toString()
        }
        '*' -> (firstNumber * secondNumber).toString()
        else -> "Unknown operator"
    }

    print(resultString)

    // write your code here
}