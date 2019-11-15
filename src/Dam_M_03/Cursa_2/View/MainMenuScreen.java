package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen {
    PlayScreen playScreen = new PlayScreen();

    public  void showMenu() throws IOException {
        DatosCompeti datos = new DatosCompeti();
        Scanner sc = new Scanner(System.in);
        boolean b = false;

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

            while (opcion == 1 || b || opcion == 4) {
                switch (opcion) {
                    case 1: // PONER VALORES AL JUGADOR, CONFIGURAR COMPETICION
                        new CompetitionScreen().configuracion(datos);
                        b = true;
                        CompetitionScreen.mostrarConfig(datos);
                        break;
                    case 2: // JUGAR
                         playScreen.juego(datos);
                        break;
                    case 3: // RESULTADOS
                        new ScoreScreen(playScreen).show();
                        break;
                    case 4: // SALIR
                        return;
                    default:
                        System.out.println("Ese valor no es válido");
                        break;
                }
                break;
            }
            if (b == false) {
                System.out.println("------------------------------");
                System.out.println("Primer configura la competició");
                System.out.println("------------------------------");
            }
        }
    }
}
