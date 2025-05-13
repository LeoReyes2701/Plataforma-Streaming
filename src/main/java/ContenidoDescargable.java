public interface ContenidoDescargable {
    double descargar(); // Retorna el tamaño del contenido en MB
    boolean verificarEspacioRequerido(double espacioDisponible); //Verifica si hay suficiente espacio para la descarga; lanza una excepción si no lo hay

}

// Solo peliculas y audiolibros implementan esta interface
