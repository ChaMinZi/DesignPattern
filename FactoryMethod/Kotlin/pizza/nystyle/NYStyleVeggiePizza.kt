package pizza.nystyle

import pizza.Pizza

class NYStyleVeggiePizza : Pizza {
    override val name: String
        get() = "뉴욕 스타일 소스와 도우"
    
    override fun prepare() {
        println("뉴욕 스타일 야채 다듬기")
    }

    override fun bake() {
        println("오븐에 10분 굽기")
    }

    override fun cut() {
        println("8등분 자르기")
    }

    override fun box() {
        println("얇은 박스에 담기")
    }
}
