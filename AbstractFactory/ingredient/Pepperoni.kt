package ingredient

interface Pepperoni {
    fun print()
}

class SlicedPepperoni() : Pepperoni {
    override fun print() {
        println("슬라이스 된 페퍼로니")
    }
}