class Mocha(b: Beverage) : CondimentDecorator(b) {
    override fun getTotalPrice(): Int {
        return super.getTotalPrice() + 700
    }

    override fun getDescription(): String {
        return super.getDescription() + " + 모카"
    }
}