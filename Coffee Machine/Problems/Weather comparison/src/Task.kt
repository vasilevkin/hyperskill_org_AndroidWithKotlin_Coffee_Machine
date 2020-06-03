// Posted from EduTools plugin
class City(val name: String) {
    var average: Int = 0
    var degrees: Int = 0
        get() = if (field < -92 || field > 57)  average else field
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.average = 30
    firstCity.degrees = first
    val secondCity = City("Moscow")
    firstCity.average = 5
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    firstCity.average = 20
    thirdCity.degrees = third


    if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees)
        print(firstCity.name)
    else     if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees)
        print(secondCity.name)
    else     if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees)
        print(thirdCity.name)
    else
        print("neither")
    //implement comparing here
//    print()
}