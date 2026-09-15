/**
 * Jose Patricio Galán Rodriguez
 */

// Es una imprecisión usar var ya que el nombre de la app es una
// constante que no debería mutar
// var APP_NAME = "AppDummy"
val APP_NAME = "AppDummy"

class Pelicula {
    // Por defecto, nigún tipo acepta null
    // para permitir null, se añade ? al tipo
    //var titulo =  null
    var titulo: String? = null
    var puntuacion: Double = 0.0
}

// Para permitir retornar null se añade ? al tipo de retorno
//fun buscar(lista: List<String>): String {
fun buscar(lista: List<String>): String? {
    for (item in lista) {
        if (item.contains("Dune")) return item
    }
    return null
}

fun main() {
    // Una listOf es una colección inmutable si necesitamos añadir, eliminar
    // o modificar deberiamos de usar mutableList
    //val generos = listOf("Acción", "Drama")
    val generos : MutableList<String> = mutableListOf("Acción", "Drama")
    generos.add("Comedia")
}