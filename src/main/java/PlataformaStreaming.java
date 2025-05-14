import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming {
    private String nombrePlataforma;
    private List<ContenidoMultimedia> contenidosPlataforma;
    private List<Usuario> listaUsuarios;


    // Preguntar al profe por el this, y como interpretar los parametros
    public PlataformaStreaming(List<ContenidoMultimedia> contenidosPlataforma, List<Usuario> listaUsuarios) {
        this.contenidosPlataforma = contenidosPlataforma;
        this.listaUsuarios = listaUsuarios;
    }

    public void agregarContenido(ContenidoMultimedia contenidoMultimedia) {
        contenidosPlataforma.add(contenidoMultimedia);
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public ContenidoMultimedia obtenerContenidoMasPopular(){
        double maxPopularidad = 0;
        ContenidoMultimedia contenidoMasPopular = null;

        for (ContenidoMultimedia cadaContenido :  contenidosPlataforma){
            double popularidadActual = cadaContenido.calcularPuntuacion();
            if (popularidadActual > maxPopularidad){
                maxPopularidad = popularidadActual;
                contenidoMasPopular = cadaContenido;
            }
        }
        return contenidoMasPopular;
    }

    public List<ContenidoMultimedia> buscarPorGenero(String genero){
        List<ContenidoMultimedia> contenidosPorGenero = new ArrayList<>(); // Esto es para crear un array vacio
        for (ContenidoMultimedia cadaContenido :  contenidosPlataforma ){
            if (genero.equals(cadaContenido.obtenerGenero())){
                contenidosPorGenero.add(cadaContenido);
            }
        }
        return contenidosPorGenero;
    }

    public int vecesReproducidoTotalPlataforma() {
        int totalVecesReproducido = 0;
        for (ContenidoMultimedia cadaContenido :  contenidosPlataforma ){
            totalVecesReproducido = totalVecesReproducido + cadaContenido.getVecesReproducido();
        }
        return totalVecesReproducido;
    }

    public double promedioPuntuaciones() {
        double puntos = 0;
        for (ContenidoMultimedia cadaContenido :  contenidosPlataforma ){
            puntos = puntos + cadaContenido.calcularPuntuacion();
        }
        if (contenidosPlataforma.size() > 0){
            return puntos/contenidosPlataforma.size();
        }else{
            return puntos; //Preguntar si es mejor hacer un sout
        }

    }

    public void generarReporte(){
        String contenidoMasPopular = obtenerContenidoMasPopular().getTitulo();
        System.out.println("El contenido mas popular es: " + contenidoMasPopular + "\n");
        System.out.println("\n");
        System.out.println("El total de reproducciones de la plataforma: " + vecesReproducidoTotalPlataforma() + "\n");
        System.out.println("\n");
        System.out.println("El promedio de puntuaciones: " + promedioPuntuaciones() + "\n");
        }
    }

    // Preguntar porque me pone el nombre del archivo en rojoo

