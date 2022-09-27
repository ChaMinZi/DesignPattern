import pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)

        return pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    abstract fun createPizza(type: String): Pizza
}