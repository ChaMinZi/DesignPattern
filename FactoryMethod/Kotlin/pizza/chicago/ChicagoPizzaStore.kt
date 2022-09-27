package pizza.chicago

import PizzaStore
import pizza.EmptyPizza
import pizza.Pizza

class ChicagoPizzaStore: PizzaStore() {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> ChicagoCheesePizza()
            "veggie" -> ChicagoVeggiePizza()
            "pepperoni" -> ChicagoPepperoniPizza()
            else -> EmptyPizza()
        }
}