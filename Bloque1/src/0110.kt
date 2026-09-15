// Jose Patricio Galán Rodríguez

// Crea una clase “libro” (autor, título, año), con setters personalizados que establezcan
// los valores por defecto “Anónimo”, “No indicado” y -1 cuando se les asigne un valor vacío o no válido.
// Crea también un método que devuelva los tres datos en una misma línea, comenzando por el título,
// separados por espacios y guiones, como en “It – Stephen King – 1986”.

class Libro(val autor: String = "Anónimo", val titulo: String = "No indicado",
            val anyoPublicacion : Int = -1){

    fun descripcion() : String = "$titulo - $autor - $anyoPublicacion"
}
fun main(){
    val libro = Libro()
    val libro1 = Libro("Stephen king", "It", 1986)
    val libro2 = Libro("Michael Ende", "La historia interminable", 1979)
    val libro3 = Libro("Orson Scott Card", "El juego de Ender", 1985)

    println(libro.descripcion())
    println(libro1.descripcion())
    println(libro2.descripcion())
    println(libro3.descripcion())
}