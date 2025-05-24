import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Presidente presidente = new Presidente(" Carlos ", " Perez ", " entrenador ");
        Entrenador entrenador = new Entrenador(" Javier ", " Lopez ", LocalDate.of(1990, 5, 1));
        Liga liga = new Liga(123, " Liga ");

        Presidente presidente2 = new Presidente(" Carlos ", " Perez ", " entrenador ");
        Entrenador entrenador2 = new Entrenador(" Javier ", " Lopez ", LocalDate.of(1990, 5, 1));

        liga.addEquipos(new Equipo(345, " Real Ávila ", 6574231, presidente, entrenador));
        liga.addEquipos(new Equipo(678, " Real Madrid ", 6574567, presidente2, entrenador2));

        System.out.println(" El equipo que hemos buscado es: " + liga.buscarEquipo(345));
        System.out.println(" Los equipos de la Liga: " + liga.getListaEquipos());
    }
}
