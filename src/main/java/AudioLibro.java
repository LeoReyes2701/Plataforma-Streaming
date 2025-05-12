public class AudioLibro extends ContenidoMultimedia implements ContenidoDescargable {
    // Declaramos atributos adicionales
    private String narrador;
    private String tamanoMB;

    @Override
    double calcularPuntuacion() {
        return getVecesReproducido()*0.2;
    }

    @Override
    public String descargar() {
        return tamanoMB + " MB";
    }

    @Override //Preguntar como usar esto que se pone aca
    public int verificarEspacioRequerido() {
        return 0;
    }
}
