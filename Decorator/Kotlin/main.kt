fun main() {
    var beverage: Beverage = Espresso()
    beverage = Water(beverage)
    println("가격 : ${beverage.getTotalPrice()}\n설명 : ${beverage.getDescription()} ")

    var MochaLatte: Beverage = DarkRoast()
    MochaLatte = Milk(MochaLatte)
    MochaLatte = Mocha(MochaLatte)
    println("가격 : ${MochaLatte.getTotalPrice()}\n설명 : ${MochaLatte.getDescription()} ")
}
