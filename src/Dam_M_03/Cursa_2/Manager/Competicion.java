package Dam_M_03.Cursa_2.Manager;

import Dam_M_03.Cursa_2.Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Dam_M_03.Cursa_2.Model.DatosCompeti.*;

public class Competicion {
    private  Scanner sc = new Scanner(System.in);


    public  void insertarJugador(DatosCompeti datos){

        String nombre = "";

        while (nombre.equals("")) {
            nombre = sc.nextLine();
            datos.setNombre(nombre);
        }
    }

    public  void obtenerOponentes(DatosCompeti datos){

        boolean repetir= true;
        String texto = "";
        int numero = 0;

        while (repetir) {
            try {
                texto = sc.nextLine();
                numero = Integer.parseInt(texto);
                repetir = false;
            } catch (NumberFormatException e) {
                System.out.println("Ese valor no es válido");
            }
        }

        datos.setOponentes(numero);
    }

    public void circuitos(DatosCompeti datos){
        boolean repetir= true;
        String texto = "";
        int numero = 0;

        while (repetir) {
            try {
                texto = sc.nextLine();
                numero = Integer.parseInt(texto);
                repetir = false;
            } catch (NumberFormatException e) {
                System.out.println("Ese valor no es válido");
            }
        }

        datos.setCircuito(numero);
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
