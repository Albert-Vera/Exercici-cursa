package Dam_M_03.Cursa.Model;

import java.util.ArrayList;

public class Jugadores {

    private ArrayList<String> nombreJugador = new ArrayList<String>();
    //Como se hace un array list de jugadores con un constructor
    // Podria ser la primera vez un constructor normal
    // Despues recorrer un for que sea Piloto 1..4
    private int oponentes;
    // Donde ponemos la puntuación??
    // Esto sera un array list

    public int getOponentes() {
        return oponentes+1;
    }

    public void setOponentes(int oponentes) {
        this.oponentes = oponentes;
    }

    public String getNombreJugador(/*Esto sigue estando mal*/String s) {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}
