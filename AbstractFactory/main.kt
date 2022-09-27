import store.ChicagoPizzaStore
import store.NYPizzaStore

fun main() {
    val nyPizzaStore = NYPizzaStore()
    val nyPizza = nyPizzaStore.orderPizza("cheese")
    println("에단이 주문한 ${nyPizza.name}")
    println("토핑 구성:")
    nyPizzaStore.printPizzaToppings()
    println()

    val chicagoPizzaStore = ChicagoPizzaStore()
    val chicagoPizza = chicagoPizzaStore.orderPizza("pepperoni")
    println("조엘이 주문한 ${chicagoPizza.name}")
    println("토핑 구성:")
    chicagoPizzaStore.printPizzaToppings()

    println()
    val nullPizza = chicagoPizzaStore.orderPizza("cheeze")
}