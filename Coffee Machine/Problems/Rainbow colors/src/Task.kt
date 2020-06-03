// Posted from EduTools plugin
import java.util.Scanner


enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")

    ;

}

fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val color = input.next()

    println(isRainbow(color))


    // put your code here
}