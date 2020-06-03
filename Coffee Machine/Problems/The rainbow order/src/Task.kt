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

fun colorNumberInRainbow(color: String) : Int {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return enum.ordinal+1
    }
    return 0
}




fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val color = input.next()

    print(colorNumberInRainbow(color))

    // put your code here
}