public class Presidente {
    private String nombre;
    private String apellidos;
    private String profesion;

    public Presidente(String nombre, String apellidos, String profesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.profesion = profesion;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
