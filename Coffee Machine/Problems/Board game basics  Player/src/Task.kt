// Posted from EduTools plugin
class Player(val id: Int, val name: String, val hp: Int) {

    companion object {
        fun create(name: String): Player {
            return Player(uniqueId(), name, 100)
        }

        fun uniqueId() : Int {
            return (1..1000).random()
        }
    }
}