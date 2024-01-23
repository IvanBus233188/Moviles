fun String.esFina(): Boolean {
    val contieneSubcadenas = !contains("bu") && !contains("ba") && !contains("be")
    val contieneTresVocales = count { it.toLowerCase() in "aeiou" } >= 3
    val contieneLetraDoble = toLowerCase().windowed(2).any { it[0] == it[1] }

    return (contieneSubcadenas && contieneTresVocales) ||
            (contieneSubcadenas && contieneLetraDoble) ||
            (contieneTresVocales && contieneLetraDoble)
}

fun main(args: Array<String>) {
    println("bac".esFina())    // false
    println("aza".esFina())    // false
    println("abaca".esFina())  // false
    println("baa".esFina())    // true
    println("aaab".esFina())   // true
}
