import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)


    val char = scanner.next().single()
    val bool =
            (char.isUpperCase() || char.isDigit()) && char != '0'

    print(bool)

    // write your code here
}