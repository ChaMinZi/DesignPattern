package ingredient

interface Dough {
    fun print()
}

class ThickCrustDough : Dough {
    override fun print() {
        println("두꺼운 크러스트 도우")
    }
}

class ThinCrustDough : Dough {
    override fun print() {
        println("씬 크러스트 도우")
    }
}