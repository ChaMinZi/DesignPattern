class Water(b: Beverage) : CondimentDecorator(b) {
    override fun getTotalPrice(): Int {
        return super.getTotalPrice()
    }

    override fun getDescription(): String {
        return super.getDescription() + " + 생수"
    }
}