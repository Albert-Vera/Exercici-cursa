package Dam_M_03.Cursa_2.Manager;

import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.Comparator;
import java.util.List;

public class CompararPuntuaciones implements Comparator<DatosCompeti> {
    public CompararPuntuaciones(List<DatosCompeti> clasificacion) {
    }

    @Override
    public int compare(DatosCompeti datos, DatosCompeti t1) {

        if (datos.getTotalPuntuacion() < t1.getTotalPuntuacion()) {
            return 1;
        } else if (datos.getTotalPuntuacion() > t1.getTotalPuntuacion()){
            return -1;
            }
        return 0;
    }
}