package Dam_M_03.Cursa.Manager;

import Dam_M_03.Cursa.Model.Circuito;
import Dam_M_03.Cursa.Model.*;

import java.util.Scanner;

public class Competicion {
    private Scanner sc = new Scanner(System.in);
    static Jugadores jugador =  new Jugadores();
    public static void insertarJugador(Scanner sc){

        jugador.setNombreJugador(sc.nextLine());

    }

    public static int obtenerOponentes(Scanner sc){

        return sc.nextInt();

    }

    public static int circuitos(){

        return sc.nextInt();
    }

    public static String configVehiculo(){

        String cosa="";
        while ( !cosa.equals("Coche") && !cosa.equals("Bicicleta") && !cosa.equals("Patinete")) {
            cosa = sc.nextLine();

            if (!cosa.equals("Coche") && !cosa.equals("Bicicleta") && !cosa.equals("Patinete")){
                System.out.println("     ***   INTRODUCE SOLO Coche / Bicicleta / Patinete   **** ");
            }
        }
        return cosa;
    }
}
