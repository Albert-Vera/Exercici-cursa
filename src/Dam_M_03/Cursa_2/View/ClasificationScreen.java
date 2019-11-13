package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.List;

public class ClasificationScreen {

    public void cabecera(){
        System.out.println("     CIRCUITO        JUGADOR            TIEMPO      PUNTUACIÓN      TOTAL PUNTOS");
    }

    public void showClasificacion(List<DatosCompeti> clasificacion, int puntos){
        System.out.println();
        int puntosTotales;
        for (DatosCompeti resul : clasificacion){
            puntos = PlayScreen.asignarPuntuacion(puntos);
            resul.setPuntuacion(puntos);
            puntosTotales = resul.getTotalPuntuacion();
            resul.setTotalPuntuacion(puntosTotales = puntosTotales + puntos);

            if (resul.getOponentes() == 0){
                System.out.println("          "  + resul.getCircuito()+ "         " + resul.getNombre() + "              " +  resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            "+ resul.getTotalPuntuacion());
            }else
                System.out.println("          "  + resul.getCircuito()+ "         Piloto " + resul.getOponentes() + "            " +  resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            "+ resul.getTotalPuntuacion());
        }
    }
}
