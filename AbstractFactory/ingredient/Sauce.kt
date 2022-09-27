package ingredient

interface Sauce {
    fun print()
}

class MarinaraSauce : Sauce {
    override fun print() {
        println("마리나라 소스")
    }
}

class PlumTomatoSauce : Sauce {
    override fun print() {
        println("플럼토마토 소스")
    }
}