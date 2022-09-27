package pizza.nystyle

import PizzaStore
import pizza.EmptyPizza
import pizza.Pizza

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> NYStyleCheesePizza()
            "veggie" -> NYStyleVeggiePizza()
            "pepperoni" -> NYStylePepperoniPizza()
            else -> EmptyPizza()
        }
}