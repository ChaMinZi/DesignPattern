package ingredient

interface Veggies {
    fun print()
}

class Garlic : Veggies {
    override fun print() {
        println("마늘")
    }
}

class Onion : Veggies {
    override fun print() {
        println("양파")
    }
}

class Mushroom : Veggies {
    override fun print() {
        println("버섯")
    }
}

class RedPepper : Veggies {
    override fun print() {
        println("고추")
    }
}

class BlackOlive : Veggies {
    override fun print() {
        println("블랙 올리브")
    }
}

class EggPlant : Veggies {
    override fun print() {
        println("가지")
    }
}