package Dam_M_03.Cursa.View;

import Dam_M_03.Cursa.Manager.ConfigCompeticion;
import Dam_M_03.Cursa.Model.Circuito;
import Dam_M_03.Cursa.Model.Jugadores;
import Dam_M_03.Cursa.Model.Vehicle;

public class Show_Eliminar {
    static Jugadores jugadores = new Jugadores();
    static Vehicle vehicle = new Vehicle();
    static Circuito circuito = new Circuito();

    public static void configuracion(){
        System.out.println("Introduce tu nombre: ");
//        jugadores.setNombreJugador(ConfigCompeticion.insertarJugador());
        System.out.println("Introduce número de oponentes: ");
        jugadores.setOponentes(ConfigCompeticion.obtenerOponentes());
        System.out.println("Introduce número de circuitos: ");
        circuito.setCircuitos(ConfigCompeticion.circuitos());
        System.out.println("Elije con que vas a competir: ( Coche / Bicicleta / Patinete ) ");
        vehicle.setCategoria(ConfigCompeticion.configVehiculo());
//        mostrarConfig(jugadores, circuito, vehicle);                // MUESTRA TODA LA CONFIG DE LA CARRERA
    }

}
