import java.util.List;

public class PlataformaStreaming {
    private String nombre;
    private List<ContenidoReproducible> listaContenidos;
    private List<Usuario> listaUsuarios;

    void agregarContenido(ContenidoReproducible contenidoReproducible) {
        listaContenidos.add(contenidoReproducible);
    }

    void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }


}

// Falta hacer los metodos de contenidoMasPopular en adelante
