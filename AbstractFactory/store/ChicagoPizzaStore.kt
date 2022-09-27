package store

import ingredientFactory.ChicagoIngredientFactory
import pizza.*

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = ChicagoIngredientFactory()

        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "시카고 스타일 치즈 피자" }
            "veggie" -> VeggiePizza(ingredientFactory).apply { name = "시카고 스타일 야채 피자" }
            "pepperoni" -> PepperoniPizza(ingredientFactory).apply { name = "시카고 스타일 페퍼로니 피자" }
            else -> EmptyPizza()
        }
    }
}