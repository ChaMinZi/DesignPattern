class Milk(b: Beverage) : CondimentDecorator(b) {
    override fun getTotalPrice(): Int {
        return super.getTotalPrice()+500
    }

    override fun getDescription(): String {
        return super.getDescription()+" + 우유"
    }
}
