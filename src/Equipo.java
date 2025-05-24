import java.util.ArrayList;

public class Equipo {
    private int codigoEquipo;
    private String nombreEquipo;
    private int telefono;
    private Presidente presidente;
    private Entrenador entrenador;
    private ArrayList<Jugador> listaJugadores;

    public Equipo(int codigoEquipo, String nombreEquipo, int telefono, Presidente presidente, Entrenador entrenador) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.telefono = telefono;
        this.presidente = presidente;
        this.entrenador = entrenador;
    }

    public void addJugadores(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "codigoEquipo=" + codigoEquipo +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", telefono=" + telefono +
                ", presidente=" + presidente +
                ", entrenador=" + entrenador +
                ", listaJugadores=" + listaJugadores +
                '}';
    }
}
