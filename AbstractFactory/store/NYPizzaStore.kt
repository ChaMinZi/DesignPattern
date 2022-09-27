package store

import ingredientFactory.NYPizzaIngredientFactory
import pizza.*

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val ingredientFactory = NYPizzaIngredientFactory()

        return when (type) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = "뉴욕 스타일 치즈 피자" }
            "veggie" -> VeggiePizza(ingredientFactory).apply { name = "뉴욕 스타일 야채 피자" }
            "pepperoni" -> PepperoniPizza(ingredientFactory).apply { name = "뉴욕 스타일 페퍼로니 피자" }
            else -> EmptyPizza()
        }
    }
}