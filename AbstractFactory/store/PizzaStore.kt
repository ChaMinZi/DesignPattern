package store

import pizza.Pizza

abstract class PizzaStore {
    private lateinit var pizza: Pizza

    fun orderPizza(type: String): Pizza {
        pizza = createPizza(type)

        return pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    fun printPizzaToppings() {
        pizza.dough?.print()
        pizza.sauce?.print()
        pizza.cheese?.print()
        pizza.veggies?.forEach {
            it.print()
        }
        pizza.pepperoni?.print()
    }

    abstract fun createPizza(type: String): Pizza
}