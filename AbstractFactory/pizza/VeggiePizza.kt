package pizza

import ingredientFactory.PizzaIngredientFactory

class VeggiePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}