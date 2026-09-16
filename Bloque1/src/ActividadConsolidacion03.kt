// Código Compose con errores — identifícalos y corrígelos

// Los errores involucran: estado y recomposición, la anotación @Composable, el ámbito de LazyColumn,
// la escritura de estado durante la composición y los requisitos de @Preview. Y hay cinco errores en total.

@Composable
fun ContadorGeneros() {
    // No se puede asignar una variable común ya que Jetpack Compose no podrá rastrear los cambios,
    // la variable se incrementará en memoria pero no se activará la recomposición y no se mostrará
    // en pantalla.
    // var contador = 0
    var contador by remenber { mutableInStateOf(0)}

    Column {
        Text("Géneros seleccionados: $contador")
        Button(onClick = { contador++ }) {
            Text("Añadir")
        }
    }
}

// Hay que poner @Composable ya que sin ello no se puede invocar LazyColum ni Text.
@Composable
fun ListaGeneros(generos: List<String>) {
    LazyColumn {
        // En un LazyColumn el encabezado  debe ir dentro de un bloque item
        // Text("Listado de géneros")
        item{
            Text("Listado de géneros")
        }

        items(generos) { genero ->
            Text(genero)
        }
    }
}

@Composable
fun Resumen(generos: List<String>) {
    // Al volver a asignar la variable se vuelve a renderizar lo que vuelve a hacer que se reasigne
    // var mensaje by remember { mutableStateOf("") }
    val mensaje = if (generos.isEmpty()) "Sin géneros" else generos
    Text(mensaje)
}

@Preview
@Composable
// Las funciones Preview no pueden tener parametros obligatorios.
//fun VistaPrevia(generos: List<String>) {
fun VistaPrevia(){
    ListaGeneros(generos)
}
