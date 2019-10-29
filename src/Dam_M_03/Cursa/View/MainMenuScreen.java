package Dam_M_03.Cursa.View;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen {
    public static void showMenu() throws IOException {

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
                    new CompetitionMenuScreen().show();
                    break;
                case 2: // JUGAR
                    new PlayMenuScreen().show();
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
