public abstract class ContenidoMultimedia implements ContenidoReproducible{
    // Declaramos los atributos
    private String titulo;
    private String genero;
    private int duracion;
    private int vecesReproducido;
    private boolean esFavorito;  //Indica si está en la lista de favoritos de algún usuario

    // Declaramos el metoodo abstracto
    abstract double calcularPuntuacion();

    // Implementamos un metodo protegido-----------PREGUNTAR QUE VA ACA!!!!!!!
    protected void registrarInteraccion() {
    }

    // Aca van los getters
    public String getTitulo() {return titulo;}
    public int getVecesReproducido() {
        return vecesReproducido;
    }


    // Implementamos los metodos de la inteface
    @Override
    public void reproducir() {
        vecesReproducido++;
    }

    @Override
    public void pausar() {
        System.out.println("Contenido pausado");
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String obtenerGenero() {
        return genero;
    }

    @Override
    public boolean esFavorito() {
        return esFavorito;
    }
}
