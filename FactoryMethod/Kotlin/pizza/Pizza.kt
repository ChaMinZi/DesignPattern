package pizza

interface Pizza {
    val name: String

    fun prepare()
    fun bake()
    fun cut()
    fun box()
}