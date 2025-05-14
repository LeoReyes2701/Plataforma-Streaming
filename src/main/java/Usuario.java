import java.util.List;

public class Usuario  {
    private String nombre;
    private double espacioDisponible;
    private List<ContenidoReproducible> listaFavoritos;

    // Implementamos los metodos particulares de usuarios
    public void  agregarFavorito(ContenidoReproducible contenidoReproducible) {
        listaFavoritos.add(contenidoReproducible);
        // FALTA QUE ACTUALICE EL ESTADO DE ESFAVORITO, NO SE COMO TRAERLO
    }

    public void descargarContenido(ContenidoDescargable contenidoDescargable) {

    }

    public void reproducirContenido(ContenidoReproducible contenidoReproducible) {

    }
}
