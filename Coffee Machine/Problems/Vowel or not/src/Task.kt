import java.util.Scanner


fun isVowel(letter: Char): Boolean = "AEIOUaeiou".indexOf(letter) != -1


// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

