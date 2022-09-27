import pizza.chicago.ChicagoPizzaStore
import pizza.nystyle.NYPizzaStore

fun main() {
    val nyPizza = NYPizzaStore().orderPizza("cheese")
    println("에단이 주문한 ${nyPizza.name}\n")

    val chicagoPizza = ChicagoPizzaStore().orderPizza("cheese")
    println("조엘이 주문한 ${chicagoPizza.name}")
}