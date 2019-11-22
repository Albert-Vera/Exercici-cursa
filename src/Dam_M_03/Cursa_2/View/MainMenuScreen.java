package Dam_M_03.Cursa_2.View;

import Dam_M_03.Cursa_2.Manager.Competicion;
import Dam_M_03.Cursa_2.Manager.PlayScreen;
import Dam_M_03.Cursa_2.Model.DatosCompeti;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuScreen {
    PlayScreen playScreen = new PlayScreen();
    CompetitionScreen competitionScreen = new CompetitionScreen();
    Competicion competicion = new Competicion();
    ShowConfigurarVehiculo showConfigurarVehiculo = new ShowConfigurarVehiculo();


    public  void showMenu() throws IOException {
        DatosCompeti datos = new DatosCompeti();
        Scanner sc = new Scanner(System.in);
        boolean primeropcion = false;
        boolean segundaopcion = false;

        while (true) {
            System.out.println("Cursa 2019");
            System.out.println("Opciones: ");
            System.out.println(" 1. Configuració de la competició");
            System.out.println(" 2. Jugar");
            System.out.println(" 3. Resultats/Palmares");
            System.out.println(" 4. Acabar");
            System.out.println();
            System.out.print("Elige una opción: ");

            int opcion = leerScanner();



            while (opcion == 1 || primeropcion || opcion == 4) {
                switch (opcion) {
                    case 1: // PONER VALORES AL JUGADOR, CONFIGURAR COMPETICION
                        competitionScreen.configuracion(datos);
                        primeropcion = true;
                        competitionScreen.mostrarConfig(datos);
                        break;
                    case 2: // JUGAR
                        showConfigurarVehiculo.showConfig();
                        competicion.configVehiculo(datos);
                         playScreen.juego(datos);
                         segundaopcion=true;
                        break;
                    case 3: // RESULTADOS
                        if (segundaopcion) {
                            new ScoreScreen(playScreen).show();
                        }
                        break;
                    case 4: // SALIR
                        return;
                    default:
                        System.out.println("Ese valor no es válido");
                        break;
                }
                break;
            }
            if (!primeropcion) {
                System.out.println("                        ------------------------------");
                System.out.println("                        Primer configura la competició");
                System.out.println("                        ------------------------------");
            }
            if (!segundaopcion & primeropcion) {
                System.out.println("                        ------------------------------");
                System.out.println("                               Primer has de jugar");
                System.out.println("                        ------------------------------");
            }
        }


    }
    public int leerScanner(){

        Scanner sc = new Scanner(System.in);
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
        return numero;
    }
}
