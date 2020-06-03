import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstName = scanner.next()
    val lastName = scanner.next()
    val age = scanner.nextInt()

    print("${firstName.capitalize().first()}. $lastName, $age years old")
    // put your code here
}