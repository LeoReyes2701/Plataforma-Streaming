public class Serie extends ContenidoMultimedia{
    private int temporadas;
    private int episodiosPorTemporadas;

    public double calcularPuntuacion() {
        return getVecesReproducido()*0.3+5*temporadas;
    }
}
