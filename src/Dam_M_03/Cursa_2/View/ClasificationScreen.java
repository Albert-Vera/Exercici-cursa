package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.ArrayList;
import java.util.List;

public class ClasificationScreen {

    PlayScreen playScreen = new PlayScreen();
    public void cabecera(){
        System.out.println("                         --------------------------------------------------------------");
        System.out.println("                         -----                  RESULTADOS DE LAS CARRERAS        -----");
        System.out.println("                         --------------------------------------------------------------");
        System.out.println("\n     CIRCUITO        JUGADOR            TIEMPO      PUNTUACIÓN       TOTAL PUNTOS");
    }

    public void showClasificacion(List<DatosCompeti> clasificacion, int puntos){
        System.out.println();

        for (DatosCompeti resul : clasificacion){
            puntos = playScreen.asignarPuntuacion(puntos);
            resul.setPuntuacion(puntos);
            resul.setTotalPuntuacion(resul.getTotalPuntuacion()+ puntos);

            if (resul.getOponentes() == 0){
                System.out.println("          "  + resul.getCircuito()+ "         " + resul.getNombre() + "              " +  resul.getHoras()+ ":"+ resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            "+ resul.getTotalPuntuacion());
            }else {
                System.out.println("          " + resul.getCircuito() + "         Piloto " + resul.getOponentes() + "            " + resul.getHoras()+ ":"+ resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            " + resul.getTotalPuntuacion());
            }
        }
        System.out.println("\n\n");
    }

    public void showClasificacionTotal() {

    }

}
