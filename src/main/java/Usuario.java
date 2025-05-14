import java.util.List;

public class Usuario  {
    private String nombre;
    private double espacioDisponible;
    private List<ContenidoReproducible> listaFavoritos;

    // Implementamos los metodos particulares de usuarioss
    public void  agregarFavorito(ContenidoReproducible contenidoReproducible) {
        listaFavoritos.add(contenidoReproducible);
        contenidoReproducible.esFavorito();
        // PREGUNTAR A DANNY
    }


    // Mostrar a Danny a ver que tal
    public void descargarContenido(ContenidoDescargable contenidoDescargable) {
        if (contenidoDescargable.verificarEspacioRequerido(espacioDisponible)) {
            espacioDisponible = espacioDisponible - contenidoDescargable.descargar();
        }else{
            System.out.println("Espacio insuficiente");
        }
    }

    public void reproducirContenido(ContenidoReproducible contenidoReproducible) {
        contenidoReproducible.reproducir();
    }
}
