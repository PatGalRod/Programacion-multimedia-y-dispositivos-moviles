// Jose Patricio Galán Rodriguez

// Crea una función que permita saber si un cierto número,
// que se le pase como parámetro, es primo.
// Úsala desde el programa principal.

fun EsPrimo( n1: Int): Boolean {
    if (n1 <= 1) return false

    for (i in 2..n1/2){
        if (n1 % i == 0) {
            return false;
        }
    }

    return true
}

fun main() {
    val n1 = 47
    print(EsPrimo(n1))
}