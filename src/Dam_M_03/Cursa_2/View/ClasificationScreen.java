package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.ArrayList;
import java.util.List;

public class ClasificationScreen {

    public void cabecera(){
        System.out.println("     CIRCUITO        JUGADOR            TIEMPO      PUNTUACIÓN");
    }
//    puntuacionTotal = puntuacion+puntuacionTotal;
//
//    participante[] nombre puntuacionTotal;
//
//
//    fori{
//        participantes[];
//    }

    public void showClasificacion(List<DatosCompeti> clasificacion, int puntos, ArrayList<String> puntuaciones){
        System.out.println();

        for (DatosCompeti resul : clasificacion){
            puntos = PlayScreen.asignarPuntuacion(puntos);
            resul.setPuntuacion(puntos);

            if (resul.getOponentes() == 0){
                puntuaciones.add(resul.getNombre()+" "+resul.getPuntuacion());
                System.out.println("          "  + resul.getCircuito()+ "         " + resul.getNombre() + "              " +  resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            "+ resul.getTotalPuntuacion());
            }else
                puntuaciones.add(resul.getOponentes()+" "+resul.getPuntuacion());
                System.out.println("          "  + resul.getCircuito()+ "         Piloto " + resul.getOponentes() + "            " +  resul.getMinutos() + ":" + resul.getSegundos() + "          " + resul.getPuntuacion() + "            "+ resul.getTotalPuntuacion());
        }
    }

    public void showClasificacionTotal() {

    }

}
