public class Pelicula extends ContenidoMultimedia implements ContenidoDescargable{
    // Declaramos los atributos adicionales
    private String director;
    private ResolucionType resolucion;

    // Implementamos metodo particular de pelicula
    public double calcularPuntuacion() {
        if (resolucion==ResolucionType._4K) {
            return getVecesReproducido()*0.5+10;
        }else{
            return getVecesReproducido()*0.5;
        }
    }

    // Implementamos los metodos de la interfacee
    @Override
    public double descargar() {
        if (resolucion==ResolucionType._4K) {
            return 5000;
        }else{
            return 2000;
        }
    }

    @Override
    public boolean verificarEspacioRequerido(double espacioDisponible) { //Preguntar sobre esto
        if (espacioDisponible>descargar()) {
            return true;
        }else{
            return false;
        }
    }
}
