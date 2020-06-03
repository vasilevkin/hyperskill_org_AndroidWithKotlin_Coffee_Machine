// Posted from EduTools plugin
import java.util.*

enum class Currency {
    Euro,
    CFAfranc,
    EasternCaribbeandollar,
    Canadiandollar,
    Australiandollar,
    Brazilianreal,
}


fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val countries = mapOf<String, Currency>(
            "Germany" to Currency.Euro,
            "Mali" to Currency.CFAfranc,
            "Dominica" to Currency.EasternCaribbeandollar,
            "Canada" to Currency.Canadiandollar,
            "Spain" to Currency.Euro,
            "Australia" to Currency.Australiandollar,
            "Brazil" to Currency.Brazilianreal,
            "Senegal" to Currency.CFAfranc,
            "France" to Currency.Euro,
            "Grenada" to Currency.EasternCaribbeandollar,
            "Kiribati" to Currency.Australiandollar
    )

    val country1 = input.next()
    val country2 = input.next()

    print(countries[country1] == countries[country2])

    // put your code here
}