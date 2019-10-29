package Dam_M_03.Cursa.View;

import Dam_M_03.Cursa.Manager.*;

import java.util.Scanner;

public class IniciarPartida {
    static void menu(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre:");
        System.out.println("ALbert");
        System.out.println("Vehiculo:");
        System.out.println("bicicleta");
        while (true) {
            System.out.println("Cursa 2019");
            System.out.println("Opciones: ");

            System.out.println("1. Añade jugadores");
            System.out.println(" 1. Configuració de la competició");
            System.out.println(" 2. Resultats/Palmarès");
            System.out.println(" 3. Jugar");
            System.out.println(" 4. Acabar");
            System.out.println();
            System.out.print("Elige una opción: ");
            int opcion = entrada.nextInt();

            new Jugador_Inicial().iniciar_Jugador();

            switch (opcion) {
                case 1:
                    new Configuracio().configurar();
                    break;
                case 2:
                    new Participantes().configurarParticipantes();

                case 3: // pantalla
                    new Resultats().palmares();
                    break;

                case 4: //
                    new Escoger_Vehiculo().seleccionarVehiculo();

                case 5: //
                    new Jugar().iniciarJoc();
                    break;

                case 6: //
                    new Clasificacion().mostrarClasificacion();
                case 7: //
                    new CaracteristicasCircuitos().verCircuitos();
                case 8: //
                    System.exit(0);

                default:
                   break;
            }
        }
    }
}
