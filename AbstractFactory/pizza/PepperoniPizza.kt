package pizza

import ingredientFactory.PizzaIngredientFactory

class PepperoniPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
        pepperoni = ingredientFactory.createPepperoni()
    }
}