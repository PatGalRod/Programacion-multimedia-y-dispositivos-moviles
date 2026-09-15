// Jose Patricio Galán Rodriguez

// Prepara un array con los días de la semana. El usuario introducirá un número del 1 al 7
// y le mostrarás el día correspondiente. Si introduce un valor incorrecto,
// le mostrarás los 7 valores aceptables (“1 = lunes”, etc).

fun main() {
    val dayNumber : Int
    val days = arrayOf("Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes", "Sabado", "Domingo")

    print("Introduzca un número del 1 al 7: ")
    dayNumber = readln().toInt()

    val result = if (dayNumber > 0 && dayNumber < 8)"${days[dayNumber - 1]}"
        else "1 = lunes, 2 = martes, 3 = miercoles, 4 = jueves, 5 = viernes, " +
            "6 = sabado, 7 = domingo"

    print(result)
}
