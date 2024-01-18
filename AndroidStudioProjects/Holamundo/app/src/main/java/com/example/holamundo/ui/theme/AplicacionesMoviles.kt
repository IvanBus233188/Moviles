package com.example.holamundo.ui.theme

fun main() {
    println(verificaCadena("12"))
}

fun verificaCadena(cadena: String): Boolean {
    if (cadena.isEmpty()) {
        return false
    }

    val primerCaracter = cadena[0]
    if (!primerCaracter.isLetter() && primerCaracter != '_') {
        return false
    }

    for (caracter in cadena.substring(1)) {
        if (!caracter.isLetterOrDigit() && caracter != '_') {
            return false
        }
    }

    return true

}