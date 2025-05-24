import java.time.LocalDate;

public class Partido {
    private int codigoPartido;
    private LocalDate fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(int codigoPartido, LocalDate fecha, Equipo equipoLocal) {
        this.codigoPartido = codigoPartido;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
    }

    public int getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(int codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "codigoPartido=" + codigoPartido +
                ", fecha=" + fecha +
                ", equipoLocal=" + equipoLocal +
                '}';
    }
}
