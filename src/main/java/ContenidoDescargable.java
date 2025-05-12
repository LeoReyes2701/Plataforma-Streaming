public interface ContenidoDescargable {
    String descargar(); // Retorna el tamaño del contenido en MB
    int verificarEspacioRequerido(); //Verifica si hay suficiente espacio para la descarga; lanza una excepción si no lo hay

}

// Solo peliculas y audiolibros implementan esta interface
