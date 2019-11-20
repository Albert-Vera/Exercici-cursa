package Dam_M_03.Cursa_2.Manager;


import Dam_M_03.Cursa_2.Model.DatosCompeti;
import Dam_M_03.Cursa_2.View.ClasificationScreen;
import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.sort;

public class PlayScreen  {
    public List<DatosCompeti> clasificacionCopia = new ArrayList<>();

    public  void juego(DatosCompeti datos){

        List<DatosCompeti> clasificacion = new ArrayList<>();

        int circuitos = datos.getCircuito();
        int op = datos.getOponentes();
        new ClasificationScreen().cabecera();


        for (int i = 1; i < circuitos+1; i++) {     // FOR DE CIRCUITOS

            for (int j = 0; j < op; j++) {      // FOR DE OPONENTES
                int horas = obtenerTiempos(2);
                int minutos = obtenerTiempos(60);
                int segundos= obtenerTiempos(60);

                DatosCompeti datosCompeti = new DatosCompeti();

                if (j == 0){        // ESTO ES PARA EL NOMBRE JUGADOR
                    datosCompeti.setNombre(datos.getNombre());
                    datosCompeti.setCircuito(i);
                    datosCompeti.setHoras(horas);
                    datosCompeti.setMinutos(minutos);
                    datosCompeti.setSegundos(segundos);

                    for (DatosCompeti narices : clasificacionCopia) {
                        if ( narices.getOponentes() == j ){
                            datosCompeti.setTotalPuntuacion(narices.getTotalPuntuacion());
                        }
                    }
                    datosCompeti.setTotalPuntuacion(datosCompeti.getTotalPuntuacion());
                }else {             // ESTO PARA RESTO OPONENTES
                    datosCompeti.setOponentes(j-1); // problemas con el setter +1
                    datosCompeti.setCircuito(i);
                    datosCompeti.setHoras(horas);
                    datosCompeti.setMinutos(minutos);
                    datosCompeti.setSegundos(segundos);

                    for (DatosCompeti narices : clasificacionCopia) {
                        if ( narices.getOponentes() == j ){
                            datosCompeti.setTotalPuntuacion(narices.getTotalPuntuacion());
                        }
                    }
                }
                datosCompeti.setVehiculo(datos.getVehiculo());
                clasificacion.add(datosCompeti);
            }
            sort(clasificacion, new CompararTiempos(clasificacion));
            int puntos= 12;

            clasificacionCopia = new ArrayList<>(clasificacion);
            new ClasificationScreen().showClasificacion(clasificacion, puntos);
            clasificacion.clear();
        }

    }


    static int obtenerTiempos(int a){
        return (int) (Math.random()*a);
    }

    public int asignarPuntuacion(int puntos){

        if (puntos > 0){
            puntos -= 2;
        }
        return puntos;
    }


}
