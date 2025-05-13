public class AudioLibro extends ContenidoMultimedia implements ContenidoDescargable {
    // Declaramos atributos adicionales
    private String narrador;
    private double tamanoMB;

    @Override
    double calcularPuntuacion() {
        return getVecesReproducido()*0.2;
    }

    @Override
    public double descargar() {
        return tamanoMB;
    }

    @Override //Preguntar como usar esto que se pone aca
    public boolean verificarEspacioRequerido(double espacioDisponible) {
        if (espacioDisponible>descargar()) {
            return true;
        }else{
            return false;
        }
    }
}
