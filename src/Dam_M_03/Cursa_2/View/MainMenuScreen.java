package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen {
    public static void showMenu() throws IOException {
        DatosCompeti datos = new DatosCompeti();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Cursa 2019");
            System.out.println("Opciones: ");

            System.out.println(" 1. Configuració de la competició");
            System.out.println(" 2. Jugar");
            System.out.println(" 3. Resultats/Palmares");
            System.out.println(" 4. Acabar");
            System.out.println();
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();



            switch (opcion) {
                case 1: // PONER VALORES AL JUGADOR, CONFIGURAR COMPETICION
                    new CompetitionMenuScreen().configuracion(datos);
                    CompetitionMenuScreen.mostrarConfig(datos);

                    break;
                case 2: // JUGAR
                    new PlayScreen().juego(datos);
                    break;
                case 3: // RESULTADOS
                    new ScoreMenuScreen().show();
                    break;
                case 4: // SALIR
                    return;
                default:
                    System.out.println("Ese valor no es válido");
                   break;
            }
        }
    }
}
