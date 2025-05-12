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

    // Implementamos los metodos de la interface
    @Override
    public String descargar() { //Preguntar por que el "public" no se puede quitar
        if (resolucion==ResolucionType._4K) {
            return 5000+ " MB";
        }else{
            return 2000 + " MB";
        }
    }

    @Override
    public int verificarEspacioRequerido() { //Preguntar sobre esto
        return 0;
    }
}
