// Jose Patricio Galán Rodriguez

// Escribe la tabla de multiplicar de un número introducido
// por el usuario desde teclado, utiliza el bucle for.

fun main() {
    val n1: Int

    print("Introduzca número a multiplicar: ")
    n1 = readln().toInt()

    for ( i in 1..10)println("$n1 * $i = ${n1 * i}")
}