fun String?.esVaciaONula(): Boolean {
    return this == null || this.trim().isEmpty()
}

fun main() {
    val s1: String? = null
    val s2: String? = ""
    val s3 = "  "

    println(s1.esVaciaONula())
    println(s2.esVaciaONula())
    println(s3.esVaciaONula())
}
