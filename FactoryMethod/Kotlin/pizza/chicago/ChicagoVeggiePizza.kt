package pizza.chicago

import pizza.Pizza

class ChicagoVeggiePizza : Pizza {
    override val name: String
        get() = "시카고 스타일 딥 디쉬 야채 피자"

    override fun prepare() {
        println("시카고 피자 치즈 준비 + 야채 다듬기")
    }

    override fun bake() {
        println("화덕 오븐에 20분 굽기")
    }

    override fun cut() {
        println("5등분으로 자르기")
    }

    override fun box() {
        println("두꺼운 박스에 담기")
    }
}
