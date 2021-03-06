package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.CompararPuntuaciones;
import Dam_M_03.Cursa_2.Manager.CompararTiempos;
import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class ScoreScreen {

   PlayScreen ps = new PlayScreen();

    public ScoreScreen(PlayScreen playScreen) {
        ps = playScreen;
    }

    void show(){
        sort(ps.clasificacionCopia, new CompararPuntuaciones(ps.clasificacionCopia));

        System.out.println("                   #################################################################");
        System.out.println("                                  Clasificación del Mundial de: " + ps.clasificacionCopia.get(0).getVehiculo());
        System.out.println("                   #################################################################");
        System.out.println("\n                     Posición       PARTICIPANTES                     PUNTUACIÓN TOTAL   ");
        for (int i = 0; i < ps.clasificacionCopia.size(); i++) {
            if (0 == (ps.clasificacionCopia.get(i).getOponentes())) {
                System.out.println("                         " + (i+1) + "          " +ps.clasificacionCopia.get(i).getNombre()+"                                   "+ps.clasificacionCopia.get(i).getTotalPuntuacion());
            }
            else {
                System.out.println("                         " + (i+1) + "           Piloto "+ps.clasificacionCopia.get(i).getOponentes()+"                                "+ps.clasificacionCopia.get(i).getTotalPuntuacion());
            }
        }

    }
}
