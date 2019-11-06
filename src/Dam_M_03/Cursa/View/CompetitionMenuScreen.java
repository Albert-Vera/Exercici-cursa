package Dam_M_03.Cursa.View;

import Dam_M_03.Cursa.Manager.Competicion;
import Dam_M_03.Cursa.Model.Circuito;
import Dam_M_03.Cursa.Model.Jugadores;
import Dam_M_03.Cursa.Model.Vehicle;

public class CompetitionMenuScreen { // CLASE SUPRIMIDA

    static Jugadores jugadores = new Jugadores();
    static Vehicle vehicle = new Vehicle();
    static Circuito circuito = new Circuito();

    public static void configuracion(){
        System.out.println("Introduce tu nombre: ");
        Competicion.insertarJugador();
        System.out.println("Introduce número de oponentes: ");
        jugadores.setOponentes(Competicion.obtenerOponentes());
        System.out.println("Introduce número de circuitos: ");
        circuito.setCircuitos(Competicion.circuitos());
        System.out.println("Elije con que vas a competir: ( Coche / Bicicleta / Patinete ) ");

        vehicle.setCategoria(Competicion.configVehiculo());
        mostrarConfig(jugadores, circuito, vehicle);                // MUESTRA TODA LA CONFIG DE LA CARRERA
    }

    public static void mostrarConfig(Jugadores jugadores, Circuito circuito, Vehicle vehicle){

        System.out.println();
        System.out.println("Vehiculo:                " + vehicle.getCategoria());
        System.out.println("Número de participantes: " + (jugadores.getOponentes()) );
        System.out.println("Número de circuitos:     " + circuito.getCircuitos() + "\n\n\n");


    }
}
