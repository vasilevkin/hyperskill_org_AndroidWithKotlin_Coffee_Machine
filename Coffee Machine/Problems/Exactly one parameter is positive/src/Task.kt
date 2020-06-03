import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()

    var bool = 0


if (n1 > 0 ) bool += 1
if (n2 > 0 ) bool += 1
if (n3 > 0 ) bool += 1

    if (bool == 1) print(true) else print(false)

    // put your code here
}