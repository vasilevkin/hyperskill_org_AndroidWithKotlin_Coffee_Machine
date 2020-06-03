import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var cash = scanner.nextInt()

    while (scanner.hasNext()) {
        val purchase = scanner.nextInt()

        if (cash < purchase) {
            print("Error, insufficient funds for the purchase. You have $cash, but you need $purchase.")
            cash -= purchase
            break
        } else {
            cash -= purchase
        }
    }
    if (cash >= 0)
        println("Thank you for choosing us to manage your account! You have $cash money.")

    // write your code here
}