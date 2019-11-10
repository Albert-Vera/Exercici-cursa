package Dam_M_03.Cursa_2.Manager;


import Dam_M_03.Cursa_2.Model.DatosCompeti;
import Dam_M_03.Cursa_2.View.Clasificacion;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class PlayScreen  {

    public static void juego(DatosCompeti datos){//modificado

        List<DatosCompeti> clasificacion = new ArrayList<>();
        int circuitos = datos.getCircuito();
        int op = datos.getOponentes();
        new Clasificacion().cabecera();

        for (int i = 1; i < circuitos+1; i++) {     // FOR DE CIRCUITOS

            for (int j = 0; j < op; j++) {      // FOR DE OPONENTES
                int horas = obtenerTiempos(2);
                int minutos = obtenerTiempos(60);
                int segundos= obtenerTiempos(60);

                DatosCompeti datosCompeti = new DatosCompeti();

                if (j == 0){        // ESTO ES PARA EL NOMBRE JUGADOR
                    datosCompeti.setNombre(datos.getNombre());
                    datosCompeti.setCircuito(i);
                    datosCompeti.setMinutos(minutos);
                    datosCompeti.setSegundos(segundos);
                    //datosCompeti.setPuntuacion();
                    //datosCompeti.setTotalPuntuacion();
                }else {             // ESTO PARA RESTO OPONENTES
                    datosCompeti.setOponentes(j-1); // problemas con el setter +1
                    datosCompeti.setCircuito(i);
                    datosCompeti.setMinutos(minutos);
                    datosCompeti.setSegundos(segundos);
                    //datosCompeti.setPuntuacion();
                    //datosCompeti.setTotalPuntuacion();

                }
                clasificacion.add(datosCompeti);
            }
            sort(clasificacion, new CompararTiempos(clasificacion));
            int puntos= 12;
            new Clasificacion().showClasificacion(clasificacion, puntos);
            clasificacion.clear();
        }
    }

    static int obtenerTiempos(int a){
        return (int) (Math.random()*a);
    }

    public static int asignarPuntuacion(int puntos){

        if (puntos > 0){
            puntos -= 2;
        }
        return puntos;
    }
}
