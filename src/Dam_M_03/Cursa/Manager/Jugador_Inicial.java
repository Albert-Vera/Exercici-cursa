package Dam_M_03.Cursa.Manager;

import Dam_M_03.Cursa.Model.Jugador;
import Dam_M_03.Cursa.Model.Strings;
import Dam_M_03.Cursa.View.Print_Jugador_ini;

import java.util.Scanner;

public class Jugador_Inicial {


    public void iniciar_Jugador(){

        Scanner in = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Strings string = new Strings();
        Print_Jugador_ini print = new Print_Jugador_ini();

        Print_Jugador_ini.print_iniciarJugador(string.getText_1());

        jugador.getNombre(in.nextLine());
    }

}
