package pizza

import ingredient.*

abstract class Pizza {
    var name: String = ""

    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: List<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null

    abstract fun prepare()

    open fun bake() {
        println("175도로 25분간 굽기")
    }

    open fun cut() {
        println("피자를 사선으로 자르기")
    }

    open fun box() {
        println("상자에 피자 담기")
    }
}