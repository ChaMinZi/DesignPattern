package ingredientFactory

import ingredient.*

class ChicagoIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(
            EggPlant(), Garlic(), BlackOlive()
        )
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }
}