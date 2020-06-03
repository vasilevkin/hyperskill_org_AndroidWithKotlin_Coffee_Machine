package machine


data class Coffee(val water: Int, val milk: Int, val beans: Int, val price: Int)
data class Storage(var waterAmount: Int, var milkAmount: Int, var beansAmount: Int, var cupsAmount: Int, var cash: Int)

enum class CoffeeMachineStates() {
    ChoosingAnAction,
    ChoosingAVariantOfCoffee
}

class CoffeeMachine() {
    val espresso = Coffee(250, 0, 16, 4)
    val latte = Coffee(350, 75, 20, 7)
    val cappuccino = Coffee(200, 100, 12, 6)

    val storage = Storage(400, 540, 120, 9, 550)


    fun processAction(action: String) {
        when (action) {
            "buy" -> handleBuy()
            "fill" -> handleFill()
            "take" -> handleTake()
            "remaining" -> handleRemaining()
            else -> print("")
        }
    }

    private fun showMachineState() {
        println("\nThe coffee machine has:")
        println("${storage.waterAmount} of water")
        println("${storage.milkAmount} of milk")
        println("${storage.beansAmount} of coffee beans")
        println("${storage.cupsAmount} of disposable cups")
        println("${storage.cash} of money\n")
    }

    private fun updateStorage(coffee: Coffee) {
        when {
            storage.waterAmount < coffee.water -> {
                println("Sorry, not enough water!")
            }
            storage.milkAmount < coffee.milk -> {
                println("Sorry, not enough milk!")
            }
            storage.beansAmount < coffee.beans -> {
                println("Sorry, not enough coffee beans!")
            }
            storage.cupsAmount < 1 -> {
                println("Sorry, not enough cups!")
            }
            else -> {
                println("I have enough resources, making you a coffee!")

                storage.waterAmount -= coffee.water
                storage.milkAmount -= coffee.milk
                storage.beansAmount -= coffee.beans
                storage.cupsAmount -= 1
                storage.cash += coffee.price
            }
        }
    }

    private fun buyCoffee(type: Int) {
        when (type) {
            1 -> updateStorage(espresso)
            2 -> updateStorage(latte)
            3 -> updateStorage(cappuccino)
        }
    }

    private fun handleBuy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        val userChoice = readLine()

        when (userChoice) {
            "1" -> buyCoffee(1)
            "2" -> buyCoffee(2)
            "3" -> buyCoffee(3)
            "back" -> print("")
        }
    }

    private fun handleFill() {

        print("Write how many ml of water do you want to add:")
        val waterAmount = readLine()!!.toInt()
        print("Write how many ml of milk do you want to add:")
        val milkAmount = readLine()!!.toInt()
        print("Write how many grams of coffee beans do you want to add:")
        val beansAmount = readLine()!!.toInt()
        print("Write how many disposable cups of coffee do you want to add:")
        val cupsAmount = readLine()!!.toInt()

        storage.waterAmount += waterAmount
        storage.milkAmount += milkAmount
        storage.beansAmount += beansAmount
        storage.cupsAmount += cupsAmount
    }

    private fun handleTake() {
        println("I gave you \$${storage.cash}")
        storage.cash = 0
    }

    private fun handleRemaining() {
        showMachineState()
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()

    fun askAction(): String {
        print("Write action (buy, fill, take, remaining, exit): ")
        val action = readLine()

        return action!!
    }

    while (true) {
        val action = askAction()

        if (action == "exit")
            break

        coffeeMachine.processAction(action)
    }


//    print("Write how many ml of water the coffee machine has:")
//    val waterAmount = readLine()!!.toInt()
//    print("Write how many ml of milk the coffee machine has:")
//    val milkAmount = readLine()!!.toInt()
//    print("Write how many grams of coffee beans the coffee machine has:")
//    val beansAmount = readLine()!!.toInt()
//    print("Write how many cups of coffee you will need:")
//    val cupsAmount = readLine()!!.toInt()
//
//    val water = cupsAmount * 200
//    val milk = cupsAmount * 50
//    val beans = cupsAmount *15
//
//    val canMakeCupsWater = waterAmount/200
//    val canMakeCupsMilk = milkAmount/50
//    val canMakeCupsBeans = beansAmount/15
//
//    val canMakeCups = arrayOf(canMakeCupsWater, canMakeCupsMilk, canMakeCupsBeans).min()
//
//    if (cupsAmount > canMakeCups!!) {
//        print("No, I can make only $canMakeCups cups of coffee")
//    } else if (cupsAmount == canMakeCups) {
//        print("Yes, I can make that amount of coffee")
//    } else {
//        print("Yes, I can make that amount of coffee (and even ${canMakeCups-cupsAmount} more than that)")
//    }


//    println("For $number cups of coffee you will need:")
//    println("$water ml of water")
//    println("$milk ml of milk")
//    println("$beans g of coffee beans")

//    println("Starting to make a coffee")
//    println("Grinding coffee beans")
//    println("Boiling water")
//    println("Mixing boiled water with crushed coffee beans")
//    println("Pouring coffee into the cup")
//    println("Pouring some milk into the cup")
//    println("Coffee is ready!")
}

