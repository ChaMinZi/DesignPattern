package ingredient

interface Cheese {
    fun print()
}

class MozzarellaCheese: Cheese {
    override fun print() {
        println("모짜렐라 치즈")
    }
}

class ReggianoCheese: Cheese {
    override fun print() {
        println("레지아노 치즈")
    }
}