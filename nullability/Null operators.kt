fun main(args: Array<String>) {
    var catName: String? = "Chonkers"
    println(catName?.length)
    println(catName?.length?.toString())
    catName = null
    println(catName?.length)
    println(catName?.length?.toString())
}