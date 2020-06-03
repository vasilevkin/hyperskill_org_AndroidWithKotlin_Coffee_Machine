import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val name = when (scanner.nextInt()) {
        in 1..4 -> "few"
        in 5..9 -> "several"
        in 10..19 -> "pack"
        in 20..49 -> "lots"
        in 50..99 -> "horde"
        in 100..249 -> "throng"
        in 250..499 -> "swarm"
        in 500..999 -> "zounds"
        in 1000..Int.MAX_VALUE -> "legion"
        else -> "no army"
    }

    println(name)

    // write your code here
}