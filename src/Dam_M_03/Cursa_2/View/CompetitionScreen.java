package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.Competicion;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import static Dam_M_03.Cursa_2.Manager.Competicion.*;

public class CompetitionScreen { // CLASE SUPRIMIDA


//static DatosCompeti datos = new DatosCompeti();

    public static void configuracion(DatosCompeti datos){
        System.out.println("Introduce tu nombre: ");
        insertarJugador(datos);
        System.out.println("Introduce número de oponentes: ");
        obtenerOponentes(datos);
        System.out.println("Introduce número de circuitos: ");
        circuitos(datos);
        System.out.println("Elije con que vas a competir: ( Coche / Bicicleta / Patinete ) ");
        configVehiculo(datos);

    }

    public static void mostrarConfig(DatosCompeti datos){


        System.out.println();
        System.out.println("Tu nombre:               " + datos.getNombre());
        System.out.println("Vehiculo:                " + datos.getVehiculo());
        System.out.println("Número de participantes: " + datos.getOponentes());
        System.out.println("Número de circuitos:     " + datos.getCircuito() + "\n\n\n");


    }
}
