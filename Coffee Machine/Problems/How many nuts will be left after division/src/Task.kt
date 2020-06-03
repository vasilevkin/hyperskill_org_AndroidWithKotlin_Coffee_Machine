import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val squirrels = scanner.nextInt()
    val nuts = scanner.nextInt()

    print(nuts%squirrels)
    // put your code here

}