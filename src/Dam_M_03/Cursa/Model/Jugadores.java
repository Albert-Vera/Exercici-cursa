package Dam_M_03.Cursa.Model;

public class Jugadores {

    private String nombreJugador;
    private int oponentes;
        private int tiempo;

    public Jugadores(int tiempo) {
        this.tiempo = tiempo;
    }

    public float getTiempo() {


        return tiempo;
    }

    public void setTiempo(int tiempo) {


        tiempo = (int) (Math.random()*10);
        this.tiempo = tiempo;
    }

    public int getOponentes() {
        return oponentes;
    }

    public void setOponentes(int oponentes) {

        for (int i = 0; i < oponentes ; i++) {
            //oponentes
        }
        this.oponentes = oponentes +1;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

//    void generarNombres (int participantes-1, String nombre) {
//
//    }
//
//    sortTiempos
//    sortJugadores
}
