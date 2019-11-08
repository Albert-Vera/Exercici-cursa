package Dam_M_03.Cursa.Manager;

import Dam_M_03.Cursa.Model.Jugadores;

import java.util.ArrayList;
import java.util.List;

import static Dam_M_03.Cursa.Manager.Competicion.jugador;

public class Jugar {

    Jugadores jugadores;

    public Jugar() {
      jugadores =  jugador;
    }
    // Circuito 1
    // tiempo nombre_jugador+puntuacion
    //puntuaciongeneral


    //  NOMBRE     TIEMPO        PUNTOS       CLASIFICACIONMUNDIAL
    //  Al
    // Piloto 2
    // METODOS:     OBTENER TIEMPO

    public static void main(String[] args) {

//
//        for (int i = 0; i < nºcircuitos; i++) {
//
//            for (Jugadores jugador : listajudares) {
//
//                // obetener tiempo
//
//            }
//
//        }
//        // metodo obtener puntos sobre el tiempo obtenido

        List<Jugadores> = obtenerTiempo();
        sortTiempos(tiempos);


    }

    static List<Integer> obtenerTiempo(){

        List<Integer> tiempos = new ArrayList<Integer>();

        for (int i = 0; i < jugador.getOponentes(); i++) {
            tiempos.add((int) jugador.getTiempo());
        }
        return tiempos;
    }

    List<String> obtenerJugadores(){

            List<String> oponentes  = new ArrayList<>();
        //setopenent
        oponentes.add(jugadores.getNombreJugador());
        for (int i = 0; i < jugador.getOponentes()-1; i++) {
            oponentes.add("Piloto "+i+1);
        }
        return oponentes;
    }

    static void sortTiempos(){


    }

}
