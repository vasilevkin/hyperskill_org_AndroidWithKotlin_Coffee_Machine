import java.util.Scanner

fun sum(a: Int, b: Int, c: Int) = a+b+c

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}

