public class Jugador {
    private String nombre;
    private String apellidos;
    private int numCamiseta;

    public Jugador(String nombre, String apellidos, int numCamiseta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCamiseta = numCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numCamiseta=" + numCamiseta +
                '}';
    }
}
