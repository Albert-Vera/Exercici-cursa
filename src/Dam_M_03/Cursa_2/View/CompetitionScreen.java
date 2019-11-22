package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.Competicion;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import static Dam_M_03.Cursa_2.Manager.Competicion.*;

public class CompetitionScreen { // CLASE SUPRIMIDA

Competicion competicion = new Competicion();


    public void configuracion(DatosCompeti datos){
        System.out.println("Introduce tu nombre: ");
        competicion.insertarJugador(datos);
        System.out.println("Introduce número de oponentes: ");
        competicion.obtenerOponentes(datos);
        System.out.println("Introduce número de circuitos: ");
        competicion.circuitos(datos);

    }

    public void mostrarConfig(DatosCompeti datos){

        System.out.println("                         --------------------------------------------------------------");
        System.out.println("                         -----                  TU CONFIGURACIÓN                  -----");
        System.out.println("                         --------------------------------------------------------------");
        System.out.println("                                     Tu nombre:                    " + datos.getNombre());
        System.out.println("                                     Número de participantes:      " + datos.getOponentes());
        System.out.println("                                     Número de circuitos:          " + datos.getCircuito());
        System.out.println("                         --------------------------------------------------------------\n\n\n");

    }
}
