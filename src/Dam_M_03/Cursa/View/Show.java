package Dam_M_03.Cursa.View;

import Dam_M_03.Cursa.Manager.ConfigCompeticion;
import Dam_M_03.Cursa.Model.Circuito;
import Dam_M_03.Cursa.Model.Jugadores;
import Dam_M_03.Cursa.Model.Vehicle;

public class Show {
    static Jugadores jugadores = new Jugadores();
    static Vehicle vehicle = new Vehicle();
    static Circuito circuito = new Circuito();

    public static void configuracion(){
        System.out.println("Introduce tu nombre: ");
        ConfigCompeticion.insertarJugador();
        System.out.println("Introduce número de oponentes: ");
        jugadores.setOponentes(ConfigCompeticion.obtenerOponentes());
        System.out.println("Introduce número de circuitos: ");
        circuito.setCircuitos(ConfigCompeticion.circuitos());
        System.out.println("Elije con que vas a competir: ( Coche / Bicicleta / Patinete ) ");
        vehicle.setCategoria(ConfigCompeticion.configVehiculo());
        mostrarConfig(jugadores, circuito, vehicle);                // MUESTRA TODA LA CONFIG DE LA CARRERA
    }

    public static void mostrarConfig(Jugadores jugadores, Circuito circuito, Vehicle vehicle){

        System.out.println();
        System.out.println("Número de participantes: " + jugadores.getOponentes()+1 );
        System.out.println("Número de circuitos: " + circuito.getCircuitos());
        System.out.println("Vehiculo:   " + vehicle.getCategoria());

        // AQUI IMPRIMIR EL LISTADO DE JUGADORES ... SOLO NUMEROS Y NOMBRE JUGADOR
    }
}
