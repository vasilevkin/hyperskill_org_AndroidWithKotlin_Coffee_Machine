class Application(val name: String) {

    fun run(parameters: Array<String>) {
        println(name)
        repeat(parameters.size) {
            println(parameters[it])
        }
    }
    // write the run method here
}