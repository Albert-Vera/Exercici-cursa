package Dam_M_03.Cursa_2.Manager;

import Dam_M_03.Cursa_2.Model.*;

import java.util.Scanner;

import static Dam_M_03.Cursa_2.Model.DatosCompeti.*;

public class Competicion {
    DatosCompeti datosCompeti = new DatosCompeti();
    private  Scanner sc = new Scanner(System.in);


    public  void insertarJugador(DatosCompeti datos){
        datos.setNombre(sc.nextLine());

    }

    public  void obtenerOponentes(DatosCompeti datos){

        datos.setOponentes(sc.nextInt());

    }

    public void circuitos(DatosCompeti datos){
        datos.setCircuito( sc.nextInt());
    }

    public void  configVehiculo(DatosCompeti datos){

        String cosa="";

        while ( !cosa.equals("Coche") && !cosa.equals("Bicicleta") && !cosa.equals("Patinete")) {
            cosa = sc.nextLine();

            if (!cosa.equals("Coche") && !cosa.equals("Bicicleta") && !cosa.equals("Patinete")){
                System.out.println("                       ***   INTRODUCE SOLO Coche / Bicicleta / Patinete   **** ");
            }
        }
        datos.setVehiculo(cosa);

    }
}
