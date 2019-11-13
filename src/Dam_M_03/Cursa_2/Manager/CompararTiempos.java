package Dam_M_03.Cursa_2.Manager;

import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.util.Comparator;
import java.util.List;

public class CompararTiempos implements Comparator<DatosCompeti> {
    //DatosCompeti datosCompeti = new DatosCompeti();
    public CompararTiempos(List<DatosCompeti> clasificacion) {

    }

    @Override
    public int compare(DatosCompeti datos, DatosCompeti t1) {

        if (datos.getHoras() > t1.getHoras()) {
            return 1;
        } else {
            if (datos.getHoras() < t1.getHoras()) {
                return -1;
            } else {

                if (datos.getMinutos() > t1.getMinutos()) {
                    return 1;
                } else {
                    if (datos.getMinutos() < t1.getMinutos()) {
                        return -1;
                    } else if (datos.getSegundos() > t1.getSegundos()) {
                        return 1;
                    } else if (datos.getSegundos() < t1.getSegundos()) {
                        return -1;
                    } else return 0;
                }
            }
        }
    }
}