open abstract class CondimentDecorator(b: Beverage) : Beverage by b {
    private var base: Beverage = b

    override fun getTotalPrice(): Int {
        return base.getTotalPrice()
    }

    override fun getDescription(): String {
        return base.getDescription()
    }

    protected fun getBase() : Beverage {
        return base
    }
}