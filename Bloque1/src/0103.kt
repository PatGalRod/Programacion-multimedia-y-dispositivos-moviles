// Jose Patricio Galán Rodriguez

// Muestra el nombre de un día de la semana a partir de su número (del 1 al 7),
// usando when. El sábado y el domingo deberán aparecer como
// “fin de semana” y se deberá avisar si el número no es válido.

fun main() {
    var diaSemana: Int

    print("Introduzca un número: ")
    diaSemana = readln().toInt()

    val nombreDia = when (diaSemana){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6, 7 -> "fin de semana"
        else -> "Número no válido"
    }

    println(nombreDia)
}