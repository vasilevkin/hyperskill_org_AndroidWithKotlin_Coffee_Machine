// Posted from EduTools plugin
fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(time: Int) {
    var time: Int = time
        get() {
           return when {
               field < -128 -> -128
               field > 127 -> 127
               else -> field
           }
//            if (field < -128) -128 else field
//            if (field > 127) 127 else field
        }
//        set(value) {
//            field = if (value > -128) -128 else time
//            field = if (value < 127 ) 127 else time
//
//                    when {
//                time < -128 -> -128
//                time > 127 -> 127
//                else -> time
//            }
//        }
}

//class Client(length: Int) {
//    var length: Int = length
//        set(value) {
//            field = if (length < 0) 0 else length
//        }
//}