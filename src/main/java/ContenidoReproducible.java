public interface ContenidoReproducible {
    // Aca solo se declaran los metodos mas no se implementan
    void reproducir();
    void pausar();
    int obtenerDuracion();
    String obtenerTitulo();
    String obtenerGenero();
    boolean esFavorito();
}

// Todos los tipos de contenido deben implementar esta interfaz.