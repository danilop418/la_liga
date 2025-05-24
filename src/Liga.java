import java.util.ArrayList;

public class Liga {
    private int codigoLiga;
    private String nombreLiga;
    private ArrayList<Equipo> listaEquipos;

    public Liga(int codigoLiga, String nombreLiga) {
        this.codigoLiga = codigoLiga;
        this.nombreLiga = nombreLiga;
        this.listaEquipos= new ArrayList<>();
    }

    public void addEquipos(Equipo equipo) {
        listaEquipos.add(equipo);
    }


    public Equipo buscarEquipo(int codigo) {

        for(Equipo equipo: listaEquipos){
            if(codigo == equipo.getCodigoEquipo()){
                return equipo;
            }
        }
        return null;
    }

    public int getCodigoLiga() {
        return codigoLiga;
    }

    public void setCodigoLiga(int codigoLiga) {
        this.codigoLiga = codigoLiga;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }
}
