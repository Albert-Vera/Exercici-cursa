package Dam_M_03.Cursa.View;

import Dam_M_03.Cursa.Manager.Configuracio;
import Dam_M_03.Cursa.Model.Jugador;
import Dam_M_03.Cursa.Model.Jugador.*;

public class Jugador_Inical {
    public Jugador_Inical() {
        Jugador jugador = new Jugador();
    }

    public void iniciarJugador() {

        // PRINTAR MENU SOLICITANDO NOMBRE JUGADOR, NUMERO DE CIRCUITO PARA COMPETICION
        //

        // LUEGO IR AL MANAGER A LEER LOS DATOS AQUI SOLO PRINTAR MENUç

        String nom;
        Jugador jugador = new Jugador();
        nom = jugador.getNombre();

        Configuracio.añadirJugador(nom); // AQUI DESPUES DE LEER LOS DATOS LOS ENVIA AL MANAGER A GUARDARLOS EN ARCHIVO
    }
}
