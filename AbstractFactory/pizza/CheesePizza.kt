package pizza

import ingredientFactory.PizzaIngredientFactory

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}