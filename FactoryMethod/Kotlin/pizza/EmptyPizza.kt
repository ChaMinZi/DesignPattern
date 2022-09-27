package pizza

class EmptyPizza : Pizza {
    override val name: String
        get() = "잘못된 주문"

    override fun prepare() {
        println("준비 X")
    }

    override fun bake() {
        println("피자 X")
    }

    override fun cut() {
        println("피자 X")
    }

    override fun box() {
        println("박스 X")
    }
}