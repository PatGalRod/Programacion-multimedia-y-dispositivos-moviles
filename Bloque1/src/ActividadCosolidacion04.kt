Actividad de consolidación del bloque 1 del módulo PMDM. Responde de forma razonada a cinco cuestiones sobre Modifier, el sistema de diseño Material 3 y las animaciones en Compose.

ENTREGA: Sube en un archivo de texto las cinco respuestas numeradas. Cada respuesta debe ocupar como máximo dos líneas.

Tema objetivo
Evaluación
No es necesario escribir una aplicación completa: se valora la explicación, no el proyecto. Puedes apoyarte en la documentación oficial de Compose .

Actividad de consolidación#
1 – Reparto del espacio#
En un Row que ocupa todo el ancho disponible hay dos elementos hijos, uno con Modifier.weight(1f) y otro con Modifier.weight(2f). ¿Qué fracción del ancho ocupa cada uno?

Al ser un total de 3f el primero ocuparía 1/3 y el segundo 2/3


2 – Orden de los modificadores#
Queremos un cuadro con 48.dp de contenido, separado 16.dp del borde de su contenedor. ¿Cuál de estas dos cadenas lo consigue y por qué?

Esta es la correcta ya que el orden de los modificadores afecta al resultado visual, de esta manera se aplica el padding
al contenedor y luego se guarda el espacio para el contenido.
Modifier.padding(16.dp).size(48.dp)

De esta forma primero se crea el espacio para el contenedor y luego se aplica el padding hacía dentro lo cual quita espacio
al contenido
Modifier.size(48.dp).padding(16.dp)


3 – Colores del tema#
En un Card de la aplicación aparece la siguiente línea. Explica por qué no es correcta en una aplicación Material 3 y escribe la línea que debería sustituirla.

Está mal porque utiliza un color hardcodeado y hay que usar siempre los del tema para que el modo oscuro funcione automaticamente
containerColor = Color(0xFF6650A4)
containerColor = MaterialTheme.colorScheme.surfaceVariant


4 – Elección de la animación#
Debemos mostrar y ocultar un panel de filtros con una transición. ¿Utilizarías AnimatedVisibility o animateFloatAsState? Justifica la elección en una línea.

El elemento componible AnimatedVisibility anima la aparición y la desaparición de su contenido.


5 – Indicadores de progreso#
Estamos descargando un archivo y conocemos en todo momento el porcentaje completado. ¿Qué indicador de progreso usarías y qué parámetro lo diferencia del otro modo de funcionamiento?

ProgressIndicator y usaría el parametro LinearProgressIndicator ya que CircularProgressIndicator es para esperas de duración desconocida