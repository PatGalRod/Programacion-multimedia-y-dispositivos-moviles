// Jose Patricio Galán Rodriguez

// Crea un programa que permita al usuario introducir cadenas de texto y las guarde en una lista,
// hasta terminar con “fin” (que no se almacenará). A continuación,
// muestra la lista en orden inverso (del último dato al primero).
// Finalmente, muéstrala en su orden normal usando .forEach.

fun main() {
    val strings : MutableList<String> = mutableListOf()
    var userInput: String

    println("A continuación se guardarán las siguientes cadenas de" +
            "texto que introduzca, teclee fin para salir")

    do {
        userInput = readln()

        if (userInput != "fin") {
            strings += userInput
        }

    } while (userInput != "fin")

    strings.asReversed().forEach { println(it) }
    strings.forEach { println(it) }
}