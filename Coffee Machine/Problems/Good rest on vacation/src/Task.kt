import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val duration = scanner.nextInt()
    val food = scanner.nextInt()
    val flight = scanner.nextInt()
    val night = scanner.nextInt()

    val cost = duration * food + flight * 2 + (duration - 1) * night
    print(cost)
    // put your code here
}