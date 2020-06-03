class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate() {
        speed += 5
    }

    fun decelerate() {
        val currentSpeed = speed - 5
        speed = if (currentSpeed < 0)
            0
        else
            currentSpeed
    }
    // write the methods here
}