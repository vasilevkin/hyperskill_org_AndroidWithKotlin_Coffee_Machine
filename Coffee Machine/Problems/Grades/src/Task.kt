import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val quantity = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(quantity) {
        when(scanner.nextInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++

        }
    }
    print("$d $c $b $a")

    // put your code here
}