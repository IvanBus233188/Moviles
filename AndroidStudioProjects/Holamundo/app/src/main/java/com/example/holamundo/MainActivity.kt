package com.example.holamundo

fun main(args: Array<String>) {
    println(verificaCadena("nombre"))    // true
    println(verificaCadena("_nombre"))   // true
    println(verificaCadena("_12"))       // true
    println(verificaCadena(""))          // false
    println(verificaCadena("012"))       // false
    println(verificaCadena("no$"))       // false
}

fun verificaCadena(cadena: String): Boolean {
    // No está vacía
    if (cadena.isEmpty()) {
        return false
    }

    // El primer carácter es una letra o un guion bajo (_)
    val primerCaracter = cadena[0]
    if (!primerCaracter.isLetter() && primerCaracter != '_') {
        return false
    }

    // Todos los caracteres consisten de letras, números o guion bajo
    for (caracter in cadena.substring(1)) {
        if (!caracter.isLetterOrDigit() && caracter != '_') {
            return false
        }
    }

    // Cumple con todos los criterios
    return true
}

