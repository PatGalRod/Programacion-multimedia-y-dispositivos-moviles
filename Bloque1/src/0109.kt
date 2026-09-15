// Jose Patricio Galán Rodriguez

// Crea una clase de datos “coche” con marca, modelo y año de lanzamiento.
// Crea dos objetos de esa clase.

fun main() {
    class Coche(val marca : String, val modelo: String, val anyoLanzamiento: Int) {
        fun descripcion(): String = "$marca $modelo ($anyoLanzamiento)"
    }

    val coche1 = Coche("Seat", "León", 2005)
    val coche2 = Coche("Honda", "Civic", 2020)

    println(coche1.descripcion())
    println(coche2.descripcion())
}