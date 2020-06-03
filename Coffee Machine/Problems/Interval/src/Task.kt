import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()


    var bool = false

    if ((number > -15) && (number <=12)) {bool = true}
    if ((number > 14) && (number <17)) {bool = true}
    if ((number >= 19)) {bool = true}
    if (bool)
////             ((number > -15) || (number <=12))
//            (number in -15..13)
//                    || (number in 14..17) || (number >=19))
        print("True")
    else
        print("False")
    // write your code here
}